package classRoomSessions;

import org.testng.annotations.Test;

import wdMethods.ProjectWrapper;;

public class CreateContact extends ProjectWrapper{

	@Test
	public void createContact() {
		login();
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "TestLeaf");
		type(locateElement("id", "lastNameField"), "Gopinath");
		click(locateElement("name", "submitButton"));
		closeApp();
	}

}