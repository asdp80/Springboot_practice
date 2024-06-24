package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import com.in28minutes.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App03GamingSpringBean {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}