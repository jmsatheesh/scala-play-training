object Day04ifelse extends App {
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
}
