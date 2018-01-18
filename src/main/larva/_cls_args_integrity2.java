package larva;


import bank.UserInterface;
import bank.Account;
import ppArtifacts.*;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_args_integrity2 implements _callable{

public static LinkedHashMap<_cls_args_integrity2,_cls_args_integrity2> _cls_args_integrity2_instances = new LinkedHashMap<_cls_args_integrity2,_cls_args_integrity2>();

_cls_args_integrity0 parent;
public static int money;
public static Account acc_tmp;
public static Tmp_args_integrity obj;
public Account acc;
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_args_integrity2( Account acc) {
parent = _cls_args_integrity0._get_cls_args_integrity0_inst();
this.acc = acc;
}

public void initialisation() {
}

public static _cls_args_integrity2 _get_cls_args_integrity2_inst( Account acc) { synchronized(_cls_args_integrity2_instances){
_cls_args_integrity2 _inst = new _cls_args_integrity2( acc);
if (_cls_args_integrity2_instances.containsKey(_inst))
{
_cls_args_integrity2 tmp = _cls_args_integrity2_instances.get(_inst);
 return _cls_args_integrity2_instances.get(_inst);
}
else
{
 _inst.initialisation();
 _cls_args_integrity2_instances.put(_inst,_inst);
 return _inst;
}
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_args_integrity2)
 && (acc == null || acc.equals(((_cls_args_integrity2)o).acc))
 && (parent == null || parent.equals(((_cls_args_integrity2)o).parent)))
{return true;}
else
{return false;}
}

public int hashCode() {
return (acc==null?1:acc.hashCode()) *(parent==null?1:parent.hashCode()) *1;
}

public void _call(String _info, int... _event){
synchronized(_cls_args_integrity2_instances){
_performLogic_check_args_integrity_cact2(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_args_integrity2[] a = new _cls_args_integrity2[1];
synchronized(_cls_args_integrity2_instances){
a = _cls_args_integrity2_instances.keySet().toArray(a);}
for (_cls_args_integrity2 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_args_integrity2_instances){
_cls_args_integrity2_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_check_args_integrity_cact2 = 10;

public void _performLogic_check_args_integrity_cact2(String _info, int... _event) {

_cls_args_integrity0.pw.println("[check_args_integrity_cact2]AUTOMATON::> check_args_integrity_cact2("+acc + " " + ") STATE::>"+ _string_check_args_integrity_cact2(_state_id_check_args_integrity_cact2, 0));
_cls_args_integrity0.pw.flush();

if (0==1){}
else if (_state_id_check_args_integrity_cact2==9){
		if (1==0){}
		else if ((_occurredEvent(_event,16/*m_en*/)) && (money ==parent.aux )){
		parent.aux =-1 ;
parent.ch .send ();

		_state_id_check_args_integrity_cact2 = 7;//moving to state ok
		_goto_check_args_integrity_cact2(_info);
           _killThis(); //discard this automaton since an accepting state has been reached
		}
		else if ((_occurredEvent(_event,16/*m_en*/)) && (money !=parent.aux )){
		
		_state_id_check_args_integrity_cact2 = 8;//moving to state bad
		_goto_check_args_integrity_cact2(_info);
		}
}
else if (_state_id_check_args_integrity_cact2==10){
		if (1==0){}
		else if ((_occurredEvent(_event,14/*rcact2*/))){
		
		_state_id_check_args_integrity_cact2 = 9;//moving to state idle
		_goto_check_args_integrity_cact2(_info);
		}
}
}

public void _goto_check_args_integrity_cact2(String _info){
 String state_format = _string_check_args_integrity_cact2(_state_id_check_args_integrity_cact2, 1);
_cls_args_integrity0.pw.println("[check_args_integrity_cact2]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + state_format);
_cls_args_integrity0.pw.flush();
}

public String _string_check_args_integrity_cact2(int _state_id, int _mode){
switch(_state_id){
case 8: if (_mode == 0) return "bad"; else return "!!!SYSTEM REACHED BAD STATE!!! bad "+new _BadStateExceptionargs_integrity().toString()+" ";
case 9: if (_mode == 0) return "idle"; else return "idle";
case 10: if (_mode == 0) return "start"; else return "start";
case 7: if (_mode == 0) return "ok"; else return "(((SYSTEM REACHED AN ACCEPTED STATE)))  ok";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}
