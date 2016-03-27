/**
 * Created by roman on 19.03.2016.
 */
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MakeDir {

    MakeDir(String fullPathOfDir){
        try{
            File newDir = new File(fullPathOfDir);
            newDir.mkdir();
        }catch (Exception e){
            System.exit(0);
        }
    }
}

