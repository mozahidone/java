package com.mozahidone.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserList {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Zayed"));
        userList.add(new User(2, "Nusaiba"));
        userList.add(new User(3, "Musfira"));
        userList.add(new User(4, "Zuairia"));

        userList.stream().forEach(user -> System.out.println(user.getName()));

        userList.removeIf(user -> user.getName().equals("Zayed"));
        userList.stream().forEach(user -> System.out.println(user.getName()));

        List<User> users = userList.stream().map(user -> {
            user.setId(user.getId()+100);
            return user;
        }).collect(Collectors.toList());
        users.stream().forEach(user -> System.out.println(user.getId()));
    }
}
