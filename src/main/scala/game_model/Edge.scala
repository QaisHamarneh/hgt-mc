package game_model
import Types.*

class Edge(
           val name: String,
           val start: Location,
           val guard: Constraint = v => true,
           val decision: Decision,
           val jump: DiscreteAssignment = v => v,
           val end: Location,
         ){
}
