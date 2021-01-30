package request

import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.EmployeeValidator
import com.knoldus.models.Employee
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class EmployeeImplTest extends FunSuite with MockitoSugar{

  val mockEmployeeValidator = mock[EmployeeValidator]
  val employeeImplObj = new EmployeeImpl(mockEmployeeValidator)

  val testEmployeeOne = new Employee("Virat", "Kohli", 29, 60000, "Engineer", "Knoldus", "virat@bcci.com")
  val testEmployeeTwo = new Employee("Rohit", "Sharma", 28, 65000, "Engineer", "BCCI", "rohitbcci.com")

  test("Should return Some if testEmployeeOne is created"){
    when(mockEmployeeValidator.employeeIsValid(testEmployeeOne)).thenReturn(true)
    assert(employeeImplObj.createEmployee(testEmployeeOne) != None)
  }

  test("Should return None if testEmployeeTwo is not created"){
    when(mockEmployeeValidator.employeeIsValid(testEmployeeTwo)).thenReturn(false)
    assert(employeeImplObj.createEmployee(testEmployeeTwo) === None)
  }
}
