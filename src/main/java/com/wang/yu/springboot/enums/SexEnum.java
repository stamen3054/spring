
package com.wang.yu.springboot.enums;

public enum SexEnum
{
   MALE("Male"),
   FEMALE("Female"),
   UNKNOWN("Unknown");
   
   private String sexString;
   
   private SexEnum(String sexString)
   {
      this.sexString = sexString;
   }
   
   public String getSexString()
   {
      return sexString;
   }
}
