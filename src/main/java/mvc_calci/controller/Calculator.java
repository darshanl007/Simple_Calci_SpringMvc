package mvc_calci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
	
	@GetMapping("/")
	public String loadCalculator() {
		return "calci.jsp";
	}
	
	
	@GetMapping("/add")
	public String add(@RequestParam int num1,@RequestParam int num2,ModelMap map)
	{
		int result=num1+num2;
		map.put("num1",num1);
		map.put("num2", num2);
		map.put("result",result);
		
		return "calci.jsp";
	}
	@GetMapping("/sub")
	public String sub(@RequestParam int num1,@RequestParam int num2,ModelMap map)
	{
		int result=num1-num2;
		map.put("num1",num1);
		map.put("num2", num2);
		map.put("result",result);
		
		return "calci.jsp";
	}
	
	@GetMapping("/product")
	public String product(@RequestParam int num1,@RequestParam int num2,ModelMap map)
	{
		int result=num1*num2;
		map.put("num1",num1);
		map.put("num2", num2);
		map.put("result",result);
		
		return "calci.jsp";
	}
	@GetMapping("/div")
	public String div(@RequestParam int num1,@RequestParam double num2,ModelMap map)
	{
		double result=num1/num2;
		map.put("num1",num1);
		map.put("num2", num2);
		map.put("result",result);
		
		return "calci.jsp";
	}
}
