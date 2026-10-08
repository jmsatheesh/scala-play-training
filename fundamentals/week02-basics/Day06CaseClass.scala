case class PensionScheme(
    schemeName: String,
    memberCount: Int,
    annualContribution: Double,
    isActive: Boolean,
    schemeAlreadySubmitted: Boolean
)
object Day06CaseClasses extends App {

  val testScheme = PensionScheme("Test Scheme", 100, 30000, true, false)
  println(s"Scheme Name: ${testScheme.schemeName}")
  println(s"Member Count: ${testScheme.memberCount}")
  println(s"Active status: ${testScheme.isActive}")
  println(
    s"Annual Contribution per member: £${testScheme.annualContribution}"
  )

  def totalContribution(scheme: PensionScheme): Double = {
    scheme.memberCount * scheme.annualContribution
  }

  def schemeSize(scheme: PensionScheme): String = {
    if (scheme.memberCount > 199) "Large"
    else if (scheme.memberCount > 99) "Medium"
    else "Small"
  }

  def canSubmitReturn(
      scheme: PensionScheme
  ): Boolean = {
    scheme.isActive && scheme.memberCount > 0 && !scheme.schemeAlreadySubmitted
  }

  def schemeSubmissionMessage(
      scheme: PensionScheme
  ): String = {
    if (!scheme.isActive) "Scheme is Inactive"
    else if (scheme.memberCount == 0) "No Members in Scheme"
    else if (scheme.schemeAlreadySubmitted)
      "Scheme Already Submitted"
    else "Ready to Submit"
  }
  println(s"Scheme Name: ${testScheme.schemeName}")
  println(s"Member Count: ${testScheme.memberCount}")
  println(s"Scheme Size: ${schemeSize(testScheme)}")
  println(s"Total Contribution: £${totalContribution(testScheme)}")
  println(s"Active Status: ${testScheme.isActive}")
  println(s"Can Submit: ${canSubmitReturn(testScheme)}")
  println(s"Submission Message: ${schemeSubmissionMessage(testScheme)}")

}
