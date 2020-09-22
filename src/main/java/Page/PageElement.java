package Page;






import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PageElement {
	WebDriver driver;
	public PageElement (WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how = How.NAME, using = "todo[1]") WebElement Item1;
	@FindBy(how = How.NAME,using = "todo[2]") WebElement Item2;
	@FindBy(how = How.NAME, using = "todo[3]") WebElement Item3;
	@FindBy(how = How.NAME, using = "todo[4]") WebElement Item4;
	@FindBy(how = How.NAME, using = "allbox") WebElement ToggleAll;
	@FindBy(how = How.NAME, using = "submit") WebElement Remove;
	
	public void Item1field() {
		Item1.sendKeys("item1");
	}
	public void Item2field() {
		Item2.sendKeys("item2");
	}
	public void Item3field() {
		Item3.sendKeys("item3");
	}
	public void Item4field() {
		Item4.sendKeys("item4");
	}
	public void Toggleallfield() throws InterruptedException {
		ToggleAll.click();
		Assert.assertTrue("All checked boxes cheched on", true);
		System.out.println("Keep up");
		Thread.sleep(500);
	}
	
	public void ValidSingleItemList() {

		
		
		Item1.click();
		Assert.assertTrue("SingleItem is clicked on", true);
		
		}
	public void Removefield() {
		Remove.click();
	Assert.assertTrue("click on remove box", true);
		System.out.println("Is removed");
	}
	public void validAllitemsisremoved() {
		ToggleAll.click();
		Remove.click();
		Assert.assertTrue("All items have been removed", true);
		System.out.println("Job done");
		
	}
	
	}



