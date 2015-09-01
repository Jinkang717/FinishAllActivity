package com.example.util;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
/**
 * activity管理器
 * 用于管理多个activity,提供一次退出所有activity的方法
 * 建议在基类中实现,避免多次调用同样的静态方法
 * @author ChengJinkang
 *
 */
public class ActivityCollector {
	/**
	 * 在活动管理器中，通过一个 List 来暂存活动
	 */
	public static List<Activity> activities = new ArrayList<Activity>();
	/**
	 * 将当前正在创建的活动添加到活动管理器里
	 * @param activity
	 */
	public static void addActivity(Activity activity) {
		activities.add(activity);
	}
	/**
	 * 将一个要销毁的活动从活动管理器里移除
	 * @param activity
	 */
	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}
	
	/**
	 * 将 List 中存储的活动全部都销毁掉(一次退出所有activity)
	 */
	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}
