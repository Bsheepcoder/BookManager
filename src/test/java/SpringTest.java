import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SpringTest {

    @Test
    public void passWordTest(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }

    @Test
    public void time(){

    }

    @Test
    public void other(){

    }
}
