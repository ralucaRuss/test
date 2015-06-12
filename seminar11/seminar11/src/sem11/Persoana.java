package sem11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;

public class Persoana {

	private String CNP;
	private String nume;
	
	public Persoana(String nume, String CNP){
		this.nume=nume;
		this.CNP=CNP;
	}
	
	public String getSex(){
		switch(CNP.charAt(0)){
			case '1': return "M";
			case '2': return "F";
			case '3': return "M";
			case '4': return "F";
			case '5': return "M";
			case '6': return "F";
		}
		return "N/A";
	}
	
	public int getVarsta(){
		/*return Calendar.getInstance().get(1) - (1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));*/
		return 10;
		//test ca sa vedem ca esueaza pentru referinta externa
	}
	
	public String getJudet(){
		HashMap<Integer, String> judete=new HashMap<Integer, String>();
		
		try {
			FileReader reader=new FileReader("Judete");
			BufferedReader bf=new BufferedReader(reader);
			String linie=null;
			while((linie=bf.readLine())!=null && linie.length()>0){
				judete.put(Integer.parseInt(linie.split("	")[0]), linie.split("	")[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return judete.get(Integer.parseInt(""+CNP.charAt(7)+CNP.charAt(8)));
	}
	
	public boolean checkCNP(){
		int s=0;
		 String number="279146358279";
		for(int i=0;i<12;i++){
			s+=Integer.parseInt(""+number.charAt(i))*Integer.parseInt(""+CNP.charAt(i));			
		}
		int cifra=s%11;
		if(cifra==10)
			cifra=1;
		return cifra==Integer.parseInt(""+CNP.charAt(12));
	}
	
}


