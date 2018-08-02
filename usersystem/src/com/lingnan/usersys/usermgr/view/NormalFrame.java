package com.lingnan.usersys.usermgr.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lingnan.usersys.common.util.TypeUtil;
import com.lingnan.usersys.user.controller.UserController;
import com.lingnan.usersys.usermgr.domain.UserDto;

/**
 * 用于用户管理，权限分为普通用户和管理员
 * @author Administrator
 *
 */

public class NormalFrame extends IndexFrame{
	//用户对象
	UserDto user = null;
  
	
	/**
	 * 带参数的构造器，用于初始化user属性
	 * @param user 输入user
	 */
	public NormalFrame(UserDto user) {
		this.user = user;
	}
   
	/**
	 * 普通用户的操作界面
	 */
	public void show() {
		System.out.println("你是普通用户，你有以下权限");
		System.out.println("1.查询自己的信息");
		System.out.println("2.修改信息");
		System.out.println("3.退出此界面");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = -1;
		int putong = 1;
		//读取用户控制台输入，如果输入值正确，中断循环，否则提示错误信息，再重新输入
		while (putong!=0) {
			try {
				//读取用户输入信息操作选项的数字，同时转换为int型
				a = Integer.parseInt(br.readLine());
				//中断该循环，进入下一步操作：i值判断
				break;
			} catch (Exception e) {
				//出现异常时，提示错误信息，再重新输入
				System.out.println("输入错误信息，只能输入1-3的数字.");
				System.out.println("请你重新输入");
			}
		}
		switch (a) {
		case 1:
			this.searchShow();			
			break;
		case 2:
			this.updateShow();
			break;
		case 3:
			System.out.println("感谢你的使用，再会");
			//退出当前界面
			System.exit(0);
		default: //输入值是1-3外
			System.out.println("您输入的操作不正确，请重新输入");
		}
		
	}
	
	/**
	 * 普通用户的查询界面
	 */
	public void searchShow() {
		    
			UserController uc = new UserController();
			uc.selectuerid(user.getUserid());
			int putong=0;
		
	}
	
	/**
	 * 普通用户更新信息的界面
	 */
	public void updateShow(){
		int putong=1;
		while(putong!=0) {
		UserController uc = new UserController();
		int userid = user.getUserid();
		int b=-1;
		int biaoji =1;
		boolean flag ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			System.out.println("更新界面");
			System.out.println("1.修改密码");
			System.out.println("2.修改性别");
			System.out.println("3.修改邮箱");
			System.out.println("4.返回主界面");
			System.out.println("5.退出系统");
			while (biaoji!=0) {
				try {
					//读取用户输入信息操作选项的数字，同时转换为int型
					b = Integer.parseInt(br.readLine());
					//中断该循环，进入下一步操作：i值判断
					break;
				} catch (Exception e) {
					//出现异常时，提示错误信息，再重新输入
					System.out.println("输入错误信息，只能输入1-5的数字.");
					System.out.println("请你重新输入");
				}
			}
			switch (b) {
			case 1:
				System.out.println("将密码改为");
				String password;
				try {
					password = br.readLine();
					flag =uc.updatepassword(userid, password);	
					if( flag == true)
						System.out.println("更改数据成功");
					else
						System.out.println("更改数据失败");
					biaoji=0;
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}						
				 
			case 2:
				System.out.println("将性别改为");
				String sex;
				try {
					sex = br.readLine();
					 flag =uc.updatesex(userid, sex);
					 if( flag == true)
							System.out.println("更改数据成功");
						else
							System.out.println("更改数据失败");
					 biaoji=0;
						break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			case 3:
				try {
				while(true) {
					System.out.println("请输入邮箱：");
					String email = br.readLine();
					if(TypeUtil.checkEmail(email)){						
						flag=uc.updateemail(userid, email);
						if(flag == true)
							{System.out.println("更改数据成功");
							System.out.println("==================");
							break;}
						else
							System.out.println("更改数据失败");
						
				
				} }
				biaoji=0;						
				break;
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				 
				//退出当前界面
			case 4:
				 putong=0;
				 break;
			case 5:
				System.exit(0);
			default: //输入值是1-5外
				System.out.println("您输入的操作不正确，请重新输入");
			}
			
		}
	}
	
	
	
	

	
	
	
	
	
	
}
