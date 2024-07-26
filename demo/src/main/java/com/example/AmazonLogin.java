package com.example;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLogin {
    public static void main(String[] args) {
        // Configurar o caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pichau\\Javaa\\demo\\drivers\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Inicializar o driver do Chrome
        WebDriver driver = new ChromeDriver();

        
            // Navegar até a página de login da Amazon
            driver.get("https://www.twitch.tv/");
    }
}