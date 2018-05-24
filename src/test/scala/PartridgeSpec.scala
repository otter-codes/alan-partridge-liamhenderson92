import org.scalatest._

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "return 'Lynn, I've pierced my foot with a spike' when no related terms found" in {
      Partridge.terms(Array("")) mustEqual "Lynn, I've pierced my foot with a spike"
    }

    "return 'Mine's a Pint!' when one Alan related term is found" in {
      Partridge.terms(Array("Partridge")) mustEqual "Mine's a Pint!"
    }

    "return 'Mine's a Pint!!' when two Alan related terms are found" in {
      Partridge.terms(Array("Partridge", "PearTree")) mustEqual "Mine's a Pint!!"
    }

    "return 'Mine's a Pint!!!!' when four Alan related terms are found" in {
      Partridge.terms(Array("Lynn", "Nomad", "Dan", "Chat")) mustEqual "Mine's a Pint!!!!"
    }

    "return 'Mine's a Pint!!!!!!!!' when four Alan related terms are found" in {
      Partridge.terms(Array("Lynn", "Nomad", "Dan", "Chat", "Partridge", "PearTree", "Toblerone", "AlphaPapa")) mustEqual "Mine's a Pint!!!!!!!!"
    }

  }
}
