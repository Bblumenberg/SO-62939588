name := "scala_guice_playground"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.2.3",
  "com.google.inject.extensions" % "guice-assistedinject" % "4.2.3",
  "net.codingwell" %% "scala-guice" % "4.2.11"
)