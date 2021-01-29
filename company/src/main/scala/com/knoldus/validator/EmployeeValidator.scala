package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator(){

  val emailValidatorObject = new EmailValidator()
  val companyReadDtoObject = new CompanyReadDto()

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyReadDtoObject.getCompanyByName(employee.companyName) != None && emailValidatorObject.emailIdIsValid(employee.emailId))
      return true
    else
      return false
  }
}
