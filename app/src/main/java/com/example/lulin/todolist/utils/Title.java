package com.example.lulin.todolist.utils;

import cn.bmob.v3.BmobObject;

/**
 * Created by df on 18-6-24.
 */

public class Title extends BmobObject {
    private String title;
    private User user;

    public Title(){}

    public void setTitle(String title){this.title=title;}
    public void setUser(User user2){this.user=user2;}
}