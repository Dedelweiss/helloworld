package exception.scala

class Foo:
    def foo[T <: this.type](): String = ???
    
    def foo2[T <: Foo](): Int = ???
    
    def foo3[T <: String](): Unit = ???
    
    def foo4(text: this.type): Unit = ???
    
// object Foo2:
//     def NoFoo(): Unit = ???
