package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.GamingConsole;
import com.in28minutes.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacMan();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

}
