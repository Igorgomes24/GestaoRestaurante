public class No {
    private Pedido info;
    private No proximo;

    // construtor
    public No(Pedido info) {
        this.info = info;
        this.proximo = null;
    }

    public Pedido getInfo() {
        return info;
    }

    public void setInfo(Pedido info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
