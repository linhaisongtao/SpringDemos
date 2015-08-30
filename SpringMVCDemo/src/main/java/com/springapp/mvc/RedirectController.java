package com.springapp.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by daisongsong on 2015/8/30.
 */
@Controller
public class RedirectController {

    @RequestMapping("r")
    public RedirectView r(){
        RedirectView redirectView = new RedirectView("http://www.baidu.com");
        redirectView.setStatusCode(HttpStatus.TEMPORARY_REDIRECT);
        return redirectView;
    }
}
