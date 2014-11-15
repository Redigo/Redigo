import sbt._
import Keys._
import play.Project._
import com.github.play2war.plugin._
 
object ApplicationBuild extends Build {
 
val appName = "y"
val appVersion = "1.0-SNAPSHOT"
 
val appDependencies = Seq(
// Add your project dependencies here,
javaCore,
javaJdbc,
javaEbean,
"postgresql" % "postgresql" % "9.2-1002.jdbc4"
)
 
val main = play.Project(appName, appVersion, appDependencies)
.settings(Play2WarPlugin.play2WarSettings: _*)
 
.settings(
Play2WarKeys.servletVersion := "3.0"
)
// Add your own project settings here
}