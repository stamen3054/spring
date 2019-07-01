
package com.wang.yu.springboot.replies;

import com.wang.yu.springboot.beans.Book;

public class BookUpdateReply
{
   private Book book;
   private String errorMessage;
   private short successInd;

   public Book getBook()
   {
      return book;
   }

   public void setBook(Book book)
   {
      this.book = book;
   }

   public String getErrorMessage()
   {
      return errorMessage;
   }

   public void setErrorMessage(String errorMessage)
   {
      this.errorMessage = errorMessage;
   }

   public short getSuccessInd()
   {
      return successInd;
   }

   public void setSuccessInd(short successInd)
   {
      this.successInd = successInd;
   }
}
