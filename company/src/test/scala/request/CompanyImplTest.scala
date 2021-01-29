package request

import com.knoldus.db.CompanyReadDto
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class CompanyImplTest extends FunSuite with MockitoSugar {

  val mockCompanyValidator = mock[CompanyValidator]
  val companyImplObj = new CompanyImpl(mockCompanyValidator)
  val companyReadDtoObj = new CompanyReadDto()

  test("Should return Some as Knoldus already exists"){
    when(mockCompanyValidator.companyIsValid(companyReadDtoObj.knoldusCompany)).thenReturn(true)
    assert(companyImplObj.createCompany(companyReadDtoObj.knoldusCompany) != None)
  }

  test("Should return Some as Philips already exists"){
    when(mockCompanyValidator.companyIsValid(companyReadDtoObj.philipsCompany)).thenReturn (true)
    assert(companyImplObj.createCompany(companyReadDtoObj.philipsCompany) != None)
  }
}
