package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Meth_Rap.Try_Inv;

import static CC.Util.Fun.V.V;

public interface Clas_Fun
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Clas_Fun.class,
		Clas_Rap.class);
	/*Dep done*/

	void Clas_Task(Class<?> Clas);

	class Task_Clas<Clas> extends Clas_Havr<Clas> implements Clas_Fun
	{
		/*
		public static final Clas_Rap Class=Init_StRt(Task_Clas.class,
			Class.class);
		/*Dep ?done*/

		public Task_Clas(Class<Clas> Clas)
		{super(Clas);}
		public Task_Clas()
		{}

		@Override
		public void Clas_Task(Class<?> Clas)
		{Try_Inv(Clas(),"Clas_Task",V(Clas));}
	}
}