import org.scalatest.{MustMatchers, WordSpec}

class SquaredNumberSpec extends WordSpec with MustMatchers {

  "SquaredNumber" must {

    "return 'Help yourself to a honeycomb Yorkie from the glovebox' when given a number less than 1000" in {
      SquaredNumber.calculator(31) mustEqual "Help yourself to a honeycomb Yorkie from the glovebox"
    }

    "return 'It's hotter than the sun!!' when given a number more than 1000" in {
      SquaredNumber.calculator(32) mustEqual "It's hotter than the sun!!"
    }


  }

}
