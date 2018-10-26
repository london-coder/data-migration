name := "data-migration"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.16"
lazy val akkaStreamVersoin = "2.5."

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-streams" % akkaStreamVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
