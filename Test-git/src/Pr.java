import java.util.Scanner;


public class Pr {
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		
		System.out.println("HPを入力してください");
		int hp = s.nextInt();
		System.out.println("EXPを入力してください");
		int exp = s.nextInt();
		System.out.println("MONEYを入力してください");
		int money = s.nextInt();
		System.out.println("NAMEを入力してください");
		String name = s.next();

		System.out.println("HP:" + hp);
		System.out.println("EXP:" + exp);
		System.out.println("MONEY:" + money);
		System.out.println("NAME:" + name);
		
		Save sa = new Save(name, hp, exp, money);
		sa.kaki();
		
		System.out.println("セーブしました");
		
		hp = 0;
		exp = 0;
		money = 0;
		name = null;
		
		System.out.println("HP:" + hp);
		System.out.println("EXP:" + exp);
		System.out.println("MONEY:" + money);
		System.out.println("NAME:" + name);
		
		System.out.println("ロードしますか y/n");
		String situ = s.next();
		
		if(situ.equals("y") || situ.equals("Y")){
			Load lo = new Load();
			hp = lo.getHp();
			exp = lo.getExp();
			money = lo.getMoney();
			name = lo.getName();
			
			System.out.println("ロードの完了");
			
			System.out.println("HP:" + hp);
			System.out.println("EXP:" + exp);
			System.out.println("MONEY:" + money);
			System.out.println("NAME:" + name);
		}
	}

}
