package models

import models.ApplicationStatus.*

case class BenefitApplication(
    references: String,
    applicantName: String,
    applicationType: ApplicationType,
    annualIncome: Double,
    status: ApplicationStatus
) {

  def statusMessage(): String =
    status match {
      case Submitted   => "Application has been submitted"
      case UnderReview => "Application is being reviewed"
      case Approved    => "Application has been approved"
      case Rejected    => "Application has been rejected"
    }

  def requiresManualReview(): Boolean =
    status match
      case UnderReview if annualIncome > 50000 => true
      case _                                   => false

}
object BenefitApplication {

  def createNew(
      reference: String,
      applicantName: String,
      applicationType: ApplicationType,
      annualIncome: Double
  ): BenefitApplication =
    BenefitApplication(
      reference,
      applicantName,
      applicationType,
      annualIncome,
      Submitted
    )
}
