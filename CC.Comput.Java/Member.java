package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;

import static java.lang.reflect.Modifier.isFinal;
import CC.Util.NAm.AdrS_Havr_Abs;
import CC.Util.Object_Plus_Abs;

public interface Member extends Object_Plus_Abs,AdrS_Havr_Abs
{
//	Clas_Rap Class=Init_StRt_Nd(Member.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

		static String Rem_Nam(String AdrS)
		{return AdrS_Havr_Abs.Rem_NAm(AdrS,'.');}
		static String StM_AdrS(String AdrS)
		{return AdrS_Havr_Abs.StM(AdrS,'.');}
		default String StM_AdrS()
		{return StM_AdrS(AdrS());}
		default void Set_NAm(String NAm)
		{Rem_Nam(AdrS());}
		@Override
		default String Get_NAm()
		{return Dlimitr.NAm(AdrS());}
		Dlimitr_ContXt Dlimitr=new Dlimitr_ContXt('.');
		@Override
		default char Dlimitr()
		{return '.';}

	@Override
	default void Set_AdrS(String AdrS)
	{}
	int Mod();
	default String AccS()
	{return Modifier.AccS(Mod());}
	default void Set_AccS(String AccS)
	{}
		String[] AccS_Modg=new String[]{"public","protected","","private"};
	default String Bind()
	{return Modifier.Bind(Mod());}
	default void Set_Bind(String AccS)
	{}
		String[] Bind_Modg=new String[]{"","static","abstract"};
	default boolean FInl()
	{return isFinal(Mod());}

	default String Finl_To_String()
	{return !FInl()?"":"Final";}
}