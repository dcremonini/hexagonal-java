package com.ingcremonini.domain;

public class BankAccount {

    private Integer id;

    private Integer content;


    public BankAccount(Integer id) {
        this.id = id;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }
}
