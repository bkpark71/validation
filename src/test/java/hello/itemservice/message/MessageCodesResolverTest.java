package hello.itemservice.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;

@SpringBootTest
public class MessageCodesResolverTest {
    MessageCodesResolver mcr = new DefaultMessageCodesResolver();

    @Test
    void messageTest(){
        String[] messagesCodes = mcr.resolveMessageCodes("required", "item");
        System.out.println("messagesCodes = " + messagesCodes);
        Assertions.assertThat(messagesCodes).containsAnyOf("required.item", "required");
    }
}
