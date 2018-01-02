/*
 * @author Mauricio Chimento
 */
package bank;

import org.junit.Test;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.coverage.ActionCoverage;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.StopOnFailureListener;

public class BankTest {

    @Test
    public void testFire() throws Exception {
        BankModel bankModel = new BankModel();
        Tester tester = new GreedyTester(bankModel);

        tester.buildGraph();
        tester.addListener(new VerboseListener());
        tester.addListener(new StopOnFailureListener());
        tester.addCoverageMetric(new TransitionCoverage());
        tester.addCoverageMetric(new StateCoverage());
        tester.addCoverageMetric(new ActionCoverage());

        tester.generate(10);
        tester.printCoverage();
    }

}
