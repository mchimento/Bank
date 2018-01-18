package larva;


import bank.UserInterface;
import bank.Account;
import ppArtifacts.*;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_args_integrity0 implements _callable{

public static PrintWriter pw; 
public static _cls_args_integrity0 root;
public static Channel ch = new Channel();
public static Channel cact1 = new Channel("cact1");
public static Channel cact2 = new Channel("cact2");

public static LinkedHashMap<_cls_args_integrity0,_cls_args_integrity0> _cls_args_integrity0_instances = new LinkedHashMap<_cls_args_integrity0,_cls_args_integrity0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("/home/chimento/Example/out//output_args_integrity.txt");

root = new _cls_args_integrity0();
_cls_args_integrity0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_args_integrity0 parent; //to remain null - this class does not have a parent!
public static int money;
public static UserInterface f;
int no_automata = 1;
 public int aux =- 1 ;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_args_integrity0() {
}

public void initialisation() {
}

public static _cls_args_integrity0 _get_cls_args_integrity0_inst() { synchronized(_cls_args_integrity0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_args_integrity0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 1;
}

public void _call(String _info, int... _event){
synchronized(_cls_args_integrity0_instances){
_performLogic_prop_args_integrity(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){

_cls_args_integrity1[] a1 = new _cls_args_integrity1[1];
synchronized(_cls_args_integrity1._cls_args_integrity1_instances){
a1 = _cls_args_integrity1._cls_args_integrity1_instances.keySet().toArray(a1);}
for (_cls_args_integrity1 _inst : a1)
if (_inst != null){
_inst._call(_info, _event); 
_inst._call_all_filtered(_info, _event);
}

_cls_args_integrity2[] a2 = new _cls_args_integrity2[1];
synchronized(_cls_args_integrity2._cls_args_integrity2_instances){
a2 = _cls_args_integrity2._cls_args_integrity2_instances.keySet().toArray(a2);}
for (_cls_args_integrity2 _inst : a2)
if (_inst != null){
_inst._call(_info, _event); 
_inst._call_all_filtered(_info, _event);
}
}

public static void _call_all(String _info, int... _event){

_cls_args_integrity0[] a = new _cls_args_integrity0[1];
synchronized(_cls_args_integrity0_instances){
a = _cls_args_integrity0_instances.keySet().toArray(a);}
for (_cls_args_integrity0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_args_integrity0_instances){
_cls_args_integrity0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_prop_args_integrity = 2;

public void _performLogic_prop_args_integrity(String _info, int... _event) {

_cls_args_integrity0.pw.println("[prop_args_integrity]AUTOMATON::> prop_args_integrity("+") STATE::>"+ _string_prop_args_integrity(_state_id_prop_args_integrity, 0));
_cls_args_integrity0.pw.flush();

if (0==1){}
else if (_state_id_prop_args_integrity==2){
		if (1==0){}
		else if ((_occurredEvent(_event,6/*withdraw_en*/)) && (money >0 )){
		aux =money ;
cact2 .send (new Tmp_args_integrity (f .getUser ().getAccount ()));

		_state_id_prop_args_integrity = 1;//moving to state idle
		_goto_prop_args_integrity(_info);
		}
		else if ((_occurredEvent(_event,2/*deposit_en*/)) && (money >0 )){
		aux =money ;
cact1 .send (new Tmp_args_integrity (f .getUser ().getAccount ()));

		_state_id_prop_args_integrity = 1;//moving to state idle
		_goto_prop_args_integrity(_info);
		}
}
else if (_state_id_prop_args_integrity==1){
		if (1==0){}
		else if ((_occurredEvent(_event,0/*rch*/))){
		
		_state_id_prop_args_integrity = 2;//moving to state init
		_goto_prop_args_integrity(_info);
		}
		else if ((_occurredEvent(_event,0/*rch*/))){
		
		_state_id_prop_args_integrity = 2;//moving to state init
		_goto_prop_args_integrity(_info);
		}
		else if ((_occurredEvent(_event,8/*withdraw_ex*/))){
		
		_state_id_prop_args_integrity = 0;//moving to state bad
		_goto_prop_args_integrity(_info);
		}
		else if ((_occurredEvent(_event,4/*deposit_ex*/))){
		
		_state_id_prop_args_integrity = 0;//moving to state bad
		_goto_prop_args_integrity(_info);
		}
}
}

public void _goto_prop_args_integrity(String _info){
 String state_format = _string_prop_args_integrity(_state_id_prop_args_integrity, 1);
_cls_args_integrity0.pw.println("[prop_args_integrity]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + state_format);
_cls_args_integrity0.pw.flush();
}

public String _string_prop_args_integrity(int _state_id, int _mode){
switch(_state_id){
case 2: if (_mode == 0) return "init"; else return "init";
case 0: if (_mode == 0) return "bad"; else return "!!!SYSTEM REACHED BAD STATE!!! bad "+new _BadStateExceptionargs_integrity().toString()+" ";
case 1: if (_mode == 0) return "idle"; else return "idle";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}
