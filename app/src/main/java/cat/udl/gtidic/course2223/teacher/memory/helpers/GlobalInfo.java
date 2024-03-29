package cat.udl.gtidic.course2223.teacher.memory.helpers;

public class GlobalInfo {
    private final int SPLASH_SCREEN_TIMEOUT = 500;
    private final String FIREBASE_DB = "https://dam-memory-default-rtdb.europe-west1.firebasedatabase.app/";

    private static GlobalInfo instance = new GlobalInfo();

    private GlobalInfo(){
//        return new GlobalInfo();
    }

    public static GlobalInfo getIntance(){
        return instance;
    }

    public int getSplashScreenTimeout(){
        return SPLASH_SCREEN_TIMEOUT;
    }

    public String getFIREBASE_DB() {
        return FIREBASE_DB;
    }
}
