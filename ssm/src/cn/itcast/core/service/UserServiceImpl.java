package cn.itcast.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserDao;
import cn.itcast.core.dao2.UserDao2;
import cn.itcast.core.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserDao2 userDao2;
	@Override
	public List<User> getList() throws Exception {
		// TODO Auto-generated method stub
		return userDao2.getAll();
	}
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}

}
