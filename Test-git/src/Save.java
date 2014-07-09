import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Save implements Serializable{
	String name;
	int hp;
	int exp;
	int money;

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getExp() {
		return exp;
	}

	public int getMoney() {
		return money;
	}

	Save(String name,int hp,int exp,int money){
		this.name = name;
		this.hp = hp;
		this.exp = exp;
		this.money = money;
	}
	
	void kaki(){
		try {
			ObjectOutputStream outO = new ObjectOutputStream(new FileOutputStream("savedate.txt"));
			
			outO.writeObject(new Save(name,hp,exp,money));//オブジェクトの書き込み
			
			outO.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
