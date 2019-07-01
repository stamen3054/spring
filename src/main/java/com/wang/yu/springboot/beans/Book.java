
package com.wang.yu.springboot.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.internal.NotNull;

public class Book
{
   @NotBlank(message="book.error.name")
   private String name;
   @Min(1)
   @NotNull
   private Long price;
   @NotBlank(message="book.error.author")
   private String author;
   
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public long getPrice()
   {
      return price;
   }
   public void setPrice(long price)
   {
      this.price = price;
   }
   public String getAuthor()
   {
      return author;
   }
   public void setAuthor(String author)
   {
      this.author = author;
   }
}
