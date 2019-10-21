public class UsaEstoque{
    public static void main(String[] args){
    	
        Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);
        
        if(estoque1.precisaRepor()){
            System.out.println("* O estoque do produto Impressora Jato de Tinta precisa ser reposto.");
        }
        else{
            System.out.println("* O estoque do produto Impressora Jato de Tinta não precisa ser reposto.");
            System.lineSeparator();
            System.lineSeparator(); 
        }
        
        if(estoque2.precisaRepor()){
            System.out.println("* O estoque do produto Monitor LCD 17 Polegadas precisa ser reposto.");
        }
        else{
            System.out.println("* O estoque do produto Monitor LCD 17 Polegadas não precisa ser reposto.");
        }

        if(estoque3.precisaRepor()){
            System.out.println("* O estoque do produto Mouse Óptico precisa ser reposto.");
        }
        else{
            System.out.println("* O estoque do produto Mouse Óptico não precisa ser reposto.");
        }

        System.out.println(System.lineSeparator());
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());
    }
}
