import java.util.ArrayList;
import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;import javax.swing.JFrame;
import javax.swing.JOptionPane; 
class Container
{
	 public JFrame frame;
	 
	 ArrayList<Supermarket> sm = new ArrayList<>();
	 public void addTov(Supermarket obj) 
	 {
		 sm.add(obj);
		 //уведомление о добавлении записи
		 JOptionPane.showMessageDialog(frame,"Запись добавлена!","Уведомление",JOptionPane.INFORMATION_MESSAGE); 
	 }
	 public String show()
	 {
	   String str="";
	   for(int i = 0; i < sm.size(); i++) {
		   switch (sm.get(i).TipTovara)
	         {
	             case "Игрушки": Igrushki elI = (Igrushki) sm.get(i);
	             str=str+"Товар номер:"+(i+1)+"\nТип товара:"+elI.TipTovara+"\nНазвание отдела:"+elI.NazOtd
	 				   	+"\nНазвание товара:"+elI.NazTov+
					   	"\nСтрана Производитель:"+ elI.StranaProiz+
					   	"\nРозничная цена:"+elI.RoznCena+
					   	"\nПоставщик:"+elI.Postav+
					   	"\nВозрастное ограничение:"+elI.VosrGR+
					   	"\nТип:"+elI.TIP+"\n"; break;
	             case "Фрукты": Frukts elF = (Frukts) sm.get(i);
	             str=str+"Товар номер:"+(i+1)+"\nТип товара:"+elF.TipTovara+"\nНазвание отдела:"+elF.NazOtd
	         		   	+"\nНазвание товара:"+elF.NazTov+
	        		   	"\nСтрана Производитель:"+ elF.StranaProiz+
	        		   	"\nРозничная цена:"+elF.RoznCena+
	        		   	"\nПоставщик:"+elF.Postav+
	        		   	"\nМаксимальное время хранения:"+elF.MaxVrHran+
	        		   	"\nТемпература хранения:"+elF.TempHr+"\n"; break;
	             case "Габаритный товар": GabTovar elGB = (GabTovar) sm.get(i); 
	             str=str+"Товар номер:"+(i+1)+"\nТип товара:"+elGB.TipTovara+"\nНазвание отдела:"+elGB.NazOtd
	         		   	+"\nНазвание товара:"+elGB.NazTov+
	         		   	"\nСтрана Производитель:"+ elGB.StranaProiz+
	         		   	"\nРозничная цена:"+elGB.RoznCena+
	         		   	"\nПоставщик:"+elGB.Postav+
	         		   	"\nВысота:"+elGB.Visota+
	         		   	"\nШирина:"+elGB.Shirina+
	         		   	"\nДлина:"+elGB.Dlina+"\n";
	             break;
	             default: System.out.println("Ошибка"); break;
	         } 
        }
	   return str;
	 }
}
class Supermarket 
{
	public String TipTovara;
    public String NazOtd;
    public String NazTov;
    public String StranaProiz;
    public Double RoznCena;
    public String Postav;
    public  Supermarket(String TipTovara,String NazOtd, String NazTov, String StranaProiz, Double RoznCena,String Postav) 
    {
    	this.TipTovara = TipTovara;
        this.NazOtd = NazOtd;
        this.NazTov = NazTov;
        this.StranaProiz = StranaProiz;
        this.RoznCena = RoznCena;
        this.Postav=Postav;
    }
}


 class Igrushki extends Supermarket
{
	 public String VosrGR;
	 public String TIP;
	 public Igrushki (String TipTovara,String NazOtd, String NazTov, String StranaProiz, Double RoznCena,String Postav,String VosrGR,String TIP)
	 {
		 super(TipTovara,NazOtd, NazTov, StranaProiz, RoznCena, Postav);
		 this.TipTovara=TipTovara;
		 this.VosrGR = VosrGR;
	     this.TIP = TIP;
	 }
}

 class Frukts extends Supermarket
{
	public String MaxVrHran;
	public String TempHr;
	public Frukts(String TipTovara,String NazOtd, String NazTov, String StranaProiz, Double RoznCena, String Postav,String MaxVrHran, String TempHr)
	{
	    super(TipTovara,NazOtd, NazTov, StranaProiz, RoznCena, Postav);
		this.MaxVrHran = MaxVrHran;
	    this.TempHr = TempHr;
	}
}
 
 class GabTovar extends Supermarket
{
	public Double Visota;
	public Double Shirina;
	public Double Dlina;
	public GabTovar(String TipTovara,String NazOtd, String NazTov, String StranaProiz, Double RoznCena, String Postav,Double Visota,Double Shirina,Double Dlina) 
	{
	   super(TipTovara,NazOtd, NazTov, StranaProiz, RoznCena, Postav);
	   this.Visota = Visota;
	   this.Shirina = Shirina;
	   this.Dlina = Dlina;
	}
}