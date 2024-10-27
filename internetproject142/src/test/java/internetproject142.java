// 1- bibliotecas / imports
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver; // biblioteca principal do selenium
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; // biblioteca do chromeDriver

import io.github.bonigarcia.wdm.WebDriverManager;


// 2 - classe
public class internetproject142 {
 // 2.1 - atributos
 private WebDriver driver; // objeto do selenium

 // 2.2 - Funções e Métodos

 // antes do teste
 @BeforeEach
 public void iniciar() {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver(); // instanciar o objeto do selenium como chromeDriver
     driver.manage().window().maximize(); // maximiza a janela do browser
 }

 // depois do teste
 @AfterEach 
 public void finalizar () {
     driver.quit(); // destroi o objeto do selenium
 }

 // teste
 @Test
 public void internetproject() {
      driver.get("https://the-internet.herokuapp.com/login");
      driver.manage().window().setSize(new Dimension(1382, 736));
      driver.findElement(By.cssSelector("custom-cursor-on-hover"));
      driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
      driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("tomsmith");
      driver.findElement(By.cssSelector("#login > div:nth-child(2)")).click();
      driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("SuperSecretPassword!");
      driver.findElement(By.cssSelector("*[data-test=\"fa fa-2x fa-sign-in\"]")).click();


 }   // final do internetproject
 
} // final da classe Pinternetproject142
