package dvp.jsr303.model.tests;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;

import dvp.jsr303.model.Address;
import static org.junit.Assert.*;


/**
 * Sample unit tests for Address model.  Include additional unit tests as you see fit for object or individual properties. 
 * @author Dipesh Patel
 *
 */
@ContextConfiguration("file:src/test/resources/RequestDispatcher-junit-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AddressTests {

	protected final Log log = LogFactory.getLog(getClass());
	
	/*
	 * Spring wired validator (JSR-303, Hibernate implementation)
	 */
    @Autowired
    private Validator validator;

    
    /*
     * Validate all properties of Address object
     */
	@Test()
	public void testValidAddressObject() {
	
		Address address = new Address() ;
		address.setStreet("100 Main St.") ;
		address.setCity("Fremont") ;
		address.setState("CA") ;
		address.setZipcode("94555") ;
		address.setCountry("USA") ;
		
		// validate the input
		Set<ConstraintViolation<Address>> violations = validator.validate(address);
		PrintUtility.printMessage(log, violations);
				
		assertEquals(violations.size(), 0);		
	}

	/*
	 * Force failure of all properties of Address object
	 */
	@Test()
	public void testInvalidAddressObject() {

		Address address = new Address() ;
		address.setStreet("<script>alert('XSS')</script>") ;
		address.setCity("<OU(*F(D(H(SD*") ;
		address.setState("ABCXYZ") ;
		address.setZipcode("asdfasdf") ;
		address.setCountry("asdofijasidf") ;
		
		// validate the input
		Set<ConstraintViolation<Address>> violations = validator.validate(address);
		PrintUtility.printMessage(log, violations);
						
		//  Expecting 6 failures ;
		assertEquals(violations.size(), 5);		
	}		
}
