package Lista_Exercicios1;
public class Exercicio12 {
    static void main(String[] args){
        double preco, perc_lucro, lucro, perc_imp, imp;

        System.out.println("Informe o preço: ");
        preco = Double.parseDouble(System.console().readLine());
        System.out.println("Informe o percentual de lucro: ");
        perc_lucro = Double.parseDouble(System.console().readLine())/100;
        System.out.println("Informe o percentual de impostos: ");
        perc_imp = Double.parseDouble(System.console().readLine())/100;

        lucro = perc_lucro*preco;
        System.out.printf("Lucro do distribuidor = R$ %.2f", lucro);

        imp = perc_imp*preco;
        System.out.printf("\nImpostos = R$ %.2f", imp);

        preco = preco + lucro + imp;
        System.out.printf("\nPreço final = R$ %.2f", preco);

    }
}
