package com.qhit.lh.g4.jack.t1;

import java.util.List;
import org.junit.Test;
import com.qhit.lh.g4.jack.t1.basedao.BaseDao;
import com.qhit.lh.g4.jack.t1.basedao.impl.BaseDaoImpl;
import com.qhit.lh.g4.jack.t1.bean.User;
public class UserTest {
	private BaseDao baseDao=new BaseDaoImpl();
	//添加user对象
@Test
public void  add(){
	User user =new User();
	user.setUname("jack");
	user.setUpwd("123456");
	baseDao.add(user);
	
}
	//修改user对象
@Test
public void update(){
User user =new User();
user.setId(2);
user.setUname("jackjava");
user.setUpwd("123456");
baseDao.update(user);
}	
	//查询user对象
@Test
public void queryAll(){

	List<Object> users = baseDao.queryAll("from User");
	for (Object object : users) {
		User user = (User) object;
		System.out.println(user.toString());
	}
	
}
	//删除user对象
@Test
public void delete(){
	User user =new User();
	user.setId(2);
	baseDao.delete(user);
	
}	
	
}
