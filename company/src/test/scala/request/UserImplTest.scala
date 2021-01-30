package request

import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import com.knoldus.models.User
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class UserImplTest extends FunSuite with MockitoSugar {

  val mockUserValidator = mock[UserValidator]
  val userImplObj = new UserImpl(mockUserValidator)

  val testUserOne = new User("Ravi", "Kumar", 21, "Knoldus", "ravi.kumar@gmail.com")
  val testUserTwo = new User("Pravin", "Dube", 39, "Samsung", "pravin@yahoo.in")

  test("Should return Some if testEmployeeOne is created"){
    when(mockUserValidator.userIsValid(testUserOne)).thenReturn(true)
    assert(userImplObj.createUser(testUserOne) != None)
  }

  test("Should return None if testEmployeeTwo is not created"){
    when(mockUserValidator.userIsValid(testUserTwo)).thenReturn(false)
    assert(userImplObj.createUser(testUserTwo) === None)
  }
}
