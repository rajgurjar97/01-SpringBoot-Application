package com.sd.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sp.bean.CurrencyConvertor;

public class SDTest {

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	CurrencyConvertor cc=CurrencyConvertor.getObject();
		CurrencyConvertor cc1=CurrencyConvertor.getObject();
		System.out.println(cc.hashCode());
		System.out.println(cc1.hashCode());
		System.out.println("cc==cc1?"+(cc==cc1));
	    System.out.println(".........");
	/*	Worker w=new Worker();
		for(int i=0;i<=50;i++) {
			Thread t=new Thread(w);
			Thread t1=new Thread(w);
			t.start();
			t1.start();
		}*/
		
		/*	CurrencyConvertor cc=CurrencyConvertor.getObject();
		   // CurrencyConvertor cc1=CurrencyConvertor.getObject();
			CurrencyConvertor cc1=(CurrencyConvertor) cc.clone();
		System.out.println(cc.hashCode());
		System.out.println(cc1.hashCode());
		System.out.println("cc==cc1?"+(cc==cc1));	*/

		
		/*	CurrencyConvertor c=CurrencyConvertor.getObject();
			serialize(c,"D:\\ran.ser");
			
	    CurrencyConvertor cc=(CurrencyConvertor) deserialize("D:\\ran.ser");
		
	   CurrencyConvertor cc1=(CurrencyConvertor) deserialize("D:\\ran.ser");
		//CurrencyConvertor cc1=(CurrencyConvertor) cc.clone();
	System.out.println(c.hashCode());
	System.out.println(cc.hashCode());
	System.out.println("cc==cc1?"+(cc==cc1));*/
	/*	Class<?> clazz = null;
		Class<?>[] argsTypes = null;
		Constructor<?> defaultConstructor = null;

		argsTypes = new Class<?>[0];
		clazz = Class.forName("com.sp.bean.CurrencyConvertor");
		defaultConstructor = clazz.getDeclaredConstructor(argsTypes);
		defaultConstructor.setAccessible(true);
		Object obj1 = defaultConstructor.newInstance();
		Object obj2 = defaultConstructor.newInstance();
		
		System.out.println("obj1 hc : "+ obj1.hashCode());
		System.out.println("obj2 hc : " + obj2.hashCode());*/

	}

	public static void serialize(Object obj, String outFile) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;

		oos = new ObjectOutputStream(new FileOutputStream(outFile));
		oos.writeObject(obj);
		oos.close();
	}

	public static Object deserialize(String inFile) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(inFile));
		return ois.readObject();
	}

}

	
