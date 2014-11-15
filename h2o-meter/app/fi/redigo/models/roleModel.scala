package fi.redigo.models

import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import play.data.format.Formats.DateTime
import java.util.Date
import java.lang.Integer

case class RoleData( var id:String )


object RoleModel {
  val result = {
    get[String]("role.id") map {
      case id => RoleData(id)
    }
  }
}