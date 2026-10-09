case class Member(
    name: String,
    age: Int,
    isActive: Boolean,
    contribution: Double
)

object Day09PatternMatchingCaseClass extends App {

  def memberCategory(member: Member): String = member match
    case member if !member.isActive                    => "Inactive Member"
    case member if member.isActive && member.age >= 60 => "Senior Member"
    case member if member.isActive && member.contribution >= 10000 =>
      "High Contribution Member"
    case _ =>
      "Standard Active Member"

  val member1 = Member("Alice", 65, false, 12000)
  println(s"Member: ${member1.name}, Category: ${memberCategory(member1)}")
  val member2 = Member("Bob", 60, true, 8000)
  println(s"Member: ${member2.name}, Category: ${memberCategory(member2)}")
  val member3 = Member("Charlie", 30, true, 10001)
  println(s"Member: ${member3.name}, Category: ${memberCategory(member3)}")
  val member4 = Member("David", 45, true, 5000)
  println(s"Member: ${member4.name}, Category: ${memberCategory(member4)}")

}
