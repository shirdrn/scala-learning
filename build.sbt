name := "learning-scala"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.10" % "2.3.12",
  "net.sf.json-lib" % "json-lib" % "2.3",
  "com.typesafe.akka" % "akka-remote_2.10" % "2.3.12",
  "com.typesafe.akka" % "akka-kernel_2.10" % "2.3.12",
  "com.typesafe.akka" % "akka-cluster_2.10" % "2.3.12",
  "mysql" % "mysql-connector-java" % "5.1.17",
  "org.apache.kafka" % "kafka_2.10" % "0.8.1.1"
  )
