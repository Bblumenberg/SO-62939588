import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions._

object Main {
  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new MyModule)

    val passedString = "I was passed in!"
    val foo: Foo = injector.instance[String => Foo].apply(passedString)
    println(foo)
  }
}