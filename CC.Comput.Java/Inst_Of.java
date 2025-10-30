package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Bool.Point$Bool;
import java.util.HashMap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Inst_Of<Typ> extends Clas_Havr_Abs.Clas_Havr implements Point$Bool<Object>
{
	public static final Clas_Rap Class=Init_StRt(Inst_Of.class
		,Clas_Rap.class
	);/*Dep ?done*/

	private Inst_Of(Class<Typ> Clas)
	{
		super(Clas);
		List.put(Clas,this);
	}
	public Inst_Of(){}

	@Override public boolean Point$Bool(Object Object){return Clas().isInstance(Object);}

	public static HashMap<Class<?>,Inst_Of<?>> List=new HashMap<>();
		public static <Typ> Inst_Of<Typ> Get(Class<Typ> Clas){return (List.containsKey(Clas))?(Inst_Of<Typ>)List.get(Clas):new Inst_Of<>(Clas);}

	static{Init_Nd(Inst_Of.class);}
}