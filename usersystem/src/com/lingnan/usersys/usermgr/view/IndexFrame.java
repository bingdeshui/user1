package com.lingnan.usersys.usermgr.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lingnan.usersys.common.util.TypeUtil;
import com.lingnan.usersys.user.controller.UserController;
import com.lingnan.usersys.usermgr.domain.UserDto;

public class IndexFrame implements BaseFrame{

	@Override
	public void show() {
		//声明缓冲处理对象，用于接收控制台输入的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//循环操作
		while(true) {
			//用户登录和注册界面
			System.out.println("欢迎使用用户管理系统");
			System.out.println("=====================");
			System.out.println("用户登录----------------1");
			System.out.println("用户注册----------------2");
			System.out.println("退出程序----------------3");
			int i = -1;
			//读取用户控制台输入，如果输入值正确，中断循环，否则提示错误信息，再重新输入
			while (true) {
				try {
					//读取用户输入信息操作选项的数字，同时转换为int型
					i = Integer.parseInt(br.readLine());
					//中断该循环，进入下一步操作：i值判断
					break;
				} catch (Exception e) {
					//出现异常时，提示错误信息，再重新输入
					System.out.println("输入错误信息，只能输入1-3的数字.");
					System.out.println("请你重新输入");
				}
			}
			
			switch (i) {
			case 1:
				this.loginShow();
			case 2:
				this.addShow("注册");
			case 3:
				System.out.println("感谢你的使用，再会");
				//退出当前界面
				System.exit(0);
			default: //输入值是1-3外
				System.out.println("您输入的操作不正确，请重新输入");
				
			}
		}
		
	}

	public void loginShow() {
		//声明缓冲处理对象，用于接收控制台输入的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("用户登录界面");
		System.out.println("=====================");
		System.out.println("请输入你的用户名：");
		try{
			//以行为单位，读取输入的各个值，赋值给用户对象的各个属性
			String name = br.readLine();
			System.out.println("请输入密码：");
			String password = br.readLine();
			//调用控制器中doLogin方法，进行用户登录操作
			UserController uc = new UserController();
			UserDto user = uc.doLogin(name, password);//如果返回值不为空，登录成功，显示用户信息操作界面，如果失败，则显示失败值
			if(user !=null) {
				System.out.println("登录成功...");
				System.out.println("===================");
				//调用主界面
				AdminFrame m =new AdminFrame(user);
				m.loginSuccShow();
				if(user.getPower().equals("普通用户")) {
					System.out.println("你是普通用户，你有以下权限");
					System.out.println("1.查询自己的信息");
					System.out.println("2.修改信息");
					System.out.println("3.退出此界面");
					
					int a = -1;
					switch (a) {
					case 1:
						this.searchShow(user.getPower());;
					case 2:
						this.updateShow(user.getPower(),UserDto user);
					case 3:
						System.out.println("感谢你的使用，再会");
						//退出当前界面
						System.exit(0);
					default: //输入值是1-3外
						System.out.println("您输入的操作不正确，请重新输入");
					}
					
				}
				
				else {
					System.out.println("你是管理员，你有以下权限");
					System.out.println("1.查询用户的信息");
					System.out.println("2.增加用户信息");
					System.out.println("3.增加用户信息");
					System.out.println("4.删除用户信息");
					System.out.println("5.退出");
					
					int b = -1;
					switch (b) {
					case 1:
						
						this.searchShow();
					case 2:
						this.updateShow(String type,UserDto user);
					case 3:
						System.out.println("感谢你的使用，再会");
						//退出当前界面
						System.exit(0);
					default: //输入值是1-3外
						System.out.println("您输入的操作不正确，请重新输入");
					}
				}
				
				
				//退出当前界面
				System.exit(0);			
			} else {
				//登录失败，显示失败信息
				System.out.println("登录失败");
			}
		} catch (Exception e) {
			//显示异常信息
			System.out.println(e.getMessage());
		}
	}
			
			
		
		
		
	

	@Override
	public void addShow(String type) {
		//声明缓冲处理对象，用于接收控制台输入的数据
		System.out.println("欢迎来到注册页面：");
		System.out.println("==================：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名：");
		try {
			//实例化用户对象
			UserDto user = new UserDto();
			//读取输入的各个值，赋值给用户对象的各个属性
			user.setUsername(br.readLine());
			System.out.println("请输入密码：");
			user.setPasswd(br.readLine()) ;
			System.out.println("请输入性别：");
			user.setSex( br.readLine());
			while(true) {
				System.out.println("请输入邮箱：");
				String email = br.readLine();
				if(TypeUtil.checkEmail(email)){
					user.setEmail(email);
					break;
				}
				//调用控制器中doLogin方法，进行插入数据操作
				UserController uc = new UserController();
				
				
			
			}
			
			System.out.println("请输入身份：");
			user.setPower(br.readLine()) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void searchShow(String type) {
		// TODO Auto-generated method stub
		UserDto s =new UserDto();
		if(type.equals("普通用户")) {
			
			
		}
		
	}

	@Override
	public void updateShow(String type, UserDto user) {
		// TODO Auto-generated method stub
		
	}

}
