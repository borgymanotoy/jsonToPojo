/**
 * @(#)JacksonUser.java
 *
 *
 * @author 
 * @version 1.00 2015/10/13
 */
package com.json.test;


import java.util.ArrayList;
import java.util.List;

public class JacksonUser {

    private int          age      = 29;
    private String       name     = "mkyong";
    private List<String> messages = new ArrayList<String>() {
                                      {
                                          add("msg 1");
                                          add("msg 2");
                                          add("msg 3");
                                      }
                                  };

    public JacksonUser() {
    }

    public JacksonUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", " + "messages=" + messages + "]";
    }
}
