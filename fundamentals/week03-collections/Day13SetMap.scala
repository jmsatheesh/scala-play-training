import models.*

object Day13SetMap extends App {

  // Part A: Set operations
  val schemeNumber: Set[String] =
    Set("S1001", "S1002", "S1003", "S1001")

  println(s"Number of elements: ${schemeNumber.size}")
  println(s"Check element S1002: ${schemeNumber.contains("S1002")}")

//Adding a new scheme
  val newScheme = schemeNumber + "S1004"
  println(s"Added new elements: $newScheme")

//removing a new scheme
  val removeScheme = schemeNumber - "S1001"
  println(s"Remaining elements: $removeScheme")

  println(s"Original Set: $schemeNumber")

  // Part B: Map operations
  val schemeMembers: Map[String, SchemeDetails] = Map(
    "S1001" -> SchemeDetails("Alpha Pension Scheme", "S1000000001", 120, true),
    "S1002" -> SchemeDetails("Beta Pension Scheme", "S1000000002", 80, true),
    "S1003" -> SchemeDetails("Gamma Pension Scheme", "S1000000003", 0, false)
  )

  println(s"Original Map: $schemeMembers")
  println(s"Scheme details for S1002: ${schemeMembers("S1002")}")
  println(s"Scheme S9999 exists: ${schemeMembers.contains("S9999")}")

//adding a new Map
  val updatedSchemes = schemeMembers ++ Map(
    "S1004" -> SchemeDetails("Delta Pension Scheme", "S1000000004", 250, true)
  )

  println(s"After adding S1004: $updatedSchemes")

  // Update S1001 while preserving the other fields
  val originalScheme = updatedSchemes("S1001")
  val revisedScheme = originalScheme.copy(memberCount = 500)

  val updatedSchemesMember =
    updatedSchemes + ("S1001" -> revisedScheme)

  println(s"Updated S1001: ${updatedSchemesMember("S1001")}")
  println(s"Original S1001: ${schemeMembers("S1001")}")

  // Part C: Reusable methods
  def isRegistered(
      schemes: Set[String],
      reference: String
  ): Boolean = {
    schemes.contains(reference)
  }

  def getMemberCount(
      schemes: Map[String, SchemeDetails],
      reference: String
  ): Int = {
    if (schemes.contains(reference)) {
      schemes(reference).memberCount
    } else {
      0
    }
  }

  println(s"Is S1002 registered? ${isRegistered(schemeNumber, "S1002")}")
  println(s"Is S9999 registered? ${isRegistered(schemeNumber, "S9999")}")

  println(s"S1001 member count: ${getMemberCount(schemeMembers, "S1001")}")
  println(s"S9999 member count: ${getMemberCount(schemeMembers, "S9999")}")
}
