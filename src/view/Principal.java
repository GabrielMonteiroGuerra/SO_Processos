package view;

import controller.ProcessosController; //importa a classe

public class Principal {

	public static void main(String[] args) {
		ProcessosController procController = new ProcessosController(); //cria o m�todo construtor	
		
		
		/*PRIMEIRO M�TODO, mostrar vers�o, arquitetura e o SO*/
//	   String os = procController.os(); //instancia
//       System.out.println(os);//imprime os valores
  
		
//------------------------------------------------------------------------		
		
       /*SEGUNDO M�TODO, inicializar processos*/
        
      // String process = "c:\\Windows\\notepad.exe"; //Iniciando qualquer execut�vel
      // procController.callProcess(process);
		
//--------------------------------------------------------------------------		
		/*TERCEIRO M�TODO, mostrando todos os processos */
		
		//String process = "TASKLIST /FO TABLE"; //Mostrando todos os processos
		//String process = "PING -t10 www.google.com.br"; //Ping
		//String process = "TRACERT www.google.com.br"; //para descobrir o caminho que os pacotes fazem at� chegar no site
	//	String process = "ipconfig";		
	//	procController.readProcess(process);
		
//---------------------------------------------------------------------------
		
		/*QUARTO M�TODO, MATANDO PROCESSOS*/
		
		String param = "notepad.exe"; //Aqui vc coloca o nome ou o PID e ele mata o processo
		procController.killProcess(param);
		
	}
	
	

}
