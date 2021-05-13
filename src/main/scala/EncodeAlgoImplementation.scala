trait RunLengthEncoder {

  /** Run-length encode a string.
    * @param s The string to encode
    * @return None, if 's' could not be encoded because it contained
    * invalid characters,
    * otherwise Some(encodedString) with the encoded version
    * of the string.
    */
  def encodeString(s: String): Option[String]

}

class RunLengthEncoderImp extends RunLengthEncoder {

  def encodeString(line: String): Option[String] = {
       return Some("")
  }

  private def reduce(lst: List[(String, Int)]): List[(String, Int)] =
    lst match {
      case List() => Nil
      case _ => {
        val prim = lst.head
        val secon = if (lst.tail.size > 0) lst.tail.head else (Nil, 0)
        if (prim._1.equals(secon._1)) {
          reduce((prim._1, prim._2 + secon._2) :: lst.tail.tail)
        } else prim :: reduce(lst.tail)
      }
    }

  def isAllDigits(x: String) = x forall Character.isLetter

}
