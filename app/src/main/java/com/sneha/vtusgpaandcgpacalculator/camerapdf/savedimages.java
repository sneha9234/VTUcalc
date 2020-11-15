package com.sneha.vtusgpaandcgpacalculator.camerapdf;

public class savedimages {
    private int id;
    private String name;
    private byte[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return image;
    }

    public savedimages(int id, String name, byte[] image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }
}
