package controllers

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class UsersSpec extends Specification {

  "Users controller" should {
    "display a list of all users" in new WithApplication {
      val users = route(FakeRequest(GET, "/users")).get

      status(users) must equalTo(OK)
      contentType(users) must beSome.which(_ == "text/html")
      contentAsString(users) must contain ("Our List of Users")
      contentAsString(users) must contain ("Al")
      contentAsString(users) must contain ("Darren")
      contentAsString(users) must contain ("Rich")
    }
  }
}