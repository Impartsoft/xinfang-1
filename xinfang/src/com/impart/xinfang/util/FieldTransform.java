package com.impart.xinfang.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ���һЩ���е��ֶ����ͽ���ת��
 * @author ֣����
 * @version 1.0 2016-02-02
 */
public class FieldTransform {
	
	private static final HashMap<Integer, String> states = new HashMap<>();
	
	static{
		states.put(0, "������");
		states.put(1, "����ʾ");
		states.put(2, "���ַ�");
		states.put(3, "������");
		states.put(4, "�������");
		states.put(5, "�ѷ���");
		states.put(6, "�ѽ���");
		states.put(7, "�ѹ鵵");
	}

	/**
	 * ������״̬�ֶ�ת��Ϊ��Ӧ���ַ�������
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
