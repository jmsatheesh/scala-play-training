import models.*
object Day13SetMap extends App {

  var schemeNumber: Set[String] = Set("S1001", "S1002", "S1003", "S1001")
  println(s"Number of elements:${schemeNumber.size}")
  println(s"Check element S1002: ${schemeNumber.contains("S1002")}")

  var newScheme = Set("S1004") + schemeNumber
  println(s"Added new elements:${newScheme.size}")
  var removeScheme = schemeNumber - "10001"
  println(s"Removed a elements:${removeScheme.size}")

  println(s"Number of elements in the oriiginal set:${schemeNumber.size}")

  val schemeMebers: Map[String, SchemeDetails] = Map(
    "S1001" -> SchemeDetails("Alpha Pension Scheme", "S1000000001", 120, true),
    "S1002" -> SchemeDetails("Beta Pension Scheme", "S1000000002", 80, true),
    "S1003" -> SchemeDetails("Gamma Pension Scheme", "S1000000003", 0, false)
  )

  println(s"Originial ${schemeMebers}")
  println(s"Scheme details for S1002 ${schemeMebers("S1002")}")
  println(s"Scheme details for S999 ${schemeMebers.getOrElse("S999", 0)}")

  val updatedSchemes: Map[String, SchemeDetails] = Map(
    "S1004" -> SchemeDetails("Delta Pension Scheme", "S1000000004", 250, true)
  ) ++ schemeMebers

  println(s"Before update S1001 ${schemeMebers("S1001")}")

  val updatedSchemesMember: Map[String, SchemeDetails] = updatedSchemes ++ Map(
    "S1001" -> SchemeDetails("Alpha Pension Scheme", "S1000000001", 500, true)
  )

  println(updatedSchemesMember)

  println(s" After update S1001 ${updatedSchemesMember("S1001")}")
  println(s"Originial ${schemeMebers}")

}
