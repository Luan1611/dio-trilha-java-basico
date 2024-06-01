package List.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itensCarrinho;

    public CarrinhoDeCompras() {
        itensCarrinho = new ArrayList<>();
    }

    //Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade) {
        itensCarrinho.add(new Item(nome, preco, quantidade));
        System.out.println("Item adicionado!");
    }

    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome) {
        List<Item> listaDeItensParaRemocao = new ArrayList<>();
        for (Item item: itensCarrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaDeItensParaRemocao.add(item);
            }
        }
        if (listaDeItensParaRemocao.size() > 0) {
            itensCarrinho.removeAll(listaDeItensParaRemocao);
            System.out.println("Item/itens removido/removidos!");
        } else {
            System.out.println("Nenhum item com o nome especificado foi encontrado no carrinho");
        }

    }

    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item: itensCarrinho) {
            valorTotal = valorTotal + (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens() {
        if (itensCarrinho.size() > 0) {
            System.out.println("Itens presentes no carrinho:\n");
            for (Item item: itensCarrinho) {
                System.out.println("Nome do item: " + item.getNome());
                System.out.println("Preço (unitário): " + item.getPreco());
                System.out.println("Quantidade: " + item.getQuantidade() + "\n");
            }
        } else {
            System.out.println("Carrinho vazio.");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        meuCarrinho.exibirItens();

        System.out.println(meuCarrinho.calcularValorTotal());

        meuCarrinho.adicionarItem("Coca cola", 4.50, 3);
        meuCarrinho.adicionarItem("Monster Zero", 8.50, 1);
        meuCarrinho.adicionarItem("Pasta de amendoim", 14.50, 2);

        meuCarrinho.exibirItens();

        System.out.println("Valor total de itens no carrinho: " + meuCarrinho.calcularValorTotal());

        meuCarrinho.removerItem("Coca");
        meuCarrinho.removerItem("pasta de amendoim");

        System.out.println("Valor total após remoção da pasta de amendoim: " + meuCarrinho.calcularValorTotal());


    }

}