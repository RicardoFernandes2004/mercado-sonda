import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto fanta = new Produto("fanta",12.90,6);
        Produto coca = new Produto("coca 2L", 21.99, 4);
        Produto peixe = new Produto("carpa",40.33, 64);

        listaDeProdutos.add(fanta);
        listaDeProdutos.add(coca);
        listaDeProdutos.add(peixe);

        System.out.println(listaDeProdutos);

        ProdutoPerecivel leite = new ProdutoPerecivel("leite",8.99,2,23082025);
        System.out.println(leite);


    }
}