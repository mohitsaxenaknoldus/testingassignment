package request

import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import com.knoldus.models.Company
import org.scalatest.FunSuite
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

class CompanyImplTest extends FunSuite with MockitoSugar {

  val mockCompanyValidator = mock[CompanyValidator]
  val companyImplObj = new CompanyImpl(mockCompanyValidator)

  val knoldus = new Company("Knoldus", "knoldus@knoldus.com", "Noida")
  val samsung = new Company("Samsung", "samsung@samsung.com", "Delhi")

  test("Should return None if Knoldus is not created (already exists)"){
    when(mockCompanyValidator.companyIsValid(knoldus)).thenReturn(false)
    assert(companyImplObj.createCompany(knoldus) === None)
  }

  test("Should return Some if Samsung is created"){
    when(mockCompanyValidator.companyIsValid(samsung)).thenReturn(true)
    assert(companyImplObj.createCompany(samsung) != None)
  }
}
