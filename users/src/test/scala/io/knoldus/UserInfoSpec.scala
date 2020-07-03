package io.knoldus
import org.scalatest._

object UserInfoSpec extends FlatSpec with Matchers {

  "getStatus" should "return running" in {
    UserInfo.getStatus shouldBe "running"
  }
}
