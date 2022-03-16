package com.lhuizito.notebook;

import model.*;
import java.util.ArrayList;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hotel Java");

/*
        Cliente cliente1 = new Cliente("Akira", "31-998548184", "414124214");

        Recepcionista recepcionista1 = new Recepcionista("Valeria", "31-31321", "3121232");

        recepcionista1.atenderTelefone();
        recepcionista1.falarIngles();

        Camareira camareira1 = new Camareira("Juana", "31-31231", "3123321321");

        camareira1.arrumarCama();
        camareira1.limparQuarto();

        //recepcionista faltou

        Gerente gerente1 = new Gerente("Fabricio", "31-9488432", "321312");
        gerente1.arrumarCama();
        gerente1.atenderTelefone();
        gerente1.falarIngles();
        gerente1.atenderTelefone();

        //enum

        Quarto quarto1 = new Quarto();

        quarto1.setNumero("205");
        quarto1.setValor(321.1);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();

        quarto2.setNumero("350");
        quarto2.setValor(500.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);
*/

        Cliente cliente1 = new Cliente("Novato","31212","3213211",19);
        Cliente cliente2 = new Cliente("Danilo","31212","3213211",20);
        Cliente cliente3 = new Cliente("Eberson","31212","3213211",21);
        Cliente cliente4 = new Cliente("Janaina","31212","3213211",32);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1); // 0
        clientes.add(cliente2); // 1
        clientes.add(cliente3); // 2
        clientes.add(cliente4); // 3

        // retorna quantidade de elementos presentes em uma stream (colecao)
        clientes.stream().count();
        clientes.size(); // mesma coisa

        // bagulho doido de forEach abaixo
        clientes.stream().limit(2).forEach(cliente -> System.out.println(cliente.getNome())); // ira retornar uma lista com apenas 2 elementos da lista atual

        clientes.stream().skip(2).forEach(cliente -> System.out.println(cliente.getNome())); // ira retornar uma lista pulando 2 elementos

        //Stream<Cliente> resultado3 = clientes.stream().sorted(); // ira retornar uma lista ordenada
        // clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream().filter(cliente -> cliente.getIdade() > 25).forEach(cliente -> System.out.println("Idades maiores que 25: " + cliente.getIdade()));

        // System.out.println(resultado4.count()); // stream cria um novo array, por isso tive que utilizar
                                                  // um .count()
        // busca por parametro, quem contem parametro no nome e retornado
        // se ninguem tiver, e ignorado
        clientes.stream().filter(cliente -> cliente.getNome().contains("Janaina")).forEach(cliente -> System.out.println("Pessoas que tem parametro no nome: " + cliente.getNome()));

        // busca por parametro, quem inicia com tal letra do parametro
        // se o parametro é minusculo tem que se iniciar com minusculo
        clientes.stream().filter(cliente -> cliente.getNome().startsWith("E")).forEach(cliente -> System.out.println("Pessoas que comecam com o parametro: " + cliente.getNome() + "\n\n\n\n"));

        // map faz o mapeamento do array, devolvendo o array de nomes
        //clientes.stream().map(cliente -> cliente.getNome()); VERSÃO ANTIGA
        clientes.stream().map(Cliente::getNome).forEach(System.out::println); // versão nova com forEach novo
        // ^ Stream<String>

    }
}
