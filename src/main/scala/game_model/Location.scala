package game_model
import game_model.Types.*

class Location (
                 val name: String,
                 val invariant: Constraint = v => true, 
                 val flow: Flow = Map()
               ){

}
