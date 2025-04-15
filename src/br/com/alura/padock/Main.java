package br.com.alura.padock;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Login login = new Login();

        login.setEmail("peterson@gmail.ste");
        login.setPassword("123456");

        PesquisaCliente pesquisaCliente = new PesquisaCliente();

        var user = pesquisaCliente.pesqCliente(login);

        System.out.println(user.toString());
    }
}
