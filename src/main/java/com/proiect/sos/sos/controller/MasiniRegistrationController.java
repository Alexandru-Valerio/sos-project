package com.proiect.sos.sos.controller;

import com.proiect.sos.sos.model.Masini;
import com.proiect.sos.sos.model.MasiniRegistrationReply;
import com.proiect.sos.sos.service.MasiniRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasiniRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value = "/register/masini")


    @ResponseBody
    MasiniRegistrationReply registerMasina(@RequestBody Masini masina) {

        System.out.println("In registerMasina");
        MasiniRegistrationReply stdregreply = new MasiniRegistrationReply();

        MasiniRegistration.getInstance().add(masina);

        stdregreply.setFirma(masina.getFirma());
        stdregreply.setCuloare(masina.getCuloare());
        stdregreply.setRegNum(masina.getRegNum());
        stdregreply.setRegStat("Successful");

        //{"marca":"Gibson","firma":"LesPaul","regNum":"RTGX"}
        //{"marca":"Jackson","firma":"Dinky","regNum":"RTGX"}
        return stdregreply;

    }
}
