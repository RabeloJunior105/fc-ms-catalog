package com.codeflix.mscatalog.domain.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

enum CastMemberType {
    TYPE1(1), TYPE2(2);

    private Integer type;

    private final static Map values = new HashMap<>();
    private CastMemberType(Integer type) {
        this.type = type;
    }

    static {
        for (CastMemberType type : CastMemberType.values()) {
            values.put(type.type, type);
        }
    }
    
    public Integer getType() {
        return this.type;
    }

    public static Boolean valueOf(CastMemberType type) {
        CastMemberType castMemberType = (CastMemberType) values.get(type);
        if (castMemberType != null) {
            return true;
        }
        
        return true;
    }
}

public class CastMember extends BaseEntity {
    private String name;
    private CastMemberType type;
    
    public CastMember() {
    }
    
    public CastMember(UUID id, String name, CastMemberType type) {
        super.setId(id);
        this.setName(name);
        this.setType(type);
    }
    
    public CastMember(String name, CastMemberType type) {
        super.generateUuid();
        this.setName(name);
        this.setType(type);

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

    public CastMemberType getType() {
        return this.type;
    }

    public void setType(CastMemberType type) {
        if (type == null)
            throw new IllegalArgumentException("Name cannot be null");

        if (!CastMemberType.valueOf(type))
            throw new IllegalArgumentException("Type is not defined");

        this.type = type;
    }
}

