package com.cyx.springboot.dto;

import java.util.Date;

public class Menu {
    private String name;
    private String url;
    private Date createDate;

    public Menu(){}

    public Menu(String name,String url,Date createDate){
        this.name=name;
        this.url=url;
        this.createDate=createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
