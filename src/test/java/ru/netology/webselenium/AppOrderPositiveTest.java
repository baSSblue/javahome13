package ru.netology.webselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

public class AppOrderPositiveTest {
    private WebDriver driver;

    @BeforeAll
    public static void setupAll() { WebDriverManager.chromedriver().setup(); }
}
