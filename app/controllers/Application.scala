package controllers

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hello World!"))
  }

  def links() = Action {
    Ok(views.html.links())
  }

  def functionDemo = Action {
    Ok(views.html.function(sayHello))
  }

  def sayHello = <p>Hello, via a function</p>

}