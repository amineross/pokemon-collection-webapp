package com.uca.entity;

public class PokemonEntity {
    private int id;
    private String name;
    private String type;
    private int level;
    private int ownerId;
    private String imageURL;

    public PokemonEntity() {
    }

    public PokemonEntity(int id, String name, String type, int level, int ownerId, String imageURL) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.ownerId = ownerId;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
