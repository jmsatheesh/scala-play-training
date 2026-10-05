object Day03Expressions extends App {
  def calculateMonthlyContribution(
      annualSalary: Double,
      contributionRate: Double
  ): Double = {
    val annualContribution = annualSalary * contributionRate / 100
    val monthlyContribution = annualContribution / 12
  }

  val sal = calculateMonthlyContribution(75000.50, 7.5)
  val sal2 = calculateMonthlyContribution(100000.00, 10.0)
  println(
    s"Member contributes £${sal} per month"
  )
  println(
    s"Member contributes £${sal2} per month"
  )
}
