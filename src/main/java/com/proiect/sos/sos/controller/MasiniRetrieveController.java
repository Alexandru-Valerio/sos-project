package com.proiect.sos.sos.controller;

import com.proiect.sos.sos.model.Masini;
import com.proiect.sos.sos.model.MasiniRegistrationReply;
import com.proiect.sos.sos.service.MasiniRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MasiniRetrieveController {
    @RequestMapping(method = RequestMethod.GET, value="/masini/allmasini")

    @ResponseBody
    public List<Masini> getMasini() {
        return MasiniRegistration.getInstance().getMasiniRecords();
    }

}
