package com.zyq.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyq.springmvc.bean.CommonBean;
import com.zyq.springmvc.bean.SonBean;

@Controller
public class MainController {

	@RequestMapping("/first")
	@ResponseBody
	public CommonBean getFirst(){
		CommonBean bean = new CommonBean();
		bean.setResultCode("success");
		bean.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis()));
		bean.setData("this is first message");
		return bean;
	}
	
	@RequestMapping("/second")
	@ResponseBody
	public CommonBean getSecond(){
		CommonBean bean = new CommonBean();
		bean.setResultCode("success");
		bean.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis()));
		List<String> data = new ArrayList<>();
		data.add("JAVA");
		data.add("C");
		data.add("PYTHON");
		data.add("C++");
		bean.setData(data);
		return bean;
	}
	
	@RequestMapping("/third")
	@ResponseBody
	public CommonBean getThird(){
		CommonBean bean = new CommonBean();
		bean.setResultCode("success");
		bean.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis()));
		Map<String, String> data = new HashMap<>();
		data.put("first", "JAVA");
		data.put("second","PYTHON");
		data.put("third", "C++");
		data.put("fourth", "C");
		bean.setData(data);
		return bean;
	}
	
	@RequestMapping("/fourth")
	@ResponseBody
	public CommonBean getFourth(){
		CommonBean bean = new CommonBean();
		bean.setResultCode("success");
		bean.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(System.currentTimeMillis()));
		SonBean sonBean = new SonBean();
		sonBean.setAge(25);
		sonBean.setName("Hacker's Delight");
		sonBean.setGender("male");
		bean.setData(sonBean);
		return bean;
	}
}
