package cn.itcast.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String getUserList(Model model) throws Exception{
	    List<User> list= userService.getList();
	    System.out.print(list);
		model.addAttribute("userList", list);
		return "list";
	}
	@RequestMapping("/insert")
	public String insert(User user){
		userService.insert(user);
		return "list";
	}
	
	@RequestMapping("/toInsert")
	public String toInsert(){
		return "insert";
	}
}
