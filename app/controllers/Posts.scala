package controllers

import play.api.mvc.{Action, Controller}

class Posts extends Controller {

  def firstPost = Action {
    Ok(views.html.post("My first post!", "This is my first post"))
  }
}