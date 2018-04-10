package com.mbp.web;

import com.mbp.pojo.ExampleEntity;
import com.mbp.service.ExampleService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * FileName:ExampleController
 * Author:  ghw06
 * Date:    2017/12/17 13:07
 * Description: demo控制器
 */
@Controller
@RequestMapping("demo")
public class ExampleController {

    @Autowired
    private ExampleService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("allUser");
        List<ExampleEntity> data = userService.getUsers();
        mv.addObject("data", data);

        return mv;
    }

    @RequestMapping(value = "examplePage")
    public ModelAndView examplePage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/example/examplePage.vm");
        return mv;
    }

}
