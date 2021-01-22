package validator

import com.knoldus.db.EmployeeReadDto
import com.knoldus.validator.EmployeeValidator
import org.scalatest.FunSuite

class EmployeeValidatorTest extends FunSuite {

  val employeeValidatorObject = new EmployeeValidator()
  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if employee is valid"){
    assert(employeeValidatorObject.employeeIsValid(employeeReadDtoObject.employeeOne) === true)
  }
}