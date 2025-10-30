package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.lang.instrument.Instrumentation;
import java.util.HashMap;

public class Java
{
	public static final Clas_Rap Class=Init_StRt(Java.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public HashMap<String,String> Token_List;

	public Java(){}

	public static Instrumentation Instrumentation;

	public String toString()
	{
		String var10000=System.getProperty("java.vm.name");

		return "Java:\n\tVM:"+var10000+"|version:"+System.getProperty("java.vm.version")+"\n\tCompiler:"+System.getProperty("java.compiler")+"\n\tversion:"+System.getProperty("java.version")+"\n\tTo string:"+Runtime.getRuntime().toString()+"|version:"+System.getProperty("java.runtime.version")+"\n\textension directory"+System.getProperty("java.ext.dirs")+"\n\tlibrary path"+System.getProperty("java.library.path")+"\n\tvendor"+System.getProperty("java.vendor")+"|URL:"+System.getProperty("java.vendor.url");
	}

	static{Init_Nd(Java.class);}
}