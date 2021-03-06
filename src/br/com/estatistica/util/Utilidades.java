package br.com.estatistica.util;
import java.util.HashMap;
import java.util.Map;

public class Utilidades {
	
		public int[][] retornaQtdRepOrdenada (Map<Integer, Integer> mapa){
			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[][] mtrx = new int[2][25];
			
			for(int i=0 ; i < 25 ; i++){
				
				mtrx[0][i] = i+1;
				mtrx[1][i] = mapa.get(i+1);

            }
		
			int aux1 = 0; 
			int aux2 = 2;
			
			for (int i = 0; i < 25; i++) { 
				
				for (int j = 0; j < 25; j++) { 
					
					if (mtrx[1][i] > mtrx[1][j]) { 
						
						aux1 = mtrx[1][i]; 
						aux2 = mtrx[0][i];
												
						mtrx[1][i] = mtrx[1][j]; 
						mtrx[1][j] = aux1;
						
						mtrx[0][i] = mtrx[0][j]; 
						mtrx[0][j] = aux2;
					} 
				} 
			}
						
			return mtrx;
		}
	
	
		public Map<Integer, Integer> retornaQtdRepeticoes(int[] vetor){
			
			int var1 = 0;
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0; 
			int var7 = 0;
			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			int var12 = 0;
			int var13 = 0;
			int var14 = 0;
			int var15 = 0;
			int var16 = 0;
			int var17 = 0;
			int var18 = 0;
			int var19 = 0;
			int var20 = 0;
			int var21 = 0;
			int var22 = 0;
			int var23 = 0;
			int var24 = 0;
			int var25 = 0;
			
			for (int i = 0; i < vetor.length; i++) {  
			
				switch (vetor[i]) {
					case 1:
						var1 = var1+1;
						break;
					case 2:
						var2 = var2+1;
						break;
					case 3:
						var3 = var3+1;
						break;
					case 4:
						var4 = var4+1;
						break;
					case 5:
						var5 = var5+1;
						break;	
					case 6:
						var6 = var6+1;
						break;
					case 7:
						var7 = var7+1;
						break;
					case 8:
						var8 = var8+1;
						break;
					case 9:
						var9 = var9+1;
						break;
					case 10:
						var10 = var10+1;
						break;	
					case 11:
						var11 = var11+1;
						break;
					case 12:
						var12 = var12+1;
						break;
					case 13:
						var13 = var13+1;
						break;
					case 14:
						var14 = var14+1;
						break;
					case 15:
						var15 = var15+1;
						break;	
					case 16:
						var16 = var16+1;
						break;
					case 17:
						var17 = var17+1;
						break;
					case 18:
						var18 = var18+1;
						break;
					case 19:
						var19 = var19+1;
						break;
					case 20:
						var20 = var20+1;
						break;	
					case 21:
						var21 = var21+1;
						break;
					case 22:
						var22 = var22+1;
						break;
					case 23:
						var23 = var23+1;
						break;
					case 24:
						var24 = var24+1;
						break;
					case 25:
						var25 = var25+1;
						break;	

				}
			
			}
			
			Map<Integer, Integer> mapaQdtRepeticoes = new HashMap<Integer, Integer>();
	        mapaQdtRepeticoes.put(1, var1);
	        mapaQdtRepeticoes.put(2, var2);
	        mapaQdtRepeticoes.put(3, var3);
	        mapaQdtRepeticoes.put(4, var4);
	        mapaQdtRepeticoes.put(5, var5);
	        mapaQdtRepeticoes.put(6, var6);
	        mapaQdtRepeticoes.put(7, var7);
	        mapaQdtRepeticoes.put(8, var8);
	        mapaQdtRepeticoes.put(9, var9);
	        mapaQdtRepeticoes.put(10, var10);
	        mapaQdtRepeticoes.put(11, var11);
	        mapaQdtRepeticoes.put(12, var12);
	        mapaQdtRepeticoes.put(13, var13);
	        mapaQdtRepeticoes.put(14, var14);
	        mapaQdtRepeticoes.put(15, var15);
	        mapaQdtRepeticoes.put(16, var16);
	        mapaQdtRepeticoes.put(17, var17);
	        mapaQdtRepeticoes.put(18, var18);
	        mapaQdtRepeticoes.put(19, var19);
	        mapaQdtRepeticoes.put(20, var20);
	        mapaQdtRepeticoes.put(21, var21);
	        mapaQdtRepeticoes.put(22, var22);
	        mapaQdtRepeticoes.put(23, var23);
	        mapaQdtRepeticoes.put(24, var24);
	        mapaQdtRepeticoes.put(25, var25);
	        
	        
	        return  mapaQdtRepeticoes;
	        
		}
		
}