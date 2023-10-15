package com.sauce.pages;



import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class EmployeeListPage extends BasePage {

    List<String> nameLists;

    @FindBy(css = "a[href='/Employee']")
    public WebElement employeeList;

    @FindBy(xpath = "//a[@href='/Employee/Create']")
    public WebElement createNew;

    @FindBy(id = "Name")
    public WebElement Name;

    @FindBy(id = "Salary")
    public WebElement salary;

    @FindBy(id = "DurationWorked")
    public WebElement duration;

    @FindBy(id = "Grade")
    public WebElement grade;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement createBtn;

    public void newEmployee() {
        employeeList.click();
        createNew.click();
        Name.sendKeys("name1");
        salary.sendKeys("100000");
        duration.sendKeys("3");
        grade.sendKeys("3");
        email.sendKeys("name1@mail.com");
        createBtn.click();

    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchNewEmp;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement searcEmpBtn;

    @FindBy(xpath = "//td[1]")
    public List<WebElement> nameList;

    @FindBy(xpath = "//tr/td[6]/a[3]")
    public WebElement delete;

    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement confirmDlt;

    public void verifyNew(String Name) {
        nameLists = new ArrayList<>();
        for (WebElement baslik : nameList) {
            nameLists.add(baslik.getText());
        }
        Assert.assertTrue(nameLists.contains(Name));

    }

    public void deleteNew(String Name) {
        searchNewEmp.sendKeys(Name);
        searcEmpBtn.click();
        delete.click();
        confirmDlt.click();
    }

    public void confirmDelete(String Name) {
        nameLists = new ArrayList<>();

        for (WebElement baslik : nameList) {
            nameLists.add(baslik.getText());
        }
        Assert.assertFalse(nameLists.contains(Name));

    }


}


