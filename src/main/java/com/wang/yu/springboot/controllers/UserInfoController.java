
package com.wang.yu.springboot.controllers;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wang.yu.springboot.beans.User;
import com.wang.yu.springboot.enums.SexEnum;

@RestController
public class UserInfoController
{
   private static User user = new User();
   @Value("${spring.application.wang.yu.index.hello}")
   private String helloMessage;

   static
   {
      user.setFirstName("yu");
      user.setLastName("wang");
      user.setSexEnum(SexEnum.MALE);
      user.setDateOfBirth(new GregorianCalendar(1990, 1, 17).getTime());
   }

   @RequestMapping(value = "/get_user_info", method = RequestMethod.GET)
   public ModelAndView getUserInfo()
   {
      System.out.println("entering getUserInfo() GET");
      ModelAndView mv = new ModelAndView("user_info");
      mv.addObject("user", user);
      return mv;
   }

   @RequestMapping(value = "/get_user_info", method = RequestMethod.POST)
   public User getUserInfo(int userId)
   {
      System.out.println("entering getUserInfo() POST");
      return user;
   }

   @RequestMapping(value = "/greeting", method = RequestMethod.GET)
   public ModelAndView greeting(@RequestParam(name = "name", defaultValue = "SprintBoot") String name, Model model)
   {
      System.out.println("entering greeting()");
      ModelAndView mv = new ModelAndView("greeting");
      mv.addObject("name", name);
      return mv;
   }

   @RequestMapping(value = "/testing")
   public ModelAndView testing()
   {
      System.out.println("entering testing()");
      System.out.println(helloMessage);
      ModelAndView mv = new ModelAndView("testing");
      mv.addObject("message", helloMessage);
      return mv;
   }
}
