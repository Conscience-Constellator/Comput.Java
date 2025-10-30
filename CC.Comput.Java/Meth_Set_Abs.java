package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.Red_Meth;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.Try_Inv_Inst;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Meth_Rap.*;
import java.lang.reflect.Method;
import CC.Util.Prim.Int_Havr;

public interface Meth_Set_Abs<Rsult> extends Meth_Get<Rsult>
{
//	Clas_Rap Class=Init_StRt(Meth_Set.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	void Set_Meth(Method Get_Meth);
		default void Set_Meth(Class<?> Clas,String NAm,Class<?>[] PRg)
		{Set_Meth(Try_Get_Meth(Clas,NAm,PRg));}
			default void Set_Meth(String TXt,Int_Havr IndX)
			{Set_Meth(Red_Meth(TXt,IndX));}
	default <Ret>Ret Cal_Meth(Object Inst,Object... PRg)
	{return Try_Inv_Inst(Get_Meth(),Inst,PRg);}

	class Meth_Set<Rsult> implements CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Meth_Set_Abs<Rsult>
	{
//		public static final Clas_Rap Class=Init_StRt(Meth_Set.class,
//			Clas_Rap.class
//		);/*Dep ?done*/

		public Method Meth;
			@Override public Method Get_Meth()
			{return Meth;}
			@Override public void Set_Meth(Method Meth)
			{this.Meth=Meth;}

		public Meth_Set(Method Meth)
		{Set_Meth(Meth);}
		public Meth_Set()
		{}

//		static{Init_Nd(Meth_Set.class);}
	}
}
