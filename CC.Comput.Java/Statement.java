package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.Object_Plus;

import java.util.ArrayList;

public class Statement extends Object_Plus
{
	public static final Clas_Rap Class=Stat_Notif.Init_StRt(Statement.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Statement(){}

	public String toString(){return null;}

	public interface Statmnt_Havr
	{
		Clas_Rap Class=Ad_Reg_Task(Statmnt_Havr.class);

		interface Statmnt_List_Havr extends Statmnt_Havr
		{
			Clas_Rap Class=Ad_Reg_Task(Statmnt_List_Havr.class);

			ArrayList<Statement> Stat_List();
		}
	}

	static{
		Stat_Notif.Init_Nd(Statement.class);}
}