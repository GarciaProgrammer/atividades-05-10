package atividadepoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        Pressoa usuario = new Pressoa();

        System.out.println("Informe seu Nome");
        nome = teclado.nextLine();

        if (!"".equals(nome)) {
            usuario.setNome(nome);
            System.out.println("Bem vindo " + usuario.getNome());
        } else {
            System.out.println("Precisa de identificação");
        }
        
        System.out.println("Informe seu ano de nascimento:");
        int anoNasc = teclado.nextInt();
        usuario.setAnoNasc(anoNasc);
        System.out.println("Seu ano de Nascimento é: " + usuario.getAnoNasc());
        System.out.println("Sua Idade é: " + usuario.getIdade());
        
    }
}
