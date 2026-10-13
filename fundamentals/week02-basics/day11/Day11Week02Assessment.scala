import models.BenefitApplication
import models.ApplicationStatus.*
import models.ApplicationType.*

object Day11Week02Assessment extends App {

  val app1 =
    BenefitApplication.createNew(
      "Ref1",
      "App1",
      HousingSupport,
      5000.00
    )

  println(s"Applicant Name: ${app1.applicantName}")
  println(s"Application Type: ${app1.applicationType}")
  println(s"Status Message: ${app1.statusMessage()}")
  println(s"Manual Review Required: ${app1.requiresManualReview()}")

  val app2 =
    BenefitApplication(
      "Ref2",
      "App2",
      HousingSupport,
      4000.00,
      UnderReview
    )

  println(s"Applicant Name: ${app2.applicantName}")
  println(s"Application Type: ${app2.applicationType}")
  println(s"Status Message: ${app2.statusMessage()}")
  println(s"Manual Review Required: ${app2.requiresManualReview()}")

  val app3 =
    BenefitApplication(
      "Ref3",
      "App3",
      HousingSupport,
      60000.00,
      UnderReview
    )

  println(s"Applicant Name: ${app3.applicantName}")
  println(s"Application Type: ${app3.applicationType}")
  println(s"Status Message: ${app3.statusMessage()}")
  println(s"Manual Review Required: ${app3.requiresManualReview()}")

  val app4 =
    BenefitApplication(
      "Ref4",
      "App4",
      HousingSupport,
      60000.00,
      Approved
    )

  val app5 =
    BenefitApplication(
      "Ref5",
      "App5",
      HousingSupport,
      500001.00,
      Rejected
    )

}
