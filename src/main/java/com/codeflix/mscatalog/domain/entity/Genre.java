package com.codeflix.mscatalog.domain.entity;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class Genre extends BaseEntity {

    private String name;
    private List<Category> categories = new ArrayList<Category>();
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
    
    public Genre(String name,List<Category> categories) {
        super.generateUuid();
        this.setName(name);
        this.setCategories(categories);
    }

    public Genre(UUID id, String name, List<Category> categories) {
        super.setId(id);
        this.setName(name);
        this.setCategories(categories);
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        if (categories == null)
            throw new IllegalArgumentException("Categories cannot be null");
        this.categories = categories;
    }

    public void addCategory(Category category) {
        if (categories == null)
            throw new IllegalArgumentException("Categories cannot be null");
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        if (categories == null)
            throw new IllegalArgumentException("Categories cannot be null");
            
        this.categories.removeIf(c -> this.categories.contains(category));
    }
}
