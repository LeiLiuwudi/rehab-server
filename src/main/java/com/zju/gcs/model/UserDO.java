package com.zju.gcs.model;

public class UserDO {
    private Integer id;

    private String username;

    private String password;

    private Byte department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getDepartment() {
        return department;
    }

    public void setDepartment(Byte department) {
        this.department = department;
    }
}