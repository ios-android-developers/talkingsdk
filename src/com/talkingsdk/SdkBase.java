package com.talkingsdk;

import com.talkingsdk.models.LoginData;
import com.talkingsdk.models.PayData;

import android.app.Activity;

public interface SdkBase{
	// 初始化全局数据，早于所有的UI和业务之前
	public void initSdk(Object obj);
	// 在initSdk之后，由android.intent.action.MAIN 在OnCreate调用初始化UI方面的工作，比如91可以初试悬浮条
	public void initUI(Activity parentActivity);
	// 在C++中调用，实现显示平台（比如91）的登录界面
	public void login();
	// 在C++中调用，实现显示平台（比如91）的支付界面
	public void pay(PayData payData);
	// 在C++中调用，实现退出平台
	public void logout();
	// 在C++中调用，实现显示平台（比如91）的登录界面
	public void changeAccount();
	public void exit();
	// 在登录成功以后，有关登录的数据（username,sessionid)等存储在LoginData对象里，该函数获取LoginData实例对象
	public LoginData getLoginData();
}