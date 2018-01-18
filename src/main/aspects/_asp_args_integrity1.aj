package aspects;

import bank.UserInterface;
import bank.Account;
import ppArtifacts.*;

import larva.*;
public aspect _asp_args_integrity1 {

boolean starvoors = false;

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_args_integrity1.initialize();
}
}
before ( Tmp_args_integrity obj,Channel _c) : (call(* Channel.receive(..)) && target(_c) && (if (_c.equals(_cls_args_integrity0.cact1))) && args(obj)) {

synchronized(_asp_args_integrity0.lock){
Account acc;
acc =obj .acc ;

_cls_args_integrity1 _cls_inst = _cls_args_integrity1._get_cls_args_integrity1_inst( acc);
_cls_inst.obj = obj;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 10/*rcact1*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 10/*rcact1*/);
}
}
before ( int money,Account acc_tmp) : (call(* Account.deposit(..)) && target(acc_tmp) && args(money) && !cflow(adviceexecution()) && !(within(larva.*))) {

synchronized(_asp_args_integrity0.lock){
Account acc;
acc =acc_tmp ;

_cls_args_integrity1 _cls_inst = _cls_args_integrity1._get_cls_args_integrity1_inst( acc);
_cls_inst.money = money;
_cls_inst.acc_tmp = acc_tmp;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 12/*m_en*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 12/*m_en*/);
}
}
}
