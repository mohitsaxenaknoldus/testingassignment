package validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite

class CompanyValidatorTest extends FunSuite {

  val companyValidatorObject = new CompanyValidator()
  val companyReadDtoObject = new CompanyReadDto()

  val mockCompanyValidator = new CompanyValidator()

  test("Should return true as Knoldus is valid"){
    assert(!companyValidatorObject.companyIsValid(companyReadDtoObject.knoldusCompany) === true)
  }
}