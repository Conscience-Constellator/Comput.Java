package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Sorc.Cod_Nod;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Conect.Nod.Tre_Nod;

public class Annotation extends Cod_Nod
{
	public static final Clas_Rap Class=Init_StRt(Annotation.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public String Identifier;

	@Override public String toString()
	{return "@"+this.Identifier;}

	@Override public void Set_StM(Tre_Nod Stem){}
	@Override public Tre_Nod Get_StM(){return null;}
	@Override public void Ad_Branch(Tre_Nod Branch){}
	@Override public void Rem_Branch(Tre_Nod Branch){}

	public Annotation()
	{}

	static{Init_Nd(Annotation.class);}
}