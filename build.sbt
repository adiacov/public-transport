name := "public-transport"

scalaVersion := "2.12.8"

lazy val public_transport = (project in file("."))
  .settings(
    version := "0.1.0-SNAPSHOT"
  ).aggregate(pt_api)

lazy val pt_api = (project in file("pt-api"))
  .dependsOn(pt_domain)

lazy val pt_domain = project in file("pt-domain")

lazy val pt_fetcher = project in file("pt-fetcher")

//lazy val pt_processor = project in file("pt-processor")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % "test"
)
