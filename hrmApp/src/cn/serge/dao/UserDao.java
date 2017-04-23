package cn.serge.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.serge.domain.User;
import static cn.serge.util.common.HrmConstants.USERTABLE;;
public interface UserDao {
	@Select("select * from "+USERTABLE+" where loginname=#{loginname} and password == #{password}")
	User selectByLoginnameAndPassword(
			@Param("loginname") String loginname,
			@Param("password") String password
			);
	
}
