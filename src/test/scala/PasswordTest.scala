import org.scalatest.FunSuite
import com.knoldus.Password

class PasswordTest extends FunSuite {

  val passwordObject = new Password()

  test("Should return true as Hello@123 is valid"){
    assert(passwordObject.isValid("Hello@123") === true)
  }
}
