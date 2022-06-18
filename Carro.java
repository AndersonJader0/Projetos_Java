public class Carro {
/*------------------------------------------Atributos da Classe--------------------------------------- */
    private String modelo;
    private String cor;
    private String placa;
    private int numPortas;

Public class Carro () {
}


/*-------------------------------------------Métodos da Classe----------------------------------------- */

//método modelo

    public String getModelo() {
    return modelo;
    }
    public void setModelo(String modelo) {
    this.modelo = modelo;

    }

//método cor

    public String getCor() {
    return cor;
    }
    public void setCor(String cor) {
    this.cor = cor;
    }

//método placa

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

//método numPortas

    public int getnumPortas() {
        return numPortas;
    }
    public void setnumPortas(int numPortas) {
        this.numPortas = numPortas;
    }



    /*----------------------------------------Método principal------------------------------------- */

    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        
        meuCarro.setModelo("HB20");
        meuCarro.setCor("yellow");
        meuCarro.setPlaca("T3ST001");     
        meuCarro.setnumPortas(4);  

        System.out.print("My car is " + meuCarro.getCor() +" the model is " + meuCarro.getModelo() + " has " + meuCarro.getnumPortas() + " doors and has the plate numbers " + meuCarro.getPlaca());

    }

}
