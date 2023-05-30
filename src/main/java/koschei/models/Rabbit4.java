package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    public String getRulesByRabbit() {
        return ", в зайце утка " + duck.toString();
    }

    @Autowired
    public Rabbit4(Duck5 duck) {
        this.duck = duck;
    }
}
