package test2;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.PageElement;
import util.browserclasss;

public class TestRunning {
WebDriver driver;
@Test

public void Test() throws InterruptedException {
	driver=browserclasss.launchingbrowser2();
	PageElement p=PageFactory.initElements(driver, PageElement.class);
//	p.Item1field();
//	p.Item2field();
//    p.Item3field();
//	p.Item4field();
//    p.Toggleallfield();
//    p.Toggleallfield();
//    p.ValidSingleItemList();
////	p.Removefield();
//	p.validAllitemsisremoved();
}
}
