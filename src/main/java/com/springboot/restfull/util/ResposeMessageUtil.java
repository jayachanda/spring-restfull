package com.springboot.restfull.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ResposeMessageUtil {
	
	public Map<String,Object> formatResposneMessage(String status,String message,Object data,int statusCode){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", status);
		map.put("data", data);
		map.put("message", message);
		map.put("code", statusCode);
		return map;
	}
}
