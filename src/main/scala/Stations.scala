object Stations {

  def checker(input : Array[String]) : String = {

    val stations = List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

    val matches = input.intersect(stations)

    if (matches.toSet == stations.toSet){
      "Smell my cheese you mother!"
    } else
      "No, seriously, run. You will miss it."
  }

}
