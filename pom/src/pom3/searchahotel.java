package pom3;

import org.openqa.selenium.support.ui.Select;

import pom.Resusablemethods;
import pom2.loginpage;
import pom2.searchhotel;

public class searchahotel extends Resusablemethods {
	public static void main(String[] args) {
		 loginpage login=new loginpage();
	        searchhotel search = new searchhotel();
	        searchahotel SelectHotel=new searchahotel();
	       // launchapp();
	        Launchapp();
	        Thread.sleep(3000);
	                driver.findElement(login.UsernameTextBox).sendKeys("praveensagar");
	                driver.findElement(login.PwdTextBox).sendKeys("kumar");
	                driver.findElement(login.loginButton).click();
	                Select location=new Select(driver.findElement(search.LocationListBox));
	                location.selectByIndex(3);
	                Select noofrooms=new Select(driver.findElement(search.noofroomsListBox));
	                noofrooms.selectByIndex(2);
	                driver.findElement(search.CheckIndateTextBox).clear();
	                driver.findElement(search.CheckIndateTextBox).sendKeys("1/07/2021");
	                driver.findElement(search.CheckOutDateTextBox).clear();
	                driver.findElement(search.CheckOutDateTextBox).sendKeys("2/07/2021");
	                Select adult=new Select(driver.findElement(search.AdultsperroomListBox));
	                adult.selectByIndex(2);
	                driver.findElement(search.SearchButton).click();
	                driver.findElement(SelectHotel.LogutLink).click();
	                closebrowser();
		
}
}
