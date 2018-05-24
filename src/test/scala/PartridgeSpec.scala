import org.scalatest._

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "return 'Lynn, I've pierced my foot with a spike' when no related terms found" in {
      Partridge.terms(Array()) mustEqual "Lynn, I've pierced my foot with a spike"
    }

    "return 'Mine's a Pint!' when one Alan related term is found" in {
      Partridge.terms(Array("Partridge")) mustEqual "Mine's a Pint!"
    }

  }

}
