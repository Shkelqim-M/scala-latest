ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

lazy val root = (project in file("."))
  .settings(name := "scala-latest")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"