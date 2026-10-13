object Day10SealedTraitsEnums extends App {
  sealed trait SchemeStatus

  object SchemeStatus {
    case object Active extends SchemeStatus
    case object Pending extends SchemeStatus
    case object Suspended extends SchemeStatus
    case object Closed extends SchemeStatus
  }

  case class PensionScheme(
      schemeName: String,
      memberCount: Int,
      annualContribution: Double,
      status: SchemeStatus
  ) {
    def schemeStatusMessage(): String = status match {
      case SchemeStatus.Active  => s"The scheme $schemeName is active."
      case SchemeStatus.Pending =>
        s"The scheme $schemeName is pending approval."
      case SchemeStatus.Suspended =>
        s"The scheme $schemeName is currently suspended."
      case SchemeStatus.Closed => s"The scheme $schemeName has been closed."
    }

    def canSubmitReturn(): Boolean = status match {
      case SchemeStatus.Active if memberCount > 0 => true
      case _                                      => false
    }
  }

  val activeScheme =
    PensionScheme("Active Scheme", 100, 5000.0, SchemeStatus.Active)
  val pendingScheme =
    PensionScheme("Pending Scheme", 50, 3000.0, SchemeStatus.Pending)

  println(
    s"Scheme Name ${activeScheme.schemeName} , Status: ${activeScheme.schemeStatusMessage()} Can Submit Return: ${activeScheme.canSubmitReturn()}"
  )
  println(
    s"Scheme Name ${pendingScheme.schemeName} , Status: ${pendingScheme.schemeStatusMessage()} Can Submit Return: ${pendingScheme.canSubmitReturn()}"
  )
}
