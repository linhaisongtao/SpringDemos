package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daisongsong on 2015/12/28.
 */
@Controller
@RequestMapping("/")
public class IPController {

    @RequestMapping("/ip")
    public MyResult getIP(HttpServletRequest request) {

        System.out.println(request.toString());
        return new MyResult(MyResult.CODE_SUCCESS, request.getRemoteHost());
    }
}
