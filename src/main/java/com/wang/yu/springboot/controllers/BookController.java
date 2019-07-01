
package com.wang.yu.springboot.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wang.yu.springboot.beans.Book;

@Controller
public class BookController
{
   @RequestMapping(value="/update_book", method=RequestMethod.GET)
   public String updateBook(Book book)
   {
      System.out.println("entering updateBook()");
      return "update_book";
   }
   
   @RequestMapping(value="/update_book", method=RequestMethod.POST)
   public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult)
   {
      System.out.println("entering updateBook()");
      if(bindingResult.hasErrors())
      {
         return "update_book";
      }
      
      return "redirect:/index.html";
   }
}
