import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.management.ObjectInstance;


public class Load {
	
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
	
	Load(){
		try {
			//ロード処理
			ObjectInputStream objI = new ObjectInputStream(new FileInputStream("savedate.save"));
			Save save = (Save)objI.readObject();
			
			objI.close();
			
			//ロードしたデータの取出し
			name = save.getName();
			hp = save.getHp();
			exp = save.getExp();
			money = save.getMoney();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
