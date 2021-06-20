import scala.math.abs

class PetMatcher {
  def getMatchPercentage(human:Creature, pet:Creature): Double ={
    val matchScore = Map(0->1.0, 1->0.5, 2->0.0)
    // get match percent for a given pet
    val humanAttributes = human.getAttributes();
    val dogAttributes = pet.getAttributes();
    val totalAttributes = humanAttributes.length;
    var percentMatch = 0.0;
    for (i <- 0 until totalAttributes){
      val matchNum = Math.abs(dogAttributes(i) - humanAttributes(i));
      percentMatch += matchScore(matchNum);
     }
    percentMatch/totalAttributes

  }

  def getTopPets(): Unit ={
    // get pet data from database
    // for data in pet data get top 3 max and save to list
    // return top 3 max list
  }

}
