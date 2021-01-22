package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite

class CompanyValidatorTest extends FunSuite {

  val companyValidatorObject = new CompanyValidator()
  val companyReadDtoObject = new CompanyReadDto()

  test("Should return true if company is valid"){
    assert(!companyValidatorObject.companyIsValid(companyReadDtoObject.knoldusCompany) === true)
  }
}