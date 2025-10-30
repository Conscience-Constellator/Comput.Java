package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import static CC.List.ArA_Util.Mach;
import CC.$.Q$Q.Point$Bool;
import CC.$.Q$Q_Rap.Point$Bool_No;
import java.lang.reflect.Executable;

public class PRg_Eqls implements Point$Bool<Executable>
{
	/*
	public static final Clas_Rap Class=Init_StRt(PRg_Eqls.class,
		Class.class);
	/*Dep ?done*/

	public Class<?>[] PRg;

	@Override
	public boolean Point$Bool(Executable Xecutbl)
	{return Mach(Xecutbl.getParameterTypes(),PRg);}

	public static final PRg_Eqls Dfalt=new PRg_Eqls();
		public static final Point$Bool_No<Executable,PRg_Eqls> Non_Defalt=new Point$Bool_No<>(Dfalt);

	public PRg_Eqls(Class<?>... PRg)
	{this.PRg=PRg;}

//	static{Init_Nd(Par_List_Eql.class);}
}
