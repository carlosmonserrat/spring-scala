lazy val root = Project(id = "springbootdummy", base = file("."))
  .enablePlugins(JavaServerAppPackaging,AshScriptPlugin)
  .settings(DockerImage.publishToRegistry)
  .settings(
    organization := "eu.portavita",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Dependencies.allDependencies
  )

