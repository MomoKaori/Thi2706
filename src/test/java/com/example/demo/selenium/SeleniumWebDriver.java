package com.example.demo.selenium;

import com.example.demo.service.NhanVienService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    private WebDriver webDriver;
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Test
    void testSteps() throws InterruptedException {
        webDriver.get("https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob&gad_source=1&gclid=Cj0KCQiAkoe9BhDYARIsAH85cDORe2krBlFPX0WLX2b8-jbIkCWMIKBWK8_gIojxLNRwUvz25GcCcnEaAk54EALw_wcB");
        webDriver.findElement(By.xpath("//*[@id=\"ldr-accept_cookie_policy\"]/div/div[2]/div/div/div[2]/button/span[1]/h5")).click();
        webDriver.findElement(By.xpath("//*[@id=\"input-departure\"]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"origin-Vietnam\"]/div[2]/div/div/div/div/div[2]/div[1]")).click();
    }



}
