name := "vrouter-simu"

version := "0.1"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "scala sbt Repository" at "http://dl.bintray.com/sbt/sbt-plugin-releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "junit" % "junit" % "4.11" % "test"
)

retrieveManaged := true

initialCommands in console := """
  import test._
"""

// unmanagedResourceDirectories in Compile <+= baseDirectory( _ / "src" )
unmanagedResourceDirectories in Compile <<= Seq(scalaSource in Compile).join

