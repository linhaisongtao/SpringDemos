package com.springapp.mvc;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by daisongsong on 2015/8/13.
 */
@Service("time")
public class TimeService {

    public String getServerTime(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
