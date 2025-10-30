package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.io.File;

public class Clas_Fil_Par
{
	/*
	public static final Clas_Rap Class=Init_StRt(Clas_Fil_Par.class,
		Clas_Rap.class,
		File.class);
	/*Dep done*/

	public Clas_Fil_Par(Class<?> Clas,File Fil)
	{
		this.Clas=Clas;
		this.Fil=Fil;
	}
	public Clas_Fil_Par(){}

	public Class<?> Clas;
	public File Fil;

//	static{Init_Nd(Clas_Fil_Par.class);}
}