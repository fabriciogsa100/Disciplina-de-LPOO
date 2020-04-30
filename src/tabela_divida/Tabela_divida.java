/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela_divida;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Tabela_divida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int divida;
        float juros = (float) 0.1;
        int qtde_par;
        float val_par, valor_total;
        
        
        Scanner num = new Scanner(System.in);
        System.out.println("Informe o valor da divida: ");
        divida = num.nextInt();
        System.out.println("Informe a quantidade de parcelas: ");
        qtde_par = num.nextInt();
        System.out.println("ATENÇÃO: Nas compras parceladas a partir de 2x no cartão, é acrescentado o juros de 10% do valor da compra em cada parcela!");
        val_par = ((divida/qtde_par)+ "+"+ (divida*juros));
        System.out.println("O valor da parcela é: "+val_par);
        for(int i =1; i <= qtde_par; i++){
        qtde_par = num.nextInt();
                System.out.println("Quantidade de parcelas"+i);
        
       //or (float i = juros; i <= qtde_par; i++){
            System.out.println(juros);
            System.out.println("O valor da parcela é: "+(divida/qtde_par)+juros);
        
        
    }
    }
    }
    }
    
}
