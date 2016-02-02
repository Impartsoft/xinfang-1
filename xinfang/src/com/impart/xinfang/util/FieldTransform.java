package com.impart.xinfang.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 针对一些表中的字段类型进行转换
 * @author 郑宝林
 * @version 1.0 2016-02-02
 */
public class FieldTransform {
	
	private static final HashMap<Integer, String> states = new HashMap<>();
	
	static{
		states.put(0, "已受理");
		states.put(1, "待批示");
		states.put(2, "待分发");
		states.put(3, "办理中");
		states.put(4, "办理完成");
		states.put(5, "已反馈");
		states.put(6, "已奖励");
		states.put(7, "已归档");
	}

	/**
	 * 将案件状态字段转化为相应的字符串描述
	 * @param state
	 * @return
	 */
	public static String acceptStateToStr(int state){
		return states.get(state);
	}
	
	public static int acceptStrToState(String desc){
		for (Iterator<Entry<Integer, String>> iterator = states.entrySet().iterator(); iterator
				.hasNext();) {
			Map.Entry<Integer, String> entry = iterator.next();
			if(entry.getValue().equals(desc)){
				return entry.getKey();
			}
		}
		return 0;
	}
}
