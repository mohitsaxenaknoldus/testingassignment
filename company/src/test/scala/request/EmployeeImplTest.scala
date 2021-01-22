package request

import com.knoldus.db.EmployeeReadDto
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.EmployeeValidator
import org.scalatest.FunSuite

class EmployeeImplTest extends FunSuite {

  val employeeValidatorObj = new EmployeeValidator()
  val employeeImplObj = new EmployeeImpl(employeeValidatorObj)
  val employeeReadDtoObj = new EmployeeReadDto()

  test("Should return Some if Employee One is created"){
    assert(employeeImplObj.createEmployee(employeeReadDtoObj.employeeOne) != None)
  }

  test("Should return Some if Employee Two is created"){
    assert(employeeImplObj.createEmployee(employeeReadDtoObj.employeeTwo) != None)
  }
}
