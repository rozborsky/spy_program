/**
 * Created by roman on 19.03.2016.
 */
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    private int numberMinute = 1;
    String dirPath = "C:\\Users\\roman\\.android\\cache\\prog";

    ScreenShot(){
        do {
            File dir = new File(dirPath);
            if (!dir.exists()){
                new MakeDir(dirPath);
            }

            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            int height = size.height;
            int weight = size.width;

            try{
                BufferedImage newImg = new Robot().createScreenCapture(new Rectangle(weight, height));
                BufferedImage scaled = new BufferedImage(weight, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g = scaled.createGraphics();
                g.drawImage(newImg, 0, 0, weight, height, null);
                g.dispose();

                Create_name name = new Create_name();
                String full_name = name.beforeDot()+ "." +name.afterDot();

                ImageIO.write(scaled, "jpg", new File(dirPath + "\\" + full_name));
            }
            catch (AWTException e){
                System.exit(0);
            }
            catch (IOException e){
                System.exit(0);
            }
            try{
                Thread.sleep(numberMinute * 60 * 1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }while(true);
    }
}

