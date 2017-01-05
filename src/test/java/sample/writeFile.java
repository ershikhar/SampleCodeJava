package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class writeFile {

	public static void main(String[] args) throws IOException {
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.google.com/mail/u/0/");
		d.findElement(By.id("Email")).sendKeys("sskkk1122@gmail.com");
		System.out.println(d.getCurrentUrl());
		
		File f = new File(".\\Shikhar.txt");
		f.createNewFile();
		FileWriter writer = new FileWriter(new File(".\\Shikhar.txt"));
	      writer.write(d.getCurrentUrl());
	      writer.close();
	}

}
