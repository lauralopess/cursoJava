package logicaDeProgamacao;

public class EstruturaDeDecisão {

	public static void main(String[] args) {
        String nome = "João Roberto";
        int idade = 17;
        char sexo = 'M';
        
        if (sexo == 'M') {
        	System.out.println("Alistamento militar obrigatório!");
        	
        }
        
        else {
        	System.out.println("Não é necessário se alistar.");
        }
        
        System.out.println("__________________________________");
        
        if (sexo == 'M') {
        	if (idade >= 18) {
        		System.out.println("Alistamento obrigatório!");
        		
        	}
        	
        	else {
        		System.out.println("Você não tem a idade necessária." );
        	}
        	
        }
        
        else {
        	System.out.println("É preciso ser do sexo masculino para se alistar" + "com obrigatoriedade!");
        }
	}
	
}


       

     
