package util

import org.scalatest.{FlatSpec, Matchers}

object UtilsSpec extends FlatSpec with Matchers {

  "UtilsSpec getNamebyId" should "return bazel when id = 1" in {
    Utils.getNamebyId(1) == "BAZEL"
  }

  "UtilsSpec getNamebyId" should "return sbt when id = 2" in {
    Utils.getNamebyId(2) == "SBT"
  }

  "UtilsSpec getNamebyId" should "return unknown when id = 3" in {
    Utils.getNamebyId(3) == "UNKNOWN"
  }
}
