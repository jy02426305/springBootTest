package com.cyx.springboot.controller;

import com.cyx.springboot.dto.Address;
import com.cyx.springboot.dto.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping(value="/index")
    public String index(Model model){
        Address address=new Address();
        address.setProvince("福建省");
        address.setCity("石狮市");
        address.setDistrict("子芳路");
        model.addAttribute("address",address);

        List<Menu> menuList=new ArrayList<>();
        Menu menu1=new Menu("首页","/index",new Date());
        Menu menu2=new Menu("热榜","/rebang",new Date());
        Menu menu3=new Menu("人才","/rencai",new Date());
        Menu menu4=new Menu("职位","/zhiwei",new Date());
        Menu menu5=new Menu("私域","/siyuzuoye",new Date());
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        menuList.add(menu5);
        model.addAttribute("menuList",menuList);
        return "index";
    }

    @RequestMapping(value="/rebang")
    public String rebang(){
        return "rebang";
    }
}
