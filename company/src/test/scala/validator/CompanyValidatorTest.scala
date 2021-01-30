package validator

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite

class CompanyValidatorTest extends FunSuite {

  val companyValidatorObject = new CompanyValidator()

  val hitachi = new Company("Hitachi", "test@hitachi.com", "Delhi")
  val apple = new Company("Apple", "testapple.com", "Delhi")

  test("Should return true as Hitachi is a valid company"){
    assert(companyValidatorObject.companyIsValid(hitachi) === true)
  }

  test("Should return true as Apple is not a valid company"){
    assert(!companyValidatorObject.companyIsValid(apple) === true)
  }
}