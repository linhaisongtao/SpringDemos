package com.springapp.mvc;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by daisongsong on 2015/8/13.
 */
@Controller
@RequestMapping("/api")
public class TestController {
    @Resource
    private TimeService mTimeService;

    @RequestMapping(value = {"/time", "/serverTime"}, method = RequestMethod.GET)
    public MyResult test(ModelMap model) {
        Data d = new Data();
        d.setTime(mTimeService.getServerTime());
        return new MyResult(MyResult.CODE_SUCCESS, d);
    }

    private static class Data {
        private String mTime;

        public String getTime() {
            return mTime;
        }

        public void setTime(String time) {
            mTime = time;
        }
    }
}
