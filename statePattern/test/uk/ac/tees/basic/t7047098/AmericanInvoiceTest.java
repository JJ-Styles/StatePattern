package uk.ac.tees.basic.t7047098;

import uk.ac.tees.basic.t7047098.AmericanInvoice;
import uk.ac.tees.basic.t7047098.Customer;
import java.io.File;
import org.junit.Test;
import uk.ac.tees.basic.t7047098.AmericanInvoice;
import uk.ac.tees.basic.t7047098.AmericanInvoice;
import uk.ac.tees.basic.t7047098.Customer;
import uk.ac.tees.basic.t7047098.Customer;
import static org.junit.Assert.*;

/** A unit test to check the American invoicing algorithm. Spaces are irrelevant.
 *
 * Based on work created by Mark Truran </p>
 */
public class AmericanInvoiceTest {
    
    /**
     * Test of getInvoice method, of class AmericanInvoice.
     */
    @Test
    public void testGetInvoice() {
        System.out.println("Producing American invoice");
        final int invoiceAmount = 500;
        final Customer c = new Customer("Oracle", invoiceAmount);
        c.setInvoicingAlgorithm(new AmericanInvoice());
        String actualOutput = c.getInvoice();
        final File f = new File("actual-american.txt");
        FileUtility.resetFile(f);
        FileUtility.writeFile(f, actualOutput);
        String expectedOutput = FileUtility.readFile(new File("expected-american.txt"));
        //System.out.println(actualOutput);
        //System.out.println(expectedOutput);
        actualOutput = actualOutput.replaceAll("\\s", "");
        expectedOutput = expectedOutput.replaceAll("\\s", "");
        //System.out.println(actualOutput);
        //System.out.println(expectedOutput);
        assertEquals(actualOutput, expectedOutput);
    }
}
