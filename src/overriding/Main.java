package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] manager= new BaseKrediManager[] {
				new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
         
		for(BaseKrediManager base : manager) {
			System.out.println(base.hesapla(1000));
		}
		}
	
	}

