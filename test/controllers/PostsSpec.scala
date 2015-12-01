package controllers

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import play.api.test.{FakeRequest, WithApplication}
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class PostsSpec extends Specification {

  "Posts controller" should {
    "display the first post" in new WithApplication {
      val post = route(FakeRequest(GET, "/blog")).get

      status(post) must equalTo(OK)
      contentType(post) must beSome.which(_ == "text/html")
      contentAsString(post) must contain ("My first post!")
      contentAsString(post) must contain ("This is my first post")
    }
  }
}