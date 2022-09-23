import sbt._

object Dependencies {
  lazy val allDependencies: Seq[ModuleID] =
    json4sDependencies ++
      slickDependencies ++
      dbDependencies ++
      testDependencies ++
      springDependencies

  private lazy val springVersion = "2.7.3"
  private lazy val json4sVersion = "4.0.5"
  private lazy val slickVersion: String = "3.4.1"
  private lazy val postgresVersion: String = "42.5.0"
  private lazy val scalamockVersion: String = "5.2.0"
  private lazy val scalatestVersion: String = "3.2.12"
  private lazy val catsCoreVersion = "2.7.0"
  private lazy val scaldiVersion = "0.6.2"

  val springDependencies: Seq[ModuleID] = Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % springVersion,
    "org.springframework.boot" % "spring-boot-configuration-processor" % springVersion
  )

  val json4sDependencies: Seq[ModuleID] = Seq(
    "org.json4s" %% "json4s-jackson" % json4sVersion,
    "org.json4s" %% "json4s-ext" % json4sVersion,
    "org.json4s" %% "json4s-native" % json4sVersion
  )

  val slickDependencies: Seq[ModuleID] = Seq(
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion
  )

  val dbDependencies: Seq[ModuleID] = Seq(
    "org.postgresql" % "postgresql" % postgresVersion
  )

  val testDependencies: Seq[ModuleID] = Seq(
    "org.scalamock" %% "scalamock" % scalamockVersion % "test",
    "org.scalatest" %% "scalatest" % scalatestVersion % "test",
  )

}

