package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daisongsong on 2015/8/13.
 */
@Controller
@RequestMapping("/api")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public MyResult test(ModelMap model) {
        return new MyResult(MyResult.CODE_SUCCESS, "Hello World!");
    }
}
