package model;

/**
 *
 * @author gilvan
 */

import java.io.*;


public class Main_01 {
    public static void main(String[] args) {
        try {
            // Instanciando repositório de pessoas físicas (repo1)
            PessoaFisicaRepo repo1 = new PessoaFisicaRepo();

            // Adicionando duas pessoas físicas
            PessoaFisica pessoaFisica1 = new PessoaFisica(1, "Ana", "111.111.111-11", 25);
            PessoaFisica pessoaFisica2 = new PessoaFisica(2, "Carlos", "222.222.222-22", 52);
            repo1.inserir(pessoaFisica1);
            repo1.inserir(pessoaFisica2);

            // Persistindo os dados no arquivo "pessoasFisicas.dat"
            repo1.persistir("pessoasFisicas.dat");
            System.out.println("Dados das Pessoas Fisica Armazenados.");

            // Instanciando outro repositório de pessoas físicas (repo2)
            PessoaFisicaRepo repo2 = new PessoaFisicaRepo();

            // Recuperando os dados do arquivo "pessoasFisicas.dat"
            repo2.recuperar("pessoasFisicas.dat");

            // Exibindo os dados de todas as pessoas físicas recuperadas
            System.out.println("Dados das Pessoas Fisica Recuperados.");
            for (PessoaFisica pessoa : repo2.obterTodos()) {
                pessoa.exibir();
            }

            // Instanciando repositório de pessoas jurídicas (repo3)
            PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();

            // Adicionando duas pessoas jurídicas
            PessoaJuridica pessoaJuridica1 = new PessoaJuridica(3, "XPTO Sales", "33.333.333/3333-33");
            PessoaJuridica pessoaJuridica2 = new PessoaJuridica(4, "XPTO Solutions", "44.444.444/4444-44");
            repo3.inserir(pessoaJuridica1);
            repo3.inserir(pessoaJuridica2);

            // Persistindo os dados no arquivo "pessoasJuridicas.dat"
            repo3.persistir("pessoasJuridicas.dat");
            System.out.println("Dados das Pessoas Juridica Armazenados.");

            // Instanciando outro repositório de pessoas jurídicas (repo4)
            PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();

            // Recuperando os dados do arquivo "pessoasJuridicas.dat"
            repo4.recuperar("pessoasJuridicas.dat");

            // Exibindo os dados de todas as pessoas jurídicas recuperadas
            System.out.println("Dados das Pessoas Juridica Recuperados.");
            for (PessoaJuridica pessoa : repo4.obterTodos()) {
                pessoa.exibir();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}