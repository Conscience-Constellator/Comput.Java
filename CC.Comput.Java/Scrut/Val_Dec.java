package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Scrut;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.lang.reflect.Parameter;

public class Val_Dec
{
	public static final Clas_Rap Class=Init_StRt(Val_Dec.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Val_Dec(Parameter Par)
	{
		Typ=Class.Get(Par.getType());
		Identifier=Par.getName();
	}
	public Val_Dec(){}

	public Clas_Rap Typ;

	public String Identifier;

	static{Init_Nd(Val_Dec.class);}
}