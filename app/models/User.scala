package models

case class User(name: String)

object User {

  def getAll = List(User("Al"), User("Darren"), User("Rich"))

}