package com.proiect.sos.sos.controller;

import com.proiect.sos.sos.model.Masini;
import com.proiect.sos.sos.service.MasiniRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasiniUpdateController {

    @RequestMapping(method = RequestMethod.PUT, value="/update/masina")


    @ResponseBody
    public String updateMasinaRecord(@RequestBody Masini masinan) {
        System.out.println("In updateMasinaRecord");
        return MasiniRegistration.getInstance().updateMasini(masinan);
    }
}
