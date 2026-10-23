package services

import models.*
import scala.compiletime.ops.string

object SchemePortfolioService {

  def getActiveSchemes(schemes: List[SchemeDetails]): List[SchemeDetails] =
    schemes.filter(_.isActive)

  def findSchemeByReference(
      schemes: List[SchemeDetails],
      referenceNumber: String
  ): Option[SchemeDetails] =
    schemes.find(_.referenceNumber == referenceNumber)

  def hasInactiveSchemes(schemes: List[SchemeDetails]): Boolean =
    schemes.exists(x => x.isActive == false)

  def getUniqueRegisteredSchemes(
      newScheme: List[String],
      schemes: List[SchemeDetails]
  ): List[SchemeDetails] = {

    val uniqueSchemes: Set[String] = newScheme.toSet
    val schemeLookup: Map[String, SchemeDetails] =
      schemes.map(s => s.referenceNumber -> s).toMap
    uniqueSchemes.toList.flatMap(ref => schemeLookup.get(ref))

  }

}
