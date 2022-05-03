package org.rrajesh1979.demo

object Basics {

  // Primitive types
  val aBool: Boolean = true
  val aChar: Char = 'a'
  val aFloat: Float = 1.1f                            // 4 bytes
  val aDouble: Double = 1.1332523523523523            // 8 bytes
  val aLong: Long = 1_000_000_000_000_000L            // 8 bytes
  val aShort: Short = 100                             // 2 bytes
  val aByte: Byte = 1                                 // 1 byte
  val aInt: Int = 1                                   // 4 bytes
  val aUnit: Unit = ()

  // String
  val aString: String = "Hello"

  def main(args: Array[String]): Unit = {
    println(aLong)
    println(aDouble)
  }
}
