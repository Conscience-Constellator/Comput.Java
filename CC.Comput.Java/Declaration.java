package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Scrut.Tok_Composit;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Sorc.Token;

public class Declaration extends Tok_Composit
{
	public static final Clas_Rap Class=Init_StRt(Declaration.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Declaration(Token Token){this.Name=Token;}

	public Token Name;

	@Override public String toString()
	{
		StringBuilder Builder=new StringBuilder();
		Builder.append(this.Name.toString());
		return Builder.toString();
	}

	static{Init_Nd(Declaration.class);}
}