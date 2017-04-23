package cn.serge;

import java.util.Calendar;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		User user1 = new User("moon", "sergeXu", "123456", "13262280218");
		System.out.println(user1);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(user1.getRegisterDate());
		System.out.println("regi Year is  "+ calendar.get(Calendar.YEAR));
	}

}
