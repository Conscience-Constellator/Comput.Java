package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Concept.DOF.DOF;
import CC.Encycloped.Concept.DOF.PODOF;

public class Java_Par_List
{
	public static final Clas_Rap Class=Init_StRt(Java_Par_List.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Java_Par_List(boolean Ret,boolean This,Class... List){Set_Par_List(Ret,This,List);}
	public Java_Par_List(){}

	public Class[] List;
		public Class[] List(){return List;}
		public void Set_List(Class... List){this.List=List;}
	/**Parameters carried by registers.*/
	public boolean Ret,This;
		public boolean Ret(){return Ret;}
		public void Set_Ret(boolean Ret){this.Ret=Ret;}
		public boolean This(){return This;}
		public void Set_This(boolean This){this.This=This;}

		public void Set_Par_List(boolean Ret,boolean This,Class... List)
		{
			Set_Ret(Ret);
			Set_This(This);
			Set_List(List);
		}

	public static final PODOF
		No=new PODOF()
		,Is=new PODOF()
	;
	public static final DOF Carid_By_Reg=new DOF();

	static{Init_Nd(Java_Par_List.class);}
}