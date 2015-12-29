package com.springapp.mvc;

import com.springapp.mvc.bean.Domain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daisongsong on 2015/12/29.
 */
@Controller
@RequestMapping("/dns")
public class HttpDNSController {

    @RequestMapping(value = "/servers")
    public MyResult getDNSList(@RequestParam(value = "domain", required = false) String domainsString) {
        List<Domain> domainList = new ArrayList<Domain>();

        String[] domains = null;
        if (domainsString != null) {
            domains = domainsString.split(",");
            if (domains != null) {
                final long expire = System.currentTimeMillis() + 1000 * 3600 * 24;
                for (String domain : domains) {
                    System.out.println("domain = " + domain);
                    domainList.add(new Domain(domain, "10.18.20.3", expire));
                }
            }
        }
        return new MyResult(MyResult.CODE_SUCCESS, domainList);
    }
}
