package larva;


import bank.UserInterface;

import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_prop_deposit0 implements _callable{

public static PrintWriter pw; 
public static _cls_prop_deposit0 root;

public static LinkedHashMap<_cls_prop_deposit0,_cls_prop_deposit0> _cls_prop_deposit0_instances = new LinkedHashMap<_cls_prop_deposit0,_cls_prop_deposit0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("/home/chimento/Example/out//output_prop_deposit.txt");

root = new _cls_prop_deposit0();
_cls_prop_deposit0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_prop_deposit0 parent; //to remain null - this class does not have a parent!
public static int money;
public static UserInterface f;
public static String un;
public static int pwd;
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_prop_deposit0() {
}

public void initialisation() {
}

public static _cls_prop_deposit0 _get_cls_prop_deposit0_inst() { synchronized(_cls_prop_deposit0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_prop_deposit0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 1;
}

public void _call(String _info, int... _event){
synchronized(_cls_prop_deposit0_instances){
_performLogic_prop_deposit(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_prop_deposit0[] a = new _cls_prop_deposit0[1];
synchronized(_cls_prop_deposit0_instances){
a = _cls_prop_deposit0_instances.keySet().toArray(a);}
for (_cls_prop_deposit0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_prop_deposit0_instances){
_cls_prop_deposit0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_prop_deposit = 6;

public void _performLogic_prop_deposit(String _info, int... _event) {

_cls_prop_deposit0.pw.println("[prop_deposit]AUTOMATON::> prop_deposit("+") STATE::>"+ _string_prop_deposit(_state_id_prop_deposit, 0));
_cls_prop_deposit0.pw.flush();

if (0==1){}
else if (_state_id_prop_deposit==6){
		if (1==0){}
		else if ((_occurredEvent(_event,0/*login_en*/))){
		
		_state_id_prop_deposit = 2;//moving to state idle_lin
		_goto_prop_deposit(_info);
		}
}
else if (_state_id_prop_deposit==3){
		if (1==0){}
		else if ((_occurredEvent(_event,6/*logout_ex*/)) && (f .getUser ()==null )){
		
		_state_id_prop_deposit = 6;//moving to state logout
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,6/*logout_ex*/)) && (f .getUser ()!=null )){
		
		_state_id_prop_deposit = 0;//moving to state bad
		_goto_prop_deposit(_info);
		}
}
else if (_state_id_prop_deposit==5){
		if (1==0){}
		else if ((_occurredEvent(_event,14/*withdraw_ex*/))){
		
		_state_id_prop_deposit = 1;//moving to state login
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,14/*withdraw_ex*/)) && (false )){
		
		_state_id_prop_deposit = 0;//moving to state bad
		_goto_prop_deposit(_info);
		}
}
else if (_state_id_prop_deposit==2){
		if (1==0){}
		else if ((_occurredEvent(_event,2/*login_ex*/)) && (f .getUser ()!=null )){
		
		_state_id_prop_deposit = 1;//moving to state login
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,2/*login_ex*/)) && (f .getUser ()==null )){
		
		_state_id_prop_deposit = 0;//moving to state bad
		_goto_prop_deposit(_info);
		}
}
else if (_state_id_prop_deposit==4){
		if (1==0){}
		else if ((_occurredEvent(_event,10/*deposit_ex*/))){
		
		_state_id_prop_deposit = 1;//moving to state login
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,10/*deposit_ex*/)) && (false )){
		
		_state_id_prop_deposit = 0;//moving to state bad
		_goto_prop_deposit(_info);
		}
}
else if (_state_id_prop_deposit==1){
		if (1==0){}
		else if ((_occurredEvent(_event,4/*logout_en*/))){
		
		_state_id_prop_deposit = 3;//moving to state idle_lout
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,8/*deposit_en*/))){
		
		_state_id_prop_deposit = 4;//moving to state idle_dep
		_goto_prop_deposit(_info);
		}
		else if ((_occurredEvent(_event,12/*withdraw_en*/))){
		
		_state_id_prop_deposit = 5;//moving to state idle_with
		_goto_prop_deposit(_info);
		}
}
}

public void _goto_prop_deposit(String _info){
 String state_format = _string_prop_deposit(_state_id_prop_deposit, 1);
_cls_prop_deposit0.pw.println("[prop_deposit]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + state_format);
_cls_prop_deposit0.pw.flush();
}

public String _string_prop_deposit(int _state_id, int _mode){
switch(_state_id){
case 3: if (_mode == 0) return "idle_lout"; else return "idle_lout";
case 5: if (_mode == 0) return "idle_with"; else return "idle_with";
case 6: if (_mode == 0) return "logout"; else return "logout";
case 0: if (_mode == 0) return "bad"; else return "!!!SYSTEM REACHED BAD STATE!!! bad "+new _BadStateExceptionprop_deposit().toString()+" ";
case 2: if (_mode == 0) return "idle_lin"; else return "idle_lin";
case 4: if (_mode == 0) return "idle_dep"; else return "idle_dep";
case 1: if (_mode == 0) return "login"; else return "login";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}
