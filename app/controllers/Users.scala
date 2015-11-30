package controllers

import models.User
import play.api.mvc.{Action, Controller}

class Users extends Controller {

  def users = Action {
    Ok(views.html.users(User.getAll))
  }
}
