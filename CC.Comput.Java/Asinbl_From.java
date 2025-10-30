package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.From_Inst;
import CC.Bool.Point$Bool;
import CC.Bool.Point_ID;
import CC.Bool.Point_IO_Bool;
import java.lang.reflect.Field;
import java.util.HashMap;

public class Asinbl_From<Typ>
	extends Clas_Havr_Abs.Clas_Havr<Typ>
	implements Point$Bool<Class<Typ>>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Asinbl_From.class,
		Clas_Rap.class);
	/*Dep ?don*/

	@Override
	public boolean Point$Bool(Class<Typ> Clas)
	{return Clas().isAssignableFrom(Clas);}

	public static HashMap<Class<?>,Asinbl_From> List_=new HashMap<>();
		public static <Typ>Asinbl_From<Typ> Get_X(Class<Typ> Clas)
		{return List_.get(Clas);}
			public static <Typ>Asinbl_From<Typ> Get_X_Or_Ad(Class<Typ> Clas)
			{
				if(!Cont(Clas)){Ad_Clas(Clas);}

				return Get_X(Clas);
			}
	public static HashMap<Class<?>,Point_ID> List=new HashMap<>();
		public static <Typ>Point_ID Get(Class<Typ> Clas)
		{return List.get(Clas);}
			public static <Typ>Point_ID Get_Or_Ad(Class<Typ> Clas)
			{
				if(!Cont(Clas)){Ad_Clas(Clas);}

				return Get(Clas);
			}
	public static HashMap<Class,Point_IO_Bool<Field,Class>> List_Feld=new HashMap<>();
		public static <Typ> Point_IO_Bool<Field,Class> Get_Feld(Class<Typ> Clas){return List_Feld.get(Clas);}
			public static <Typ> Point_IO_Bool<Field,Class> Get_Feld_Or_Ad(Class<Typ> Clas)
			{
				if(!Cont(Clas)){Ad_Clas(Clas);}

				return Get_Feld(Clas);
			}
	public static HashMap<Class,Point_IO_Bool<Field,Class>> List_Feld_X=new HashMap<>();
		public static <Typ> Point_IO_Bool<Field,Class> Get_Feld_X(Class<Typ> Clas){return List_Feld_X.get(Clas);}
			public static <Typ> Point_IO_Bool<Field,Class> Get_Feld_X_Or_Ad(Class<Typ> Clas)
			{
				if(!Cont(Clas)){Ad_Clas(Clas);}

				return Get_Feld_X(Clas);
			}

		public static <Typ>void Ad_Clas(Class<Typ> Clas)
		{
			Point_ID ID=new Point_ID(Clas);
			Asinbl_From<Typ> X=new Asinbl_From<>(Clas);
			List.put(Clas,ID);
			List_.put(Clas,X);
			List_Feld.put(Clas,new Point_IO_Bool<>(Get_Typ,ID));
			List_Feld_X.put(Clas,new Point_IO_Bool<>(Get_Typ,X));
		}
		public static boolean Cont(Class<?> Clas){return List.containsKey(Clas);}

	public static final From_Inst<java.lang.reflect.Field,Class> Get_Typ=From_Inst.Get(java.lang.reflect.Field.class,"getType");

	public Asinbl_From(Class<Typ> Clas)
	{super(Clas);}
	public Asinbl_From()
	{}

//	static{Init_Nd(Asinbl_From.class);}
}