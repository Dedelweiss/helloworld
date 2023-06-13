val scala3Version = "3.3.2-RC1-bin-SNAPSHOT"

lazy val root = project
  .in(file("."))
  .settings(
    Compile / doc / scalacOptions ++= Seq(
      "-siteroot", "docs",
      "-no-link-asset-warnings",
      "-scastie-configuration",
      """    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.apache.commons" % "commons-lang3" % "3.12.0"
    )"""
    ),
    name := "HelloWorld",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.apache.commons" % "commons-lang3" % "3.12.0",
      // "org.scalatest" % "scalatest_2.13" % "3.3.0-SNAP3"
      // "org.scalatest" %% "scalatest" % "3.3.0-SNAP4"
      "org.scalactic" %% "scalactic" % "3.2.15",
      "org.scalatest" %% "scalatest" % "3.2.15"
    )
  )
  
  