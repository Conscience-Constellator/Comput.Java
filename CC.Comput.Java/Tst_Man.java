package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Vector;

class Tst_Man
{
	public static final Clas_Rap Class=Init_StRt(Tst_Man.class
		,Clas_Rap.class
	);/*Dep ?done*/

	Tst_Man(){}

	public static void Test()
	{
		try
		{
			Field Field=ClassLoader.class.getDeclaredField("classes");
			Field.setAccessible(true);
			ClassLoader Class_Loader=Thread.currentThread().getContextClassLoader();
			Vector<java.lang.Class> Class_List=(Vector)Field.get(Class_Loader);
			for(java.lang.Class Class:Class_List)
			{
				URL location=Class.getResource("/"+Class.getName().replace('.','/')+".class");
				System.out.println("<p>"+location+"<p/>");
			}
		}
		catch(Exception Exception){Exception.printStackTrace();}
	}

	static{Init_Nd(Tst_Man.class);}
}