public class Carro3 {

    //Atributos do Carro3

    private String modelo;
    private String cor;
    private String placa;
    private int numPortas;
    private Motor motor;


    //construtor carro
    Carro3 meuCarro3 = new Carro3(modelo, cor, placa, numPortas, motor);
    //método construtor completo
    public Carro3(String modelo, String cor, String placa, int numPortas, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
        this.motor = motor;
    }
 
    //Métodos do Carro3
    
    public String getModelo() {
        return modelo;
    }

    public void getModelo(String modelo) {
        this.modelo = modelo;
    }

    public String setCor() {
        return cor;
    }
    public void getCor(String cor) {
        this.cor = cor;
    }
    
    public String setPlaca() {
        return placa;
    }
    public void getPlaca(String placa) {
        this.placa = placa;
    }

    public int setnumPortas() {
        return numPortas;
    }
    public void getnumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public class Motor {

        //Atributos do motor

        private double potência;
        private String tipo;
        private double acelerar;
        private Carro3.Motor motor;

        //Método do motor

        public Motor setMotor() {
            return motor;
        }
        public void getMotor(Motor motor) {
             this.motor = motor;
        }

        public double setPotência() {
            return potência;
        }
        public void getPotência (double potência) {
            this.potência = potência;
        }
        
        public String setTipo() {
            return tipo;
        }
        public void getTipo(String tipo) {
            this.tipo = tipo;
        }

        public double setAcelerar() {
            return acelerar;
        }
        public void getAcelerar(double acelerar) {
            this.acelerar = acelerar;
        }
    }
}

