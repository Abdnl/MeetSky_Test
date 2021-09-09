package com.meetSky.pages;


import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

    public ContactsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//li[@data-id='contacts']")
    public WebElement contactsTab;

    public void navigateContactsTab(){
        contactsTab.click();
    }

    @FindBy(xpath="//li[@id='everyone']")
    public WebElement allContacts;

    @FindBy(xpath = "//div[@class='app-navigation-new']")
    public WebElement newContact;

    public void createNewContact(){
        newContact.click();
    }

    @FindBy(xpath = "//div[contains(text(),'New contact')]")
    public WebElement newContactText;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-view']")
    public WebElement selectContact;

    public void setSelectContact(){
        selectContact.click();
    }



    @FindBy(id="contact-fullname")
    public WebElement contactFullname;

    @FindBy(id="contact-title")
    public WebElement contactTitle;

    @FindBy(xpath="//input[@inputmode='tel']")
    public WebElement contactPhone;

    @FindBy(xpath="//input[@inputmode='email']")
    public WebElement contactEmail;

    @FindBy(xpath="//section/div[3]/div/div[2]/input")
    public WebElement contactPObox;

    @FindBy(xpath="//section/div[3]/div/div[3]/input")
    public WebElement contactAddress;

    @FindBy(xpath="//section/div[3]/div/div[4]/input")
    public WebElement contactExtendedAddress;

    @FindBy(xpath="//section/div[3]/div/div[5]/input")
    public WebElement contactPostalCode;

    @FindBy(xpath="//section/div[3]/div/div[6]/input")
    public WebElement contactCity;

    @FindBy(xpath="//section/div[3]/div/div[7]/input")
    public WebElement contactState;

    @FindBy(xpath="//section/div[3]/div/div[8]/input")
    public WebElement contactCountry;

    @FindBy(xpath="//section/div[4]/div/div[2]/div[2]/span")
    public WebElement contactAddressBook;

    @FindBy(xpath="//section/div[5]/div/div[2]/div[2]/input")
    public WebElement contactGroups;

    public void editContacts(){
        contactFullname.isEnabled();
        contactTitle.isEnabled();
        contactPhone.isEnabled();
        contactEmail.isEnabled();
        contactPObox.isEnabled();
        contactAddress.isEnabled();
        contactExtendedAddress.isEnabled();
        contactPostalCode.isEnabled();
        contactCity.isEnabled();
        contactState.isEnabled();
        contactCountry.isEnabled();
        contactAddressBook.isEnabled();
        contactGroups.isEnabled();
    }

    @FindBy(xpath = "//header/div[3]/div/div/div/button")
    public WebElement editButton;

    @FindBy(xpath = "//li[3]/button/span[2]")
    public WebElement deleteButton;

    public void setDeleteButton(){
        editButton.click();
        deleteButton.click();
    }
}

