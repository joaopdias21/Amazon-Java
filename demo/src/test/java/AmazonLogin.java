import org.openqa.selenium.By;
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
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();

        
            // Navegar até a página de login da Amazon
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com.br/");
            
            driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

        // Encontrar o campo de e-mail e inserir o e-mail
       driver.findElement(By.id("ap_email")).sendKeys("testeamzon@hotmail.com");

        // Encontrar e clicar no botão de continuar
       driver.findElement(By.id("continue")).click();

        // Esperar um momento para a página carregar
           

         // Encontrar o campo de senha e inserir a senha
      driver.findElement(By.id("ap_password")).sendKeys("123456789");

        // Encontrar e clicar no botão de login
       driver.findElement(By.id("signInSubmit")).click();
       //driver.findElement(By.id("ap-account-fixup-phone-skip-link")).click();

        // Esperar um momento para a página carregar
            

        // Verificar se o login foi bem-sucedido (verificando se há algum elemento específico da página inicial)
        if (driver.getCurrentUrl().contains("https://www.amazon.com.br/?ref_=nav_ya_signin")) {
           System.out.println("Login realizado com sucesso!");
       } else {
           System.out.println("Falha no login.");
        }

        // Pesquisar e adicionar produto ao carrinho
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("alexa");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Echo Dot 5ª geração | O Echo Dot com o melhor som já lançado | Cor Preta")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        
        // Verifica se o produto foi adicionado ao carrinho
        if (driver.getTitle().contains("Carrinho de compras da Amazon.com")) {
            System.out.println("Adicionado ao carrinho");
        } else {
            System.out.println("Falha ao add ao carrinho.");
        }



        
        // Fechar o navegador
        driver.quit();
     }
    }

    
