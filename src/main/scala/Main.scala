import org.apache.commons.lang3.StringUtils
// import org.scalatest.Assertion
// import org.scalatest.wordspec.AnyWordSpec

object ExternalLibraryExample extends App:
  val str = "Hello, World!"
  
  val reversedStr = StringUtils.reverse(str)
  
  def printReversed(str: String) = 
    println(StringUtils.reverse(str))
    
  printReversed(str)


// trait Ctx

// object Ops:
//   extension (i: Int)
//     def foo() = i + 1
//   extension (using Ctx)(i: Int)
//     def bar() = i + 2
//   extension (i: Int)(using Ctx)
//     def baz() = i + 3