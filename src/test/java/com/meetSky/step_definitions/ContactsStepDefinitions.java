package com.meetSky.step_definitions;

import com.meetSky.pages.ContactsPage;
import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ContactsStepDefinitions {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user navigates to {string}")
    public void the_user_navigates_to(String tab) {
        ContactsPage contacts = new ContactsPage();
        contacts.navigateContactsTab();
    }

    @Then("all contacts list must be displayed")
    public void all_contacts_list_must_be_displayed() throws InterruptedException {
        ContactsPage contacts = new ContactsPage();
        BrowserUtils.waitFor(5);
        contacts.allContacts.isDisplayed();
    }


    @Then("the user can create a new contact")
    public void the_user_can_create_a_new_contact() {
        ContactsPage contacts = new ContactsPage();
        BrowserUtils.waitFor(5);
        contacts.createNewContact();
        contacts.newContactText.isDisplayed();
    }



    @Then("the user can edit any selected contact")
    public void the_user_can_edit_any_selected_contact() {
        ContactsPage contacts = new ContactsPage();
        BrowserUtils.waitFor(5);
        contacts.setSelectContact();
        contacts.editContacts();
    }



    @Then("the user can delete any selected contact")
    public void the_user_can_delete_any_selected_contact() {
        ContactsPage contacts = new ContactsPage();
        BrowserUtils.waitFor(5);
        contacts.setSelectContact();

        BrowserUtils.waitFor(3);
        contacts.setDeleteButton();

    }


}
