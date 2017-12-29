/*
 * @author Mauricio Chimento
 */
package bank;

import junit.framework.Assert;
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class BankModel implements FsmModel {

    private BankAdapter adapter = new BankAdapter();
    private UserInterface f = new UserInterface("test");

    private enum State {Login, Logout}

    private State state = State.Logout;

    public Object getState() {
        return state;
    }

    public void reset(boolean b) {
        state = State.Logout;
        f = new UserInterface("test");
        adapter = new BankAdapter();
    }

    public boolean loginGuard(){
        return state == State.Logout && f.getUser() == null ;
    }

    @Action
    public void login() {
        state = State.Login;
    }

    public boolean logoutGuard() {
        return state == State.Login && f.getUser() != null ;
    }

    @Action
    public void logout() {
        state = State.Logout;
    }

    public boolean depositGuard(){
        return state == State.Login;
    }

    @Action
    public void deposit() {
    }

    public boolean withdrawGuard() {
        return state == State.Login;
    }

    @Action
    public void withdraw() {

    }
}
