import sbt._

object Dependencies {
  lazy val allDependencies: Seq[ModuleID] =
      testDependencies ++
      springDependencies

  private lazy val springVersion = "2.7.3"
  private lazy val scalamockVersion: String = "5.2.0"
  private lazy val scalatestVersion: String = "3.2.12"

  val springDependencies: Seq[ModuleID] = Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % springVersion,
    "org.springframework.boot" % "spring-boot-configuration-processor" % springVersion
  )
    val testDependencies: Seq[ModuleID] = Seq(
    "org.scalamock" %% "scalamock" % scalamockVersion % "test",
    "org.scalatest" %% "scalatest" % scalatestVersion % "test",
  )
}

