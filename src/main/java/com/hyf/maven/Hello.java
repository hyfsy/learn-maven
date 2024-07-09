package com.hyf.maven;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.*;//��̬�������ֱ�ӵ��÷��������ü�����

public class Hello{
	
	public static void main(String[] args){
		System.out.println("hello world");
	}
	
	@Test
	public void sayHello(){

		HashMap<String,Object> Map  = new HashMap<String,Object>();
		System.out.println("hello maven");
		String s = "hello";
		assertEquals(s, "hello");
	}
	
}