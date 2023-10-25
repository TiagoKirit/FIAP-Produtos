package br.com.api.produto;

public class ControllerNotFoundException extends RuntimeException{

    public ControllerNotFoundException(String message){
        super(message);
    }
}
