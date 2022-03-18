package tests;

import config.ConfigProvider;
import core.Base;
import org.junit.Test;
import java.io.IOException;

public class Properties extends Base {
    @Test
    public void readProperties() throws IOException {
      System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
      String urlFromProperty = System.getProperty("url");
      System.out.println(urlFromProperty);
    }

    @Test
    public void readFormConf(){
        String urlFormConf = ConfigProvider.URL;
        System.out.println(urlFormConf);
        Boolean isDemoAdmin = ConfigProvider.IS_DEMO_ADMIN;
        System.out.println(isDemoAdmin);
        if(ConfigProvider.readConfig().getBoolean("usersParams.admin.isAdmin")){
            System.out.println("Admin is indeed an admin");
        } else {
            System.out.println("Admin is not an Admin");
        }
    }
}
