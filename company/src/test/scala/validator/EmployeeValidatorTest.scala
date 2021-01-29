package validator

import com.knoldus.db.EmployeeReadDto
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.EmployeeValidator
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class EmployeeValidatorTest extends FunSuite with MockitoSugar{

  val mockEmployeeValidator = mock[EmployeeValidator]
  val employeeImplObj = new EmployeeImpl(mockEmployeeValidator)
  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true as employee one is valid"){
    when(mockEmployeeValidator.employeeIsValid(employeeReadDtoObject.employeeOne)).thenReturn(true)
    assert(employeeImplObj.createEmployee(employeeReadDtoObject.employeeOne) != None)
  }

  test("Should return true as employee two is valid"){
    when(mockEmployeeValidator.employeeIsValid(employeeReadDtoObject.employeeTwo)).thenReturn(true)
    assert(employeeImplObj.createEmployee(employeeReadDtoObject.employeeTwo) != None)
  }
}