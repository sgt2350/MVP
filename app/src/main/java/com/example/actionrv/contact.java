package com.example.actionrv;

/**
 * Created by ShreyasThyagaraja on 4/20/17.
 */

public class contact {
    int img_id;
    String name, email;

    public void setImg_id(int img_id) {
        this.setImg_id(img_id);
        this.setEmail(email);
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public contact (int img_id, String name , String email){

    }
    public int getImg_id() {
        return img_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}