package com.example.blackjack.controller;

import com.example.blackjack.domain.Beauty;
import com.example.blackjack.domain.Dealer;
import com.example.blackjack.domain.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;

@Controller
public class GameController {

    private Dealer dealer;
    private Player player;
    private Beauty beauty;
    private Boolean gameStatus;



    @RequestMapping(value = {"/game_entrance"})
    public String game_entrance(){
        return "game_entrance";
    }


    @PostMapping(value = {"/game"})
    public String action(@RequestParam(name = "name")String name,@RequestParam(name = "money")double money,@RequestParam(name = "action")String action,Map<String,Object> map){
        dealer = new Dealer();
        player = new Player(name,money);
        beauty = new Beauty();
        gameStatus = true;

        switch (action) {
            case "1":
                map.put("case1","请输入投资金额");
                break;
            case "2":
                map.put("money",Double.toString(player.getMoney()));
                break;
            case "3":
                gameStatus = false;
        }
        return "game";
    }
}
