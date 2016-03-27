import java.util.Random;

/**
 * Created by roman on 29.02.2016.
 */
public class Create_name {
    public String afterDot(){
        String newName = "";
        int coef;
        Random rand = new Random();
        coef = rand.nextInt(4);
        switch (coef){
            case 0:{
                newName = "bae";
                break;
            }
            case 1:{
                newName = "cla";
                break;
            }
            case 2:{
                newName = "eri";
                break;
            }
            case 3:{
                newName = "epp";
                break;
            }
            case 4:{
                newName = "dal";
                break;
            }
        }
        return newName;
    }

    public String beforeDot(){
        String newName = "";
        char newChar;
        for (int i = 0; i < 7; i++){
            Random rand = new Random();
            int randNumber = rand.nextInt(21) + 97;
            newChar = (char)(randNumber);
            if (randNumber > 115 && i > 4)break;
            if (randNumber %2 != 0 && i % 2 != 0 && i > 2)break;
            newName += newChar;
        }
        return newName;
    }
}

