object Day05IntegratedAssessment extends App {

  val schemeName = "Test Scheme"
  val memberCount = 150
  val schemeIsActive = true
  val schemeAlreadySubmitted = false
  val contributionRate = 30

  def totalContribution(
      memberCount: Double,
      contributionRate: Double
  ): Double = {
    memberCount * contributionRate
  }
  def schemeSize(memberCount: Int): String = {
    if (memberCount > 199) "Large"
    else if (memberCount > 99) "Medium"
    else "Small"
  }

  def canSubmitReturn(
      schemeIsActive: Boolean,
      memberCount: Int,
      schemeAlreadySubmitted: Boolean
  ): Boolean = {
    schemeIsActive && memberCount > 0 && !schemeAlreadySubmitted
  }

  def schemeMessage(
      schemeIsActive: Boolean,
      memberCount: Int,
      schemeIsAlreadySubmitted: Boolean
  ): String = {
    if (!schemeIsActive) "Scheme is Inactive"
    else if (memberCount == 0) "No Members in Scheme"
    else if (schemeIsAlreadySubmitted)
      "Scheme Already Submitted"
    else "Ready to Submit"
  }

  def contributionLevel(totalContribution: Double): String = {
    if (totalContribution >= 300000) "High"
    else if (totalContribution >= 100000) "Medium"
    else "Low"
  }

  println(s"Scheme Name: $schemeName")
  println(s" Memeber Count: $memberCount")
  println(s" Scheme Size: ${schemeSize(memberCount)}")
  println(
    s" Total Contribution: £${totalContribution(memberCount, contributionRate)}"
  )
  println(
    s" contribution Level: ${contributionLevel(totalContribution(memberCount, contributionRate))}"
  )
  println(
    s" Can Submit Return: ${canSubmitReturn(schemeIsActive, memberCount, schemeAlreadySubmitted)}"
  )
  println(
    s" Submission Message: ${schemeMessage(schemeIsActive, memberCount, schemeAlreadySubmitted)}"
  )

}
