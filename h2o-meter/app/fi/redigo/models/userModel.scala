package fi.redigo.models

import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import play.data.format.Formats.DateTime
import java.util.Date
import java.lang.Integer

case class UserData( 
    var id : Pk[Long] ,
    var username : String,
    var password : String,
    var firstname : String,
    var lastname : String,
    var email : String,
    var phone : String,
    var role : String)

object UserModel {
  val result = {
    get[Pk[Long]]("user.id") ~
    get[String]("user.username") ~
    get[String]("user.password") ~
    get[String]("user.firstname") ~
    get[String]("user.lastname") ~
    get[String]("user.email") ~
    get[String]("user.phone") ~
    get[String]("user.role") map {
      case id~
           username~
           password~
           firstname~
           lastname~
           email~
           phone~
           role => UserData( 
                id,
                username,
                password,
                firstname,
                lastname,
                email,
                phone,
                role )
    }
  }
}
