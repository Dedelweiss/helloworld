import org.apache.commons.lang3.StringUtils
// import org.scalatest.Assertion
// import org.scalatest.wordspec.AnyWordSpec

object ExternalLibraryExample extends App:
  val str = "Hello, World!"
  
  val reversedStr = StringUtils.reverse(str)
  
  def printReversed(str: String) = 
    println(StringUtils.reverse(str))
    
  printReversed(str)


