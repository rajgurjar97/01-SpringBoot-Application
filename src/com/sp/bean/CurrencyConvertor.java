package com.sp.bean;

import java.io.Serializable;

public abstract class CurrencyConvertor implements Serializable {
	/*private static CurrencyConvertor object; //lazay instantiation
	private CurrencyConvertor() {
		//no operation
	}
	public static CurrencyConvertor getObject() {
		if(object==null) {
	       object=new CurrencyConvertor();
		}
		return object;
	}*/
	/*private static CurrencyConvertor object=new CurrencyConvertor();//eager instantiation
	private CurrencyConvertor() {
		//no operation
	}
	public static CurrencyConvertor getObject() {
		return object;
	}*/
	/*private static CurrencyConvertor object; //static block
	static {
		object=new CurrencyConvertor();
	}
	private CurrencyConvertor() {
		//no operation
	}
	public static CurrencyConvertor getObject() {
		
		return object;
	}*/
	
	/*private static CurrencyConvertor object; //lazay instantiation
	private CurrencyConvertor() {
		//no operation
	}
	public static synchronized CurrencyConvertor getObject() {
		if(object==null) {
			object=new CurrencyConvertor();
		}
		return object;
	}*/
	/*private static CurrencyConvertor object; //lazay instantiation
	private CurrencyConvertor() {
		//no operation
	}
	public static  CurrencyConvertor getObject() {
		if(object==null) {
		synchronized(CurrencyConvertor.class) {
		if(object==null) {
			object=new CurrencyConvertor();
		}
		}
		}
		return object;
	}*/
	
	private static CurrencyConvertor object; //lazay instantiation
	private CurrencyConvertor() {
		//no operation
	}
	public static CurrencyConvertor getObject() {
		if(object==null) {
			object=new CurrencyConvertor() {};
		}
		return object;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
	throw new CloneNotSupportedException("cloning not spported") ;
	}
	
	public Object readResolve() {
		return getObject();
	}
}
