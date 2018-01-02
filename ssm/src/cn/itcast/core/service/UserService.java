package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface UserService {

	List<User> getList() throws Exception;

	void insert(User user);

}
