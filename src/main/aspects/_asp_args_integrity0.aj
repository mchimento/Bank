package aspects;

import bank.UserInterface;
import bank.Account;
import ppArtifacts.*;

import larva.*;
public aspect _asp_args_integrity0 {

public static Object lock = new Object();

boolean starvoors = false;

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_args_integrity0.initialize();
}
}
before ( int money,UserInterface f) : (call(* UserInterface.deposit(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_args_integrity0.lock){

_cls_args_integrity0 _cls_inst = _cls_args_integrity0._get_cls_args_integrity0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 2/*deposit_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 2/*deposit_en*/);
}
}
before ( int money,UserInterface f) : (call(* UserInterface.withdraw(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_args_integrity0.lock){

_cls_args_integrity0 _cls_inst = _cls_args_integrity0._get_cls_args_integrity0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 6/*withdraw_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 6/*withdraw_en*/);
}
}
after ( int money,UserInterface f) returning () : (call(* UserInterface.withdraw(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_args_integrity0.lock){

_cls_args_integrity0 _cls_inst = _cls_args_integrity0._get_cls_args_integrity0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 8/*withdraw_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 8/*withdraw_ex*/);
}
}
before ( Channel _c) : (call(* Channel.receive(..)) && target(_c) && (if (_c.equals(_cls_args_integrity0.ch)))) {

synchronized(_asp_args_integrity0.lock){

_cls_args_integrity0 _cls_inst = _cls_args_integrity0._get_cls_args_integrity0_inst();
_cls_inst._call(thisJoinPoint.getSignature().toString(), 0/*rch*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 0/*rch*/);
}
}
after ( int money,UserInterface f) returning () : (call(* UserInterface.deposit(..)) && target(f) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_args_integrity0.lock){

_cls_args_integrity0 _cls_inst = _cls_args_integrity0._get_cls_args_integrity0_inst();
_cls_inst.money = money;
_cls_inst.f = f;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 4/*deposit_ex*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 4/*deposit_ex*/);
}
}
}
