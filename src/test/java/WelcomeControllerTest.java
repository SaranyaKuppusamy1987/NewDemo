
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.system.SystemProperties;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeControllerTest{

    @Test
    public void sayHello(){

 System.out.println(SystemProperties.get("TEST_MESSAGE"));

    }

}
