package com.knoldus.db

import com.knoldus.models.User
import scala.collection.immutable.HashMap

class UserReadDto {

  val userOne: User = User("Mohit", "Saxena", 24, "Knoldus", "mohit.saxena@knoldus.com")
  val userTwo: User = User("Nitin", "Mishra", 23, "Knoldus", "nitin.mishra@knoldus.com")
}
