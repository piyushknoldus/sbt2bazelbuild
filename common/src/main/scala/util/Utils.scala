package util

object Utils {

  def getNamebyId(id: Int): String = {
    id match {
      case 1 => "BAZEL"
      case 2 => "SBT"
      case 3 => "UNKNOWN"
    }
  }
}
