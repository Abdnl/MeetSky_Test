package com.meetSky.step_definitions;

import com.meetSky.pages.DashboardPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;

public class FileStepDefs {
    DashboardPage dashboardPage;
    @Given("the user upload a file")
    public void theUserUploadAFile() {

        new DashboardPage().filePlus.click();
        new DashboardPage().fileUpload("meetSkyFile");


    }
}
