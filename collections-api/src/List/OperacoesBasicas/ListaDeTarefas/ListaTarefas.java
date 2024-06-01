package List.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    //Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao)); //instância anônima da Classe Tarefa passada como argumento
    }

    //Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String descricao) {

        List<Tarefa> listaTarefasParaSeremRemovidas = new ArrayList<>();

        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefasParaSeremRemovidas.add(tarefa);
            }
        }

        listaDeTarefas.removeAll(listaTarefasParaSeremRemovidas);

    }

    //Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return listaDeTarefas.size();
    }

    //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public List<String> obterDescricoesTarefas() {
        List<String> listaDescricoesTarefas = new ArrayList<>();

        if (this.listaDeTarefas.size() > 0) {
            for (Tarefa tarefa : listaDeTarefas) {
                listaDescricoesTarefas.add(tarefa.getDescricao());
            }
            return listaDescricoesTarefas;
        }

        System.out.println("A lista não contém nenhuma tarefa");
        return listaDescricoesTarefas;

    }

    public static void main(String[] args) {

        ListaTarefas listaDeTarefas = new ListaTarefas();
        System.out.println("Quantidade total de tarefas na minha lista de tarefas: " + listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.adicionarTarefa("Tarefa1");
        listaDeTarefas.adicionarTarefa("Tarefa2");
        listaDeTarefas.adicionarTarefa("Tarefa2");
        listaDeTarefas.adicionarTarefa("Tarefa3");

        System.out.println("Quantidade total de tarefas na minha lista de tarefas: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.removerTarefa("Tarefa2");
        System.out.println("Quantidade total de tarefas na minha lista de tarefas: " + listaDeTarefas.obterNumeroTotalTarefas());

        System.out.println(listaDeTarefas.obterDescricoesTarefas());


    }

}