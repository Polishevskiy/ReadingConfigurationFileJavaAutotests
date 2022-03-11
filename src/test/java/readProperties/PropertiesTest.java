package readProperties;

import org.junit.Test;
import java.io.IOException;

public class PropertiesTest extends BaseTest {
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
            System.out.println("Админ действительно админ");
        } else {
            System.out.println("Админ не является Админом");
        }
    }
}
