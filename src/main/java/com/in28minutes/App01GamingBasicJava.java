package com.in28minutes;

import com.in28minutes.game.GameRunner;
import com.in28minutes.game.PacMan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App01GamingBasicJava {
    public static void main(String[] args) {
       //gamerunner class 인스턴스를 만들고 마리오를 시작해보자.

        //var game = new MarioGame();
        //마리오게임을 생성자 인수로 전달하고 실행한다.
        //var game = new SuperContraGame();

        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}