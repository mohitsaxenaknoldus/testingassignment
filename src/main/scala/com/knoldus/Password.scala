package com.knoldus

class Password {

    def isValid(passwd: String) : Boolean = {
      if(passwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$"))
        return true
      else
        return false
    }
}
