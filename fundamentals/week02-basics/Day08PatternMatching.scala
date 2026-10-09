object Day08PatternMatching extends App {

  def statusMessage(schemeStatus: String): String = schemeStatus match
    case "Active"   => "Scheme is ready"
    case "Inactive" => "Scheme is inactive"
    case "Pending"  => "Scheme is awaiting approval"
    case "Closed"   => "Scheme is closed"
    case _          => "Unknown scheme status"

  def statusCode(schemeStatus: String): Int = schemeStatus match
    case "Active"   => 1
    case "Inactive" => 2
    case "Pending"  => 3
    case "Closed"   => 4
    case _          => 0

  val checkStatus = "Active"
  println(s" Scheme Status: ${checkStatus}")
  println(s" Scheme Message: ${statusMessage(checkStatus)}")
  println(s" Scheme Code: ${statusCode(checkStatus)}")

}
