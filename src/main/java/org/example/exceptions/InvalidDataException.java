package org.example.exceptions;

public class InvalidDataException extends Throwable{

    public InvalidDataException(Entity entity){
        super(entity.getEntity() + " data is invalid");
    }
}
