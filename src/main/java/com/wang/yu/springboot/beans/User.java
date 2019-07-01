
package com.wang.yu.springboot.beans;

import java.util.Date;

import com.wang.yu.springboot.enums.SexEnum;

public class User
{
   private String firstName;
   private String lastName;
   private Date dateOfBirth;
   private SexEnum sexEnum;

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public Date getDateOfBirth()
   {
      return dateOfBirth;
   }

   public void setDateOfBirth(Date dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   public SexEnum getSexEnum()
   {
      return sexEnum;
   }

   public void setSexEnum(SexEnum sexEnum)
   {
      this.sexEnum = sexEnum;
   }
}
