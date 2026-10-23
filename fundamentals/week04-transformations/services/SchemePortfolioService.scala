package services

import models.*

object SchemePortfolioService extends App {

  def getActiveSchemes(schemes: List[SchemeDetails]): List[SchemeDetails] =
    schemes.filter(_.isActive)
}
