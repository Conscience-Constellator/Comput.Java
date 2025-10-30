package CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Sorc.Cod_Nod;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Syc.TXt.Text;
import CC.Util.Conect.Nod.Tre_Nod;
import java.util.ArrayList;

public class Block<Content extends Cod_Nod> extends Cod_Nod
{
	public static final Clas_Rap Class=Stat_Notif.Init_StRt(Block.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Block(){}

	@Override public void Set_StM(Tre_Nod StM){}
	@Override public Tre_Nod Get_StM(){return null;}

	public ArrayList<Content> Content_List=new ArrayList<>();

	@Override public String toString(){return Text.LIn_TrE("{",Text.List_To_String(this.Content_List,""),"}");}

	@Override public void Ad_Branch(Tre_Nod Branch){}
	@Override public void Rem_Branch(Tre_Nod Branch){}

	static{Init_Nd(Block.class);}
}