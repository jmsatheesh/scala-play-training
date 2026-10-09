case class PensionScheme(
    schemeName: String,
    memberCount: Int,
    annualContribution: Double,
    isActive: Boolean,
    schemeAlreadySubmitted: Boolean
)

object PensionScheme {

  val MaximumSupportedMemberCount = 10000

  def createTestScheme(): PensionScheme = {
    PensionScheme("Test Scheme", 0, 0, false, false)
  }
  def activeSchemeWithMembers(): PensionScheme = {
    PensionScheme("Active Scheme", 100, 30000, true, false)
  }

}
