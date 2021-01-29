name := "testingassignment"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

lazy val company = project.in(file("company")).settings(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  libraryDependencies += "org.mockito" % "mockito-all" % "1.8.4"
)