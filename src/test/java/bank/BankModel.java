/*
 * @author Mauricio Chimento
 */
package bank;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BankModel implements FsmModel {

    private BankAdapter adapter = new BankAdapter();
    private enum State {Login, Logout}

    private State state = State.Logout;

    public Object getState() {
        return state;
    }

    public void reset(boolean b) {
        state = State.Logout;
        adapter = new BankAdapter();
        SystemCentral.flush();
    }

    public boolean loginGuard(){
        return state == State.Logout && adapter.f.getUser() == null ;
    }

    @Action
    public void login() {
        state = State.Login;
        adapter.login();
        assertNotNull(adapter.f.getUser());
    }

    public boolean logoutGuard() {
        return state == State.Login && adapter.f.getUser() != null ;
    }

    @Action
    public void logout() {
        state = State.Logout;
        adapter.logout();
        assertNull(adapter.f.getUser());
    }

    public boolean depositGuard(){
        return state == State.Login;
    }

    @Action
    public void deposit() {
        adapter.deposit();
    }

    public boolean withdrawGuard() {
        return state == State.Login;
    }

    @Action
    public void withdraw() {
        adapter.withdraw();
    }
}
