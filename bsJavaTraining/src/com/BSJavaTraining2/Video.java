package com.BSJavaTraining2;

public class Video {
    private String fileName;
    private String title;
    private User user;

    public String getFileName() {return fileName;}

    public void setFileName(String fileName) {return;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
