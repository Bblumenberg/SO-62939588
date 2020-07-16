case class Foo(injectedValue:String)(passedValue:String) {
  override def toString: String = "Foo(" + injectedValue + ")(" + passedValue + ")"
}
