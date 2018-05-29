import org.scalatest.{MustMatchers, WordSpec}

class StationsSpec extends WordSpec with MustMatchers {

  "Stations" must {

    "return 'No, seriously, run. You will miss it.' when given no stations" in {
      Stations.checker(Array("")) mustEqual "No, seriously, run. You will miss it."
    }

    "return 'No, seriously, run. You will miss it.' when given two stations" in {
      Stations.checker(Array("Rejection", "Disappointment")) mustEqual "No, seriously, run. You will miss it."
    }

    "return 'Smell my cheese you mother!' when given all stations" in {
      Stations.checker(Array("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")) mustEqual "Smell my cheese you mother!"
    }


    "return 'Smell my cheese you mother!' when given all stations in a different order" in {
      Stations.checker(Array("Disappointment", "Backstabbing Central", "Shattered Dreams Parkway", "Rejection")) mustEqual "Smell my cheese you mother!"
    }

    "return 'Smell my cheese you mother!' when given all stations and more" in {
      Stations.checker(Array("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway","Covent Garden")) mustEqual "Smell my cheese you mother!"
    }


  }

}
