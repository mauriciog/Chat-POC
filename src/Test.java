import br.ufu.facom.network.dlontology.FinSocket;

public class Test{
        public static void main(String[] args) {
                FinSocket fin = FinSocket.open();

                //fin.register("App0");

                //String msg = "Ola mundo";
                
                fin.write("App0","App1");

                //System.out.println("Mensagem enviada:");
                //System.out.println(msg);

                fin.close();
        }
}