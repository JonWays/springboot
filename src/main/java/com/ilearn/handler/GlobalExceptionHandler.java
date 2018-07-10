/**
 * Author:   Administrator
 * Date:     2018-07-10 下午 11:43
 * Description:
 */
package com.ilearn.handler;

import com.ilearn.common.entitys.CommonRsp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(HttpServletRequest req, Exception e)
    {
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("errmsg", e.getMessage());

        return map;
    }
}
