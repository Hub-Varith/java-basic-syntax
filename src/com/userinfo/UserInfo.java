package com.userinfo;
import java.util.*;

public class UserInfo {
    final private String name;
    final private int age;
    final private String email;
    final private String uid;

    //Constructor
    public UserInfo(String name, int age, String email, String uid) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.uid = uid;
    }

    public void displayInfo() {
        System.out.println("name =" + name);
        System.out.println("age =" + age);
        System.out.println("email =" + email);
        System.out.println("uid =" + uid);
    }

    public void displayArray(int type) {

        //Resizable Array
        List<String> socialMedia = Arrays.asList("Facebook", "Instagram", "Snapchat", "Tiktok");
        List<String> games = Arrays.asList("Valorant", "CSgo", "PUBG", "Fortnite");

        //Constant Array (Fixed at 10 elements)
        int[] fixedArray = {1,2,3,4,5,6,7,8,9,10};

        if (type == 1) {
            //Normal For loop through socialMedia
            for (int i = 0; i < socialMedia.size(); i++) {
                System.out.println(socialMedia.get(i));
            }
            System.out.println(fixedArray);
        } else if (type == 2){

            //Enhanced for
            for (String game : games) {
                System.out.println(game);
            }
        }
    }
}
