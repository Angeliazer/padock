package br.com.alura.padock;

public class User {
    private int id;
    private String email;
    private String token;
    private String message;
    private int statusCode;

    public String getToken() {
        return token;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return "{ id : "+getId()+ ", email : "+getEmail()+", token : "+getToken()+", message : "+getMessage()+", " +
                "statusCode : "+getStatusCode()+"}";
    }
}
