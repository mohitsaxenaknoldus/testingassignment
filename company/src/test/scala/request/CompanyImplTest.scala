package request

import com.knoldus.db.CompanyReadDto
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite

class CompanyImplTest extends FunSuite {

  val companyValidatorObj = new CompanyValidator()
  val companyImplObj = new CompanyImpl(companyValidatorObj)
  val companyReadDtoObj = new CompanyReadDto()

  test("Should return None if Knoldus is not created"){
    assert(companyImplObj.createCompany(companyReadDtoObj.knoldusCompany) === None)
  }

  test("Should return None if Philips is not created"){
    assert(companyImplObj.createCompany(companyReadDtoObj.philipsCompany) === None)
  }
}
