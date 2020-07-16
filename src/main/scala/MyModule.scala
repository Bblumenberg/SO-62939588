import com.google.inject.{AbstractModule, Provides, Singleton}
import net.codingwell.scalaguice.ScalaModule

class MyModule extends AbstractModule with ScalaModule {
  @Provides
  @Singleton
  def providesInjectedString: String = "I was injected!"

  @Provides
  @Singleton
  def providesFooFactory(injectedString:String): String => Foo =
    Foo(injectedString)
}