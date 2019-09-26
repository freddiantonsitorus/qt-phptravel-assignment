package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void initializeTest() {
		
		AStepDefObject.initObjects();

	}
	
	@After
	public void tearDown() {
		// Quit driver
		//AStepDefObject.close();
	} 
	
}
