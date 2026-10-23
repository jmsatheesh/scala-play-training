import models.*
import services.*

object IntegratedAssessment extends App {

  val schemes: List[SchemeDetails] = List(
    SchemeDetails("Alpha Pension Scheme", "S1001", 120, true),
    SchemeDetails("Beta Pension Scheme", "S1002", 80, false),
    SchemeDetails("Gamma Pension Scheme", "S1003", 250, true),
    SchemeDetails("Delta Retirement", "S1004", 0, false),
    SchemeDetails("Epsilon Pension", "S1005", 500, true),
    SchemeDetails("Zeta Pension", "S1006", 120, true)
  )

  val activeSchemes = SchemePortfolioService.getActiveSchemes(schemes)
  println(s"Active Schemes:${activeSchemes}")

  val findScheme =
    SchemePortfolioService.findSchemeByReference(schemes, "S1001")
  println(s"Find Schemes:${findScheme}")

  val checkInactiveExists =
    SchemePortfolioService.hasInactiveSchemes(schemes)
  println(s"Find Inactive exists:${checkInactiveExists}")

}
