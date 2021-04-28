package org.example;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BilibiliguetTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.edge.driver","D:\\idea workspace\\edgedriver_win64\\edgedriver.exe");
    driver = new EdgeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void bilibiliguet() {
    driver.get("https://www.bilibili.com/");
    driver.manage().window().setSize(new Dimension(1059, 808));
    driver.findElement(By.cssSelector(".nav-search-keyword")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".nav-search-keyword")).sendKeys("桂林电子科技大学");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".nav-search-submit")).click();
    vars.put("win306", waitForWindow(2000));
    driver.switchTo().window(vars.get("win306").toString());
    vars.put("window_handles", driver.getWindowHandles());
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".video-item:nth-child(1) .keyword")).click();
    vars.put("win303", waitForWindow(2000));
    driver.switchTo().window(vars.get("win303").toString());
    js.executeScript("window.scrollTo(0,324.79998779296875)");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".bilibili-player-video-btn-start .bp-svgicon")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-volume-max > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-setting > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-pip-on > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-widescreen-off > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-web-fullscreen-off > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".bilibili-player-iconfont-fullscreen-off > .bp-svgicon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".bilibili-player-iconfont-fullscreen-off > .bp-svgicon")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    driver.close();
  }
}
