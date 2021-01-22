package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val employeeOne: Employee = Employee("Mohit", "Saxena", 24, 50000, "Software Consultant Trainee", "Knoldus", "mohit.saxena@knoldus.com")
  val employeeTwo: Employee = Employee("Nitin", "Mishra", 23, 50000, "Software Consultant Trainee", "Knoldus", "nitin.mishra@knoldus.com")
}
