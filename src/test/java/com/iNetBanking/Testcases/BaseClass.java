package com.iNetBanking.Testcases;

public class BaseClass {

    public String baseURL="http://demo.guru99.com/V4/";
    public String username="mngr34926";
    public String password="amUpenu";
    public staic WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    //Let's edit this section2 and push it to remote repository2.
    //abcdfeghi jklmgngngngn gngiroieai


}
