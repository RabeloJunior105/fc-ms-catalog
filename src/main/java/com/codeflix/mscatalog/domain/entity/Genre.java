package com.codeflix.mscatalog.domain.entity;

import java.util.UUID;

public class Genre extends BaseEntity {

    private String name;

    public Genre() {
        
    }
     
    public Genre(String name) {
        super.generateUuid();
        this.setName(name);
    }

    public Genre(UUID id, String name) {
        super.setId(id);
        this.setName(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null)
            throw new IllegalArgumentException("Name cannot be null");

        if (name.length() < 0)
            throw new IllegalArgumentException("Name must be at least 0 characters long");

        this.name = name;
    }

    
}
