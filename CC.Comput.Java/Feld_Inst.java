package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Feld_Rap.*;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.Prim.Point_Havr;
import java.lang.reflect.Field;

public class Feld_Inst<Typ> implements Point_Havr<Typ>
{
	public static final Clas_Rap Class=Init_StRt(Feld_Inst.class
		,Class.class
	);/*Dep ?done*/

	public Feld_Inst(Field Feld,Object Inst)
	{
		this.Feld=Feld;
		this.Inst=Inst;
	}
		public Feld_Inst(Class<?> Clas,String Nam,Object Inst){this(Try_Get_Declard_Feld(Clas,Nam),Inst);}
	public Feld_Inst(){}

	public Field Feld;
	public Object Inst;
		@Override public Typ $Point(){return Try_Get(Feld,Inst);}
		@Override public void Point$(Typ Valu){Try_Set(Feld,Inst,Valu);}

	static{Init_Nd(Feld_Inst.class);}
}
