package validator

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite
import com.knoldus.validator.EmailValidator

class EmailValidatorTest extends FunSuite{

  val emailValidatorObject = new EmailValidator()
  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if email is valid"){
    assert(emailValidatorObject.emailIdIsValid(employeeReadDtoObject.employeeOne.emailId) === true)
  }
}