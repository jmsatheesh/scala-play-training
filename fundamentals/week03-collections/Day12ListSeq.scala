import models.SchemeDetails

object Day12ListSeq extends App {
  val schemes: List[SchemeDetails] = List(
    SchemeDetails("Alpha Pension Scheme", "S1000000001", 120, true),
    SchemeDetails("Beta Pension Scheme", "S1000000002", 80, true),
    SchemeDetails("Gamma Pension Scheme", "S1000000003", 0, false),
    SchemeDetails("Delta Pension Scheme", "S1000000004", 250, true)
  )

  println(s"Schme Count:${schemes.size}")
  println(s"First Scheme: ${schemes.head}")
  println(s"Second Scheme: ${schemes(1)}")
  println(s"List is Empty: ${schemes.isEmpty}")

  val updatedSchemes: List[SchemeDetails] =
    SchemeDetails("Fith Pension Scheme", "S1000000005", 140, true)
      :: schemes

  println(s"Schme Count:${schemes.size}")
  println(s"First Scheme: ${updatedSchemes.head}")

  def FindFirstSchmeName(schemes: Seq[SchemeDetails]): String =
    if !schemes.isEmpty then schemes.head.schemeName
    else ""

  println(s"First scheme Name is: ${FindFirstSchmeName(updatedSchemes)}")

}
