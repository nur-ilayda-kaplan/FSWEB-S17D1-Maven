package com.workintech.fswebs17d1.entity;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    private int id;
    private String name;

    public Animal()
    {

    }

    public Animal(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }
}