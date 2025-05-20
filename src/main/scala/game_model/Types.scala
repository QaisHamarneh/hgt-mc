package game_model

object Types {
  type Variable = String
  type Action = String
  type Player = Int
  type Valuation = Map[Variable, Double]
  type Constraint = Valuation => Boolean
  type Decision = Map[Player, Action]
  type Flow =  Map[Variable, Valuation => Double]
  type DiscreteAssignment = Valuation => Valuation
  type Config = (Location, Valuation)
}
