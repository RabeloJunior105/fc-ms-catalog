package com.codeflix.mscatalog.domain.entity;

import java.util.UUID;

public class Category extends BaseEntity {
    private String name;
    
    public Category() {}

    public Category(String name) {
        super.generateUuid();
        this.setName(name);
    }
    
    public Category(UUID id) {
        super.setId(id);
    }
    

    public Category(UUID id, String name) {
        this.setId(id);
        this.setName(name);
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null");

        if(name.length() < 0)
            throw new IllegalArgumentException("Name must be at least 0 characters long");

        this.name = name;
    }
    
}
