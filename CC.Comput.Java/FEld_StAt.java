package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Prim.Point_Havr;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.FEld_Rflect.*;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;

public class FEld_StAt<Typ> implements Point_Havr<Typ>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Feld_Stat.class,
		Class.class);
	/*Dep ?done*/

	public Field FEld;
		@Override public Typ Get_Point(){return Try_Get(FEld);}
		@Override public void Set_Point(Typ ValU){Try_Set(FEld,ValU);}

	public static Map<Field,FEld_StAt> Registry=new HashMap<>();
		public static void Reg(Field FEld){Registry.put(FEld,new FEld_StAt(FEld));}
		public static FEld_StAt Get(Field FEld)
		{
			if(!Registry.containsKey(FEld))
			{Reg(FEld);}

			return Registry.get(FEld);
		}

	public FEld_StAt(Field FEld)
	{this.FEld=FEld;}
		public FEld_StAt(Class<?> Clas,String NAm)
		{this(Try_Get_Declard_FEld(Clas,NAm));}
	public FEld_StAt()
	{}

//	static{Init_Nd(Feld_Stat.class);}
}