val name = "liam"

s"Hello $name"

s"Hello ${name}"

val list1 = List("a","b","c")
val list2 = List("b","c","d")

list1.intersect(list2)

//val stations = List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")
//
//val input = List("Rejection", "Disappointment","BI")
//
//val matches = stations.intersect(input)

val stations = List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

stations.toSet

val input = List("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

val matches = input.intersect(stations)

matches.toSet

if (matches == stations){
  "Smell my cheese you mother!"
} else
  "No, seriously, run. You will miss it."
