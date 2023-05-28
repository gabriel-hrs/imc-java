package fit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        double peso = 85;
        double altura = 1.80;
        double imcCalculado = ( peso / (altura*altura) ) ;

        String descricao = labelImc(imcCalculado);

        String texto = "Peso: " + peso + " Altura " + altura + " IMC: " + imcCalculado + " Resultado: " + descricao;

        System.out.println( texto );

    }

    private static String labelImc(double imcCalculado){
        if(imcCalculado < 18.5){ return "Magreza"; }
        if(imcCalculado < 24.9){ return "Normal"; }
        if(imcCalculado < 30){ return "Sobrepeso"; }
        return "Obsesidade";
    }
}
