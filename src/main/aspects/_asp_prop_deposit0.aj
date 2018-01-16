package aspects;

import bank.UserInterface;

import larva.*;
public aspect _asp_prop_deposit0 {

public static Object lock = new Object();

boolean starvoors = false;

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_prop_deposit0.initialize();
}
}
before ( int money,UserInterface f) : (call(* UserInterface.withdraw(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 12/*withdraw_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 12/*withdraw_en*/);
}
}
after ( UserInterface f,String un,int pwd) returning () : (call(* UserInterface.login(..)) && target(f) && args(un,pwd) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.f = f;
_cls_inst.un = un;
_cls_inst.pwd = pwd;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*login_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*login_ex*/);
}
}
after ( int money,UserInterface f) returning () : (call(* UserInterface.deposit(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 10/*deposit_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 10/*deposit_ex*/);
}
}
after ( UserInterface f) returning () : (call(* UserInterface.logout(..)) && target(f) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 6/*logout_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 6/*logout_ex*/);
}
}
before ( int money,UserInterface f) : (call(* UserInterface.deposit(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 8/*deposit_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 8/*deposit_en*/);
}
}
after ( int money,UserInterface f) returning () : (call(* UserInterface.withdraw(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 14/*withdraw_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 14/*withdraw_ex*/);
}
}
before ( UserInterface f) : (call(* UserInterface.logout(..)) && target(f) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 4/*logout_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 4/*logout_en*/);
}
}
before ( UserInterface f,String un,int pwd) : (call(* UserInterface.login(..)) && target(f) && args(un,pwd) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_prop_deposit0.lock){

_cls_prop_deposit0 _cls_inst = _cls_prop_deposit0._get_cls_prop_deposit0_inst();
_cls_inst.f = f;
_cls_inst.un = un;
_cls_inst.pwd = pwd;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*login_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*login_en*/);
}
}
}
