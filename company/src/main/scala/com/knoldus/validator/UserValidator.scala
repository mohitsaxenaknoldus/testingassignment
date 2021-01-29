package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User

class UserValidator(){

  val emailValidatorObject = new EmailValidator()
  val companyReadDtoObject = new CompanyReadDto()

  def userIsValid(user: User): Boolean = {

    if(companyReadDtoObject.getCompanyByName(user.companyName) != None && emailValidatorObject.emailIdIsValid(user.emailId))
      return true
    else
      return false
  }
}