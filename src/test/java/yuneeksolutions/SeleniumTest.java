package yuneeksolutions;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test (groups={"Smoke"})
	public void BrowserAutomation()
	{
		
		System.out.println("BrowserAutomation");
		System.out.println("WebAutomation");
		System.out.println("BrowserAutomation3");
	}
	
	@Test
	public void elementsUI()
	{
		
		System.out.println("elementsUI");
	}
	
	@Test
	public void buttonsUI()
	{
		
		System.out.println("buttonsUI");
	}
	
	@Test
	public void InputBoxUI()
	{
		
		System.out.println("InputBoxUI");
	}


}
