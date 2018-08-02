package com.lingnan.usersys.usermgr.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lingnan.usersys.common.util.TypeUtil;
import com.lingnan.usersys.user.controller.UserController;
import com.lingnan.usersys.usermgr.domain.UserDto;

public class AdminFrame extends NormalFrame{

	/**
	 * 带参数的构造器，用于初始化user属性
	 * @param user
	 */
	public AdminFrame(UserDto user) {
		super(user);
	}
	
	/**
	 * 管理员界面
	 */
	public void show() {
		System.out.println("你是管理员，你有以下权限");
		System.out.println("1.查询用户的信息");
		System.out.println("2.更改用户信息");
		System.out.println("3.增加用户信息");
		System.out.println("4.删除用户信息");
		System.out.println("5.退出");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = -1;
		int biaoji = 1;
		//读取用户控制台输入，如果输入值正确，中断循环，否则提示错误信息，再重新输入
		while (biaoji!=0) {
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
			this.addShow("管理员");
			break;
		case 4:
		    this.deleteShow();
			break;
			
		case 5:
			System.out.println("感谢你的使用，再会");
			//退出当前界面
			System.exit(0);
		default: //输入值是1-3外
			System.out.println("您输入的操作不正确，请重新输入");
		}
		
	}
	
	/**
	 * 管理员查找页面
	 */
	public void searchShow() {
		int biaoji=1;
		while(biaoji!=0){
			System.out.println("查找功能");
			System.out.println("1.查找全部数据");
			System.out.println("2.按userid查找");
			System.out.println("3.按username查找");
			System.out.println("4.分页查找");
			System.out.println("5.返回主页面");	
			System.out.println("6.退出系统");	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			UserController uc = new UserController();
			int a = -1;
			 int cha=1;
			//读取用户控制台输入，如果输入值正确，中断循环，否则提示错误信息，再重新输入
			while (cha!=0) {
				try {
					//读取用户输入信息操作选项的数字，同时转换为int型
					a = Integer.parseInt(br.readLine());
					//中断该循环，进入下一步操作：i值判断
					break;
					
				} catch (Exception e) {
					//出现异常时，提示错误信息，再重新输入
					System.out.println("输入错误信息，只能输入1-6的数字.");
					System.out.println("请你重新输入");
				}
			}
			
			switch (a) {
			case 1:
				System.out.println("以下是全部数据");
				uc.selectAll();	
				cha=0;
				break;
			case 2:
				System.out.println("请输入userid");
				int userid;
				try {
					userid =Integer.parseInt(br.readLine());					
				    uc.selectuerid(userid);
				    cha=0;
					break;
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			case 3:
				System.out.println("请输入username");
				String username;
				try {
					username = br.readLine();
					uc.selectusername(username);
					cha=0;
					break;
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
			case 4:
				System.out.println("请输入一页显示的行数");
								
				try {
					
					int row = Integer.parseInt(br.readLine());
					System.out.println("请输入数字，代表查看页数");
					int page = Integer.parseInt(br.readLine());
					uc.selectpage(page, row);
					cha=0;
					break;
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				//退出当前界面
				
			 case 5:
				 
				 biaoji=0;
				break;//System.exit(0);
             case 6:			
            	System.exit(0);
			 default: //输入值是1-6外
				System.out.println("您输入的操作不正确，请重新输入");
			}
			
		}
			
		}
	
	/**
	 * 管理员更新界面
	 */
	public void updateShow() {
		int biaoji=1;
		while(biaoji!=0){
			UserController uc = new UserController();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			int biaoji1=1;
			int b =-1;
			boolean flag;
			int userid;
			System.out.println("更新界面");
			System.out.println("1.修改密码");
			System.out.println("2.修改性别");
			System.out.println("3.修改邮箱");
			System.out.println("4.修改全部数据");
			System.out.println("5.返回主界面");
			System.out.println("6.退出系统");
			while (biaoji1!=0) {
				try {
					//读取用户输入信息操作选项的数字，同时转换为int型
					b = Integer.parseInt(br.readLine());
					//中断该循环，进入下一步操作：i值判断
					break;
				} catch (Exception e) {
					//出现异常时，提示错误信息，再重新输入
					System.out.println("输入错误信息，只能输入1-3的数字.");
					System.out.println("请你重新输入");
				}
			}
			switch (b) {
			case 1:
				
				try {
					System.out.println("输入userid");
					userid=Integer.parseInt(br.readLine());
					System.out.println("将密码改为");
					String password;
					password = br.readLine();
					flag =uc.updatepassword(userid, password);	
					if( flag == true)
						{System.out.println("更改数据成功");
						System.out.println("=================");}
					else
						{System.out.println("没有该用户，更改数据失败");
					    System.out.println("=================");
						}
					biaoji1=0;
					break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}										 
			case 2:				
				try {					
					System.out.println("输入userid");
					userid=Integer.parseInt(br.readLine());
					System.out.println("将性别改为");
					String sex;
					sex = br.readLine();
					 flag =uc.updatesex(userid, sex);
					 if( flag == true)
							{System.out.println("更改数据成功");
					        System.out.println("=================");
							}
						else
							{System.out.println("没有该用户，更改数据失败");
					 		System.out.println("=================");
							}
					 biaoji1=0;
						break;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 				
			case 3:
				try {
					System.out.println("输入userid");
					userid=Integer.parseInt(br.readLine());
					while(true) {
						System.out.println("请输入邮箱：");
						String email = br.readLine();
						if(TypeUtil.checkEmail(email)){						
							flag=uc.updateemail(userid, email);
							if(flag == true)
								{System.out.println("更改数据成功");
								System.out.println("=================");						
								break;}
							else
								{System.out.println("没有该用户，更改数据失败");
							    System.out.println("=================");
								}										
					} 
						}
					 biaoji1=0;
					break;
					
				}
					catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 				 			
			case 4:
				try {
					UserDto s = new UserDto();
					System.out.println("请输入userid");
					userid = Integer.parseInt(br.readLine());
					System.out.println("将用户名改为");
					s.setUsername(br.readLine()) ;
					System.out.println("将密码改为");
					s.setPasswd(br.readLine());
					System.out.println("将性别改为");
					s.setSex(br.readLine());
					while(true) {
						System.out.println("请输入邮箱：");
						String email = br.readLine();
						if(TypeUtil.checkEmail(email)){
							s.setEmail(br.readLine());
							break;
						}}					
					System.out.println("将身份改为");
					s.setPower(br.readLine());				
					 flag = uc.updateAll(userid, s);
					if( flag == true)
						System.out.println("更改数据成功");
					else
						System.out.println("更改数据失败");
					biaoji1=0;
					break;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			case 5:
				 biaoji=0;
				 break;
			case 6:
				//退出当前界面
				System.exit(0);
			default: //输入值是1-6外
				System.out.println("您输入的操作不正确，请重新输入");
			}			
		}	
		}
		
	/**
	 * 插入数据
	 */
	public void addShow(String type) {
		int biaoji=1;
		while(biaoji!=0){
		//声明缓冲处理对象，用于接收控制台输入的数据
		if(type.equals("管理员")) {
		System.out.println("请插入数据：");
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
				}}
				System.out.println("请输入身份：");
				user.setPower(br.readLine());
				//调用控制器中addUser方法，进行插入数据操作
				UserController uc = new UserController();
				boolean flag = uc.addUser(user);
				if(flag == true)
					System.out.println("插入数据成功");
				else
					System.out.println("用户名重复，插入数据失败");
				
				biaoji=0;							
			}	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}		
	      }
		}
    
	/**
	 * 删除的界面
	 */
	public void deleteShow() {
		int biaoji=1;
		while(biaoji!=0){System.out.println("请输入userid");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int userid = Integer.parseInt(br.readLine());
			UserController uc = new UserController();
			boolean flag = uc.deleteUser(userid);
			if(flag == true) {
				System.out.println("删除成功");
			}
			else
				System.out.println("删除失败");
			biaoji=0;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}}
	
	
	}


