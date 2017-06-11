import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.tarabaconsulting",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "ScalaConfig",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.typesafe" % "config" % "1.3.1"
    ),
    assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false),
    test in assembly := {}    
  )
