case class PensionScheme(
    schemeName: String,
    memberCount: Int,
    annualContribution: Double,
    isActive: Boolean,
    schemeAlreadySubmitted: Boolean
)

object PensionScheme {

  val MaximumSupportedMemberCount = 10000

  def createDefault(): PensionScheme = {
    PensionScheme("Test Scheme", 0, 0, false, false)
  }

  def createActiveScheme(
      schemeName: String,
      memberCount: Int,
      annualContribution: Double
  ): PensionScheme = {
    PensionScheme(schemeName, memberCount, annualContribution, true, false)
  }

  def canSubmitReturn(
      scheme: PensionScheme
  ): Boolean = {
    scheme.isActive && scheme.memberCount > 0 && !scheme.schemeAlreadySubmitted
  }

}

object Day07CompanionObject extends App {

  val defaultScheme = PensionScheme.createDefault()
  println(s"Default Scheme: $defaultScheme")
  val customScheme =
    PensionScheme.createActiveScheme("Custom Scheme", 200, 50000)
  println(s"Custom Scheme: $customScheme")
  println(s"Can submit Return: ${PensionScheme.canSubmitReturn(customScheme)}")
  println(
    s"Maximum supported Member Count: ${PensionScheme.MaximumSupportedMemberCount}"
  )

}
