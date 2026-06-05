public class ListaSimples {
    //inicio da minha lista
    private No inicio;

    public ListaSimples(){
        this.inicio =null; //a lista começa sem nenhum elemento
    }

    //metodo para verificar se está vazia
    public boolean isVazia(){
        return inicio == null;
    }

    //aqui começa a porra toda
    //Adicionar pedidos a lista (Comportamento FILA)
    public void inserirFinal(Pedido novoPedido){
        No novo = new No(novoPedido);

        if ((isVazia())) {
            inicio = novo; //validar se está vazia e colocar o No no inicio
        }else{
            No atual = inicio;
            //vai ate o ultimo No, e para onde o proximo é nulo
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        System.out.println("Pedido "+novoPedido.getId()+ " adicionado a lista");
    }

    //Listar pedidos existentes na lista
    public void listar(){
        if(isVazia()){
            System.out.println("Nenhum pedido ainda foi registado");
        }else{
            No atual = inicio;
            while (atual != null) {
                Pedido pedido = atual.getInfo();
                System.out.println("---> "+pedido.getId()+" - "+pedido.getNomeCliente()+": "+pedido.getDescricao());
                atual = atual.getProximo();
            }
        }
    }

}
