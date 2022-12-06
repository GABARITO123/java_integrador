import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bot {
    private String nome = "Rodrigo";
    private String senha = "123";
    private String descricao = "Bot criado para auxiliar os usuarios"+
                                " para pesquisar informações do ecommerce";

    private String enderecoExcel = "C:\\Users\\Aluno INRB\\PycharmProjects\\webScrapingintegrador\\pi.xls";

    LerEscreverExcel teste = new LerEscreverExcel(enderecoExcel);

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void botOpcoes() {
        System.out.println("Oi, eu sou o "+this.nome);
        System.out.println("Eu sou o "+this.descricao);
        System.out.println("O que deseja ver?");
        System.out.println("1 - Ver todos os produtos");
        System.out.println("2 - Ver todos os preços");
        System.out.println("Digite a opcao desejada:");
    }

    public void executarBot(int opcao) throws BiffException, IOException {

        Scanner sc = new Scanner(System.in);

        teste.lerExcel();

        switch (opcao) {
            case 1:
                System.out.println("Todos os produtos:");
                for (int x = 0; x <= teste.getAs1().length - 1; x++) {
                    System.out.println(teste.getAs1()[x]);
                }
                break;
            case 2:
                System.out.println("Preço dos produtos:");
                for (int x = 0; x <= teste.getAs2().length - 1; x++) {
                    System.out.println(teste.getAs2()[x]);
                }
                break;
//            case 5:
//                boolean flag = false;
//                System.out.println("Digite o código do usuario:");
//                String codigo = sc.next();
//                String[] produtos = teste.getAs2();
//                String[] preco = teste.getAs2();
//                for (int x = 0; x <= Arrays.asList(codigo).size(); x++) {
//                    if(Arrays.asList(produtos).get(x).equals(codigo)){
//                        System.out.println("Todos os dados de um usuario cadastrado");
//                        System.out.println("Produto: "+ Arrays.asList(produtos).get(x));
//                        System.out.println("Preço: "+Arrays.asList(preco).get(x));
//                        flag = true;
//                    }
//                }

//                if(flag == false){
//                    System.out.println("Não encontrado!");
//                }
            default:
                System.out.println("Opçao invalida!");
                break;
        }

        System.out.println("Desejar escolher outra opcao?S ou N");

    }
}
