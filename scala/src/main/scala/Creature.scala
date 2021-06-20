class Creature(name:String, walking:Int, dogs:Int, kids:Int, cats:Int) {

  def getAttributes(): List[Int] ={
    List(walking, dogs, kids, cats)
  }

}
