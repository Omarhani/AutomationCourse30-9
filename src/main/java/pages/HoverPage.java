package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class HoverPage {
    WebDriver driver;
    Actions actions;
    public HoverPage(WebDriver driver) {
        this.driver= driver;
    }

    private final By figure = By.cssSelector(".figure");
    private final By figureCaption = By.cssSelector(".figcaption");

    public FigureCaption hoverOverFigure(int index){
        WebElement element = driver.findElements(figure).get(index-1);
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return new FigureCaption(element.findElement(figureCaption));
    }
}
