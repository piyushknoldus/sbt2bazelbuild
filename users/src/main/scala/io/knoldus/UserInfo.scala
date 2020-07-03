package io.knoldus

import util.Utils

object UserInfo extends App {
  println("App in state "+ getStatus)

  for(x <- 1 to 3)
  println(s"For ID =$x , name = " + getUserInfo(x))

  def getUserInfo(userId: Int): String = {
    Utils.getNamebyId(userId)
  }

  def getStatus: String = "Running"
}
