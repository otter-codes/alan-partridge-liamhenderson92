object Partridge extends App {

  def terms(input: Array[String]) : String = {

    val searchWords = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    val count = input.count(x => searchWords contains x)
    val ex = "!" * count

    if (count == 0) {
    "Lynn, I've pierced my foot with a spike"
    } else
      s"Mine's a Pint${ex}"
  }
}
