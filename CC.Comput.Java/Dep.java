package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap;

import CC.List.Map_Plus;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.Try_Get_Meth;

import java.util.HashMap;

public interface Dep
{
	Clas_Rap Class=Init_StRt(Dep.class
		,Clas_Rap.class
	);/*Dep ?done*/

	void P();

	void P_();
	HashMap<Class<?>,?> P=Map_Plus.Put_List_New(
		String.class,Meth_Rap.Try_Get_Meth_Ne(Dep.class,"P_")
	);
}