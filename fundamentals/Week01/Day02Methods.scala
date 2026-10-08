object Day02Methods extends App {
  def calculateAnnualContribution(
      annualSalary: Double,
      contributionRate: Double
  ): Double = {
    annualSalary * contributionRate / 100
  }

  val Sal1 = calculateAnnualContribution(75000.50, 7.5)
  val Sal2 = calculateAnnualContribution(100000.00, 10.0)

  println(
    s"Member contributes £${Sal1} per year"
  )
  println(
    s"Member contributes £${Sal2} per year"
  )

}
