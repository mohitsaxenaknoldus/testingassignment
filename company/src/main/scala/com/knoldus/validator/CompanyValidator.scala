package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator{

  val companyReadDToObject = new CompanyReadDto()
  val emailValidatorObject = new EmailValidator()

  def companyIsValid(company: Company): Boolean = {

    if(emailValidatorObject.emailIdIsValid(company.emailId) && companyReadDToObject.getCompanyByName(company.name) == None)
      return true
    else
      return false
  }
}
