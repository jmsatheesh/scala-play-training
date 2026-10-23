package services

import models.*

object SchemePortfolioService {

  def getActiveSchemes(schemes: List[SchemeDetails]): List[SchemeDetails] =
    schemes.filter(_.isActive)

  def findSchemeByReference(
      schemes: List[SchemeDetails],
      referenceNumber: String
  ): Option[SchemeDetails] =
    schemes.find(_.referenceNumber == referenceNumber)

}
