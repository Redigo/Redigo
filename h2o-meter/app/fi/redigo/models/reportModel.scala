package fi.redigo.models

import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import play.data.format.Formats.DateTime
import java.util.Date
import java.lang.Integer

case class ReportData( 
	var id:String,
	var name:String
 )


object ReportModel {
  val result = {
    get[String]("report_format.id") ~
    get[String]("report_format.name") map {
      case id~name => ReportData(id,name)
    }
  }
}