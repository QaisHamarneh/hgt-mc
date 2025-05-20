package game_model
import Types.*

class Game (
            val locations: List[Location],
            val initial_location: Location,
            val variables: List[Variable],
            val initial_valuation: Map[Variable, Double],
            val players: List[Player],
            val actions: List[Action],
            val edges: List[Edge]
          ) {

  override def toString =
    s"Game($locations, $initial_location, $variables, $initial_valuation, $players, $actions, $edges)"
}
