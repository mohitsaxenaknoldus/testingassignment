import org.scalatest.FunSuite
import com.knoldus.Password

class PasswordTest extends FunSuite {

  val passwordObj = new Password()

  test("Should return true as Hello@123 is valid"){
    assert(passwordObj.isValid("Hello@123") === true)
  }

  test("Should not return true as Hello@ is not valid"){
    assert(!passwordObj.isValid("Hello@") === true)
  }

  test("Should not return true as Hello123 is not valid"){
    assert(!passwordObj.isValid("Hello123") === true)
  }

  test("Should not return true as @123 is not valid"){
    assert(!passwordObj.isValid("@123") === true)
  }

  test("Should not return true as hello@123 is not valid"){
    assert(!passwordObj.isValid("hello@123") === true)
  }
}
