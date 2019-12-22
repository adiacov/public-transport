name := "public-transport"

scalaVersion := "2.13.1"

lazy val public_transport = (project in file("."))
  .settings(
    version := "0.1.0-SNAPSHOT"
  )
  .aggregate(pt_api)

lazy val pt_api = (project in file("pt-api"))

lazy val pt_domain = (project in file("pt-domain"))
