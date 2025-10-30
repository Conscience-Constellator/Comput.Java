package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Bool.Point$Bool;
import CC.Bool.Point$Bool_No;

import java.lang.reflect.Member;

import static java.lang.reflect.Modifier.*;

public interface Modifier
{
	Clas_Rap Class=Stat_Notif.Init_StRt(Modifier.class
		,Clas_Rap.class
	);/*Dep ?done*/

	static boolean Finl(Member Mmbr){return isFinal(Mmbr.getModifiers());}
	static boolean Finl(java.lang.Class Typ){return isFinal(Typ.getModifiers());}
	static boolean Pub(Member Mmbr){return isPublic(Mmbr.getModifiers());}
	static boolean Pub(java.lang.Class Typ){return isPublic(Typ.getModifiers());}
	static boolean Dfalt(int Mod){return !isPublic(Mod)||isProtected(Mod)||isPrivate(Mod);}
		static boolean Dfalt(Member Mmbr){return Dfalt(Mmbr.getModifiers());}
		static boolean Dfalt(java.lang.Class Typ){return Dfalt(Typ.getModifiers());}
	static boolean Prot(Member Mmbr){return isProtected(Mmbr.getModifiers());}
	static boolean Prot(java.lang.Class Typ){return isProtected(Typ.getModifiers());}
	static boolean Priv(Member Mmbr){return isPrivate(Mmbr.getModifiers());}
	static boolean Priv(java.lang.Class Typ){return isPrivate(Typ.getModifiers());}
		static String AccS(int Mod)
		{
			if(isPublic(Mod)){return "public";}
			else if(isProtected(Mod)){return "protected";}
			else if(isPrivate(Mod)){return "private";}
			else{return "";}
		}
			static String AccS(Member Mmbr){return AccS(Mmbr.getModifiers());}
			static String AccS(java.lang.Class Typ){return AccS(Typ.getModifiers());}
	static boolean Stat(Member Mmbr){return isStatic(Mmbr.getModifiers());}
	static boolean Stat(java.lang.Class Typ){return isStatic(Typ.getModifiers());}
	static boolean Abs(Member Mmbr){return isAbstract(Mmbr.getModifiers());}
	static boolean Abs(java.lang.Class Typ){return isAbstract(Typ.getModifiers());}
		static String Bind(int Mod)
		{
			if(isStatic(Mod)){return "static";}
			else{return "abstract";}
		}
			static String Bind(Member Mmbr){return Bind(Mmbr.getModifiers());}
			static String Bind(Class Typ){return Bind(Typ.getModifiers());}
	static boolean Vol(Member Mmbr){return isVolatile(Mmbr.getModifiers());}
	static boolean Syn(Member Mmbr){return isSynchronized(Mmbr.getModifiers());}
	static boolean Strict(Member Mmbr){return isStrict(Mmbr.getModifiers());}
	static boolean Tran(Member Mmbr){return isTransient(Mmbr.getModifiers());}
	static boolean Nat(Member Mmbr){return isNative(Mmbr.getModifiers());}
	Point$Bool<Member> Stat=Modifier::Stat,Abs=Modifier::Abs,Pub=Modifier::Pub,Dfalt=Modifier::Dfalt,Prot=Modifier::Prot,Priv=Modifier::Priv,Finl=Modifier::Finl;
	Point$Bool_No<Member,Point$Bool<Member>> Inst=new Point$Bool_No<>(Stat),Imp=new Point$Bool_No<>(Modifier::Abs),Pub_No=new Point$Bool_No<>(Pub),Dfalt_No=new Point$Bool_No<>(Dfalt),Prot_No=new Point$Bool_No<>(Prot),Priv_No=new Point$Bool_No<>(Priv),Mutbl=new Point$Bool_No<>(Finl);
}