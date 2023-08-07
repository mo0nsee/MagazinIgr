import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader;
public class Glav 
{
	public static void main(String[] args) throws IOException 
	{
		Container c = new Container();
		c.show();
		
		BufferedReader bReader = new BufferedReader (new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Введите операцию(1-для добавления игрушки;\n2-для добавления фрукта;\n3-для добавления габаритного товара;\n4-для вывода товаров;\n0-для выхода)");
			int k = Integer.parseInt(bReader.readLine());
			String TipTovara,NazOtd,NazTov,StranaProiz,Postav,MaxVrHran,TempHr,VosrGR,TIP;
			Double RoznCena,Visota,Shirina,Dlina;
			   switch (k)
		         {
		             case 1: TipTovara="Игрушка";
		             System.out.println("Название отдела:");
		             NazOtd=bReader.readLine();
		             System.out.println("Название товара:");
		             NazTov=bReader.readLine();
		             System.out.println("Страна производитель:");
		             StranaProiz=bReader.readLine();
		             System.out.println("Розничная цена:");
		             RoznCena=Double.parseDouble(bReader.readLine());
		             System.out.println("Поставщик:");
		             Postav=bReader.readLine();
		             System.out.println("Возрастные ограничения:");
		             VosrGR=bReader.readLine();
		             System.out.println("Тип:");
		             TIP=bReader.readLine(); 
		             Supermarket s=new Igrushki(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,VosrGR,TIP);
		             c.addTov((Igrushki) s);
		             break;
		             case 2: TipTovara="Фрукты";
		             System.out.println("Название отдела:");
		             NazOtd=bReader.readLine();
		             System.out.println("Название товара:");
		             NazTov=bReader.readLine();
		             System.out.println("Страна производитель:");
		             StranaProiz=bReader.readLine();
		             System.out.println("Розничная цена:");
		             RoznCena=Double.parseDouble(bReader.readLine());
		             System.out.println("Поставщик:");
		             Postav=bReader.readLine();
		             System.out.println("Максимальное время хранения:");
		             MaxVrHran=bReader.readLine();
		             System.out.println("Температура хранения:");
		             TempHr=bReader.readLine();
		             Supermarket s1=new Frukts(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,MaxVrHran,TempHr);
		             c.addTov((Frukts) s1);
		             break;
		             case 3: TipTovara="ГабТовар";
		             System.out.println("Название отдела:");
		             NazOtd=bReader.readLine();
		             System.out.println("Название товара:");
		             NazTov=bReader.readLine();
		             System.out.println("Страна производитель:");
		             StranaProiz=bReader.readLine();
		             System.out.println("Розничная цена:");
		             RoznCena=Double.parseDouble(bReader.readLine());
		             System.out.println("Поставщик:");
		             Postav=bReader.readLine();
		             System.out.println("Высота:");
		             Visota=Double.parseDouble(bReader.readLine());
		             System.out.println("Ширина:");
		             Shirina=Double.parseDouble(bReader.readLine());
		             System.out.println("Длина:");
		             Dlina=Double.parseDouble(bReader.readLine());
		             Supermarket s2=new GabTovar(TipTovara,NazOtd,NazTov,StranaProiz,RoznCena,Postav,Visota,Shirina,Dlina);
		             c.addTov((GabTovar) s2);
		             break;
		             case 4:
		             c.show(); break;
		             default: System.out.println("Ошибка"); break;
		             case 0:
		            	 System.exit(0);break;
		         }  
	}
}
}
