name := "data-migration"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.17"
lazy val akkaStreamVersion = "2.5.17"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaStreamVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "language:higherKinds",
  "-Ypartial-unification",
  "-encoding", "UTF-8"
)