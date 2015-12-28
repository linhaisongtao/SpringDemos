package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daisongsong on 2015/11/9.
 */
@Controller
@RequestMapping("/tcf")
public class TCF {

    @RequestMapping("/f1")
    public MyResult f1() {
        return new MyResult(f2(), null);
    }

    private int f2() {
        try {
            int a = 10;
            System.out.println("TCF.f2 a = " + a);
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("TCF.f2 finally a = " + 0);
            return 0;
        }
    }
}
