package db

import com.knoldus.db.CompanyReadDto
import org.scalatest.FunSuite

class CompanyReadDtoTest extends FunSuite{

  val companyReadDtoTestObj = new CompanyReadDto()

  test("Should return Some as Knoldus is a company"){
    assert(companyReadDtoTestObj.getCompanyByName("Knoldus") != None)
  }

  test("Should return Some as Philips is a company"){
    assert(companyReadDtoTestObj.getCompanyByName("Philips") != None)
  }

  test("Should return None as Samsung is not a company"){
    assert(companyReadDtoTestObj.getCompanyByName("Samsung") === None)
  }
}
