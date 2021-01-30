package validator

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.scalatest.FunSuite

class EmployeeValidatorTest extends FunSuite {

  val employeeValidatorObject = new EmployeeValidator()

  val testEmployeeOne = new Employee("Ravi", "Kumar", 45, 45000, "CEO", "Knoldus", "ravikumar@gmail.com")
  val testEmployeeTwo = new Employee("Soni", "Singh", 40, 40000, "CTO", "Samsung", "sonisingh@yahoo.com")

  test("Should return true as testEmployeeOne is valid"){
    assert(employeeValidatorObject.employeeIsValid(testEmployeeOne) === true)
  }

  test("Should return true as testEmployeeTwo is not valid"){
    assert(!employeeValidatorObject.employeeIsValid(testEmployeeTwo) === true)
  }
}