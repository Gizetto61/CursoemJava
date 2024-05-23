package Get_Set_Const;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.setModelo("BIC");
        /*
         * ERRO! Pois Modelo é Privado
         * caneta1.Modelo = "BIC";
         */
        /*
         * ERRO! Pois Ponta é privada
         * caneta1.Ponta = 0.5;
         */
        caneta1.setPonta(0.5);

        System.out.println("TENHO UMA CANETA " + caneta1.getModelo() + " de ponta " + caneta1.getPonta());
        caneta1.Status();
    }
}
