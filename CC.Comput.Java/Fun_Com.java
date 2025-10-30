package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Fun_Intrfac;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Util.Conect.Nod.Tre_Nod;

public abstract class Fun_Com<Ret> extends Phys_Com implements Fun_Intrfac<Ret>
{
	public static final Clas_Rap Class=Init_StRt(Fun_Com.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Fun_Com(){}

	@Override public Ret V_Rsult(Object... Contxt)
	{return null;}

	public void Ad_Branch(Tre_Nod Branch){}
	public void Rem_Branch(Tre_Nod Branch){}

	static{Init_Nd(Fun_Com.class);}
}