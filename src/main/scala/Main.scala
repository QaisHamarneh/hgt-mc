import game_model.Types.*
import game_model.{Edge, Game, Location}

object Main extends App {
  val l0 = Location("l0")
  val locations: List[Location] = List(l0)
  val players = List(1, 2)
  val variables  = List("x", "y", "z")
  val actions = List("a", "b", "c", "d")

  val edges: List[Edge] = List(Edge(name="e", 
                                    start=l0, 
                                    decision=Map(1 -> "a", 2 -> "b"),
                                    end=l0))


  val g:Game =
    Game(locations, l0, variables, Map("x" -> 3, "y" -> 3, "z" -> 3), players, actions, List())



  println("Hello, World!")
  println(g)
}
