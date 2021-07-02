package com.proiect.sos.sos.controller;

import com.proiect.sos.sos.service.MasiniRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasiniDeleteController {
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/masini/{regNum}")

    @ResponseBody
    public String deleteMasiniRecord(@PathVariable("regNum") String regNum) {
        System.out.println("In deleteMasiniRecord");
        return MasiniRegistration.getInstance().deleteMasini(regNum);
    }
}
