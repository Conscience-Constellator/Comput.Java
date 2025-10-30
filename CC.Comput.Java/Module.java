package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.IO.Fil_Nod;
import CC.Util.Object_Plus;
import CC.Util.Prog.Prog_Man;
import java.io.File;
import java.util.HashMap;

public class Module extends Object_Plus
{
	public static final Clas_Rap Class=Init_StRt(Module.class
		,Clas_Rap.class
	);/*Dep ?done*/
	public static Fil_Nod Mod_List_Fil=new Fil_Nod(Prog_Man.File,"Module");

	public Module(Fil_Nod File)
	{
		this.File=File;
		File.Set_Onr(this);
		Load();
	}
	public Module(String Name){this(new Fil_Nod(Mod_List_Fil,Name));}
	public Module(){}

	public Fil_Nod File;
	public static String
		ConscienceConstellatorsEmulator
		,ConscienceConstellatorsGame
		,ConscienceConstellatorsGameEngine
		,ConscienceConstellatorsModuleEditor
		,ConscienceConstellatorsSaveEditor
		,ConscienceConstellatorsResourceEditor
		,ConscienceConstellatorsResourcePackSystem
		,Template
	;

	public void Load(){if(File.Fil_Rap.exists()){}}

	//public void Execute(){if(!Registry.containsKey(File.Address.get(File.Address.size()+1))){}}

	public static HashMap<String,Module> Registry=new HashMap();
		public void Register(){Registry.put(String.join(".",File.AdrS()),this);}
		public static void Register(Fil_Nod File){new Module(File).Register();}
		public static void Register(String Name){new Module(Name).Register();}
		public static Module Get(String Address)
		{
			if(!Registry.containsKey(Address)){Register(Address);}

			return (Module)Registry.get(Address);
		}

	static
	{
		for(File File:Mod_List_Fil.Fil_Rap.listFiles())
		{
			if(File.isDirectory())
			{
				File Head=new File(File.getPath()+"\\Head.CCPRMH");
				if(Head.exists()){new Module(Fil_Nod.Get(File)).Register();}
			}
		}

		ConscienceConstellatorsEmulator="/Conscience Constellator's emulator";
		ConscienceConstellatorsGame="/Conscience Constellator's game";
		ConscienceConstellatorsGameEngine="/Conscience Constellator's game engine";
		ConscienceConstellatorsModuleEditor="/Conscience Constellator's module editor";
		ConscienceConstellatorsSaveEditor="/Conscience Constellator's save editor";
		ConscienceConstellatorsResourceEditor="/Conscience Constellator's resource editor";
		ConscienceConstellatorsResourcePackSystem="/Conscience Constellator's resource pack system";
		Template="/Template";
	}

	static{Init_Nd(Module.class);}
}