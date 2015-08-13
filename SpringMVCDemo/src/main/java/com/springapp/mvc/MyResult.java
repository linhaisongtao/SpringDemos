package com.springapp.mvc;

import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by daisongsong on 2015/8/13.
 */
public class MyResult implements View {
    private R mR;

    public MyResult() {
        mR = new R();
    }

    public MyResult(int code, Object data) {
        mR = new R(code, data);
    }

    @Override
    public String getContentType() {
        return "json";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String res = JSON.toJSONString(mR);
        httpServletResponse.getWriter().print(res);
    }

    private static class R {
        private int code;
        private Object data;

        public R() {
        }

        public R(int code, Object data) {
            this.code = code;
            this.data = data;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    public static final int CODE_SUCCESS = 0;
}
