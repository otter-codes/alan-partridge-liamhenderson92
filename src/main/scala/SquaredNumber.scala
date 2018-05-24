object SquaredNumber {

  def calculator(input: Any) : String = {

    val toInt = input.toString.toInt

    toInt match {
      case x if x * x <= 1000 => "Help yourself to a honeycomb Yorkie from the glovebox"
      case _ => "It's hotter than the sun!!"
    }
  }

}
