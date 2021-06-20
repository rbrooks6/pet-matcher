import org.scalatest.FunSuite

class PetMatcherTest extends FunSuite{
  test("PetMatcher.getMatchPercentage"){
    // Rick, likes walking, might get another dog, doesn't like kids, has cats
    val human = new Creature("Rick", 2, 1, 0, 2);
    // Fido likes walking, doesn't like dogs, neutral about kids, doesn't like cats
    val dog = new Creature("Fido", 2, 0, 1, 0);
    val pet_match = new PetMatcher
    assert(pet_match.getMatchPercentage(human, dog) == .5);
  }

}
