package tr.com.spring.project.ManagedBean;

import org.springframework.stereotype.Controller;

import java.io.Serializable;

@Controller(value = "mBean")
public class MBean {
    String springMessage = "Omer Erken";

    public String getSpringMessage() {
        return springMessage;
    }


}
