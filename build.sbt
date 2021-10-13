val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "debug",
    version := "0.0.1",
    scalaVersion := scala3Version,
    scalacOptions ++= Seq(
      "-encoding", "utf8",
      "-Xfatal-warnings",
      "-deprecation",
      "-unchecked",
    ),
    Compile / scalaSource := baseDirectory.value / "src"
  )
