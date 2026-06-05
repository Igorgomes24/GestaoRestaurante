public class GerirCozinha {
    private ListaSimples filaPedido = new ListaSimples();
    private ListaSimples historicoPedido = new ListaSimples();

    //Add pedido
    public void mostrarFila(){
        System.out.println("##### FILA DE ESPERA DA COZINHA #####");
        filaPedido.listar();
    }

    //mostrar historico
    public void mostrarHistorico(){
        System.out.println("##### HISTORICO DE PEDIDOS FEITOS #####");
        historicoPedido.listar();
    }
}
