public class maincarro2 {
    public static void main(String[] args) {
        Carro2 meuCarro2 = new Carro2("HB20", "amarelo" , "T3St002" , 4);
        System.out.print("The number of the doors of my " + meuCarro2.getModelo() + meuCarro2.getCor() + "is" + meuCarro2.getnumPortas() + "and has the plate number" + "T3ST002");
    }
}
