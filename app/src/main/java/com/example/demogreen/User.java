package com.example.demogreen;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;

@Entity(nameInDb = "user")
public class User {
    private Long id = 0L;
    @Property(nameInDb = "name")
    private String username;

    public User(String username) {
        this.username = username;
    }
}

