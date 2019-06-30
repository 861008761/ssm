package com.mylovin.display.controller;

import com.mylovin.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/display")
public class DisplayController {
    @Autowired
    DisplayService displayService;

    @ResponseBody
    @RequestMapping(value = "/getCount", method = RequestMethod.GET)
    public String getCount() {
        return this.displayService.getCount();
    }

    @ResponseBody
    @RequestMapping(value = "/insertSth", method = RequestMethod.POST)
    public String insertSth() {
        return this.displayService.insertSth();
    }
}
