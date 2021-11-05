package com.codeflix.mscatalog.domain.entity;

import java.util.UUID;
import java.util.regex.Pattern;

public class BaseEntity {
    
    private UUID id;
    
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        
        if (!this.isValidUUID(id.toString())) {
            throw new IllegalArgumentException("Id is not valid");
        }
        
        this.id = id;
    }

    protected UUID generateUuid() {
        this.id = UUID.randomUUID();

        return this.id;
    }

    protected Boolean isValidUUID(String _id) {
        if (_id == null) {
            return false;
        }
        
        Pattern UUID_REGEX_PATTERN = Pattern.compile("([a-f0-9]{8}(-[a-f0-9]{4}){4}[a-f0-9]{8})");
        return UUID_REGEX_PATTERN.matcher(_id).matches();
    }
}
