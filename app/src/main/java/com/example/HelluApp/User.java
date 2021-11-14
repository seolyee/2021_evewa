package com.example.HelluApp;

import java.util.HashMap;

public class User {

    public String Nickname;
    public String Email;
    public String Uid;
    public String ProfileUrl;
    public String Walking;

    public HashMap<String, Object> usermap = new HashMap<>();

    public User(){
        // Default constructor required for calls to DataSnapshot.getValue(user.class)
    }

    public User(String Nickname, String Email, String Uid, String ProfileUrl, String Walking){
        this.Nickname = Nickname;
        this.Email = Email;
        this.Uid = Uid;
        this.ProfileUrl = ProfileUrl;
        this.Walking = Walking;
    }

    public HashMap<String, Object> usertomap(){
        HashMap<String, Object> user_result = new HashMap<>();
        // ("키", 값)
        user_result.put("Nickname", Nickname); // 닉네임
        user_result.put("Email", Email); // 이메일
        user_result.put("Uid", Uid); // 사용자 Uid
        user_result.put("ProfileUrl", ProfileUrl); // 프로필 경로
        user_result.put("Walking", Walking); // 걸음수

        return user_result;
    }
}