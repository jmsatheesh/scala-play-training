object Day01ValuesAndTypes extends App {
  val name = "TestUser"
  val memeberId: Int = 12345
  val age: Int = 30
  val annualsalary = 75000.50
  val contributionRate = 7.5
  val isActive = true

  val annualContribution = annualsalary * contributionRate / 100

  println(
    s"Memeber $name ID  $memeberId contributes  £${annualContribution} per year"
  )
}
