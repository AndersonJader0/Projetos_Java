public class Carro2 {

    /*Classe com os atributos */

    private String modelo;
    private String cor;
    private String placa;
    private int numPortas;

    //Constructor sem e/ com inicialização dos atributos.

        public Carro2() {     
        }
        

        public Carro2(String modelo, String cor, String placa, int numPortas) {
            this.modelo = modelo;
            this.cor = cor;
            this.placa = placa;
            this.numPortas = numPortas;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        } 
        public String getPlaca() {
            return placa;
        }
        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public int getnumPortas() {
            return numPortas;
        }
        public void setnumPortas(int numPortas) {
            this.numPortas = numPortas;
        }
}
