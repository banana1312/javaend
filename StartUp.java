/**
 * StartUp.java
 *
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 */

package S2_1;



/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class StartUp {
	public static void main(String[] args) {


		//東京点を作る
			Shop tokyo = new Shop ("東京店","03-1234-5678");

			Shop1 tokyo1 = new Shop1 ("東京店","03-1234-5678" );
			tokyo1.createGoods(0,"海洋深層水", 1200);
			tokyo1.createGoods(1, "ビタミンABC", 350);
			tokyo1.createGoods(2, "天然黒酢",890 );
			tokyo1.createGoods(3, "アガリクス", 2000);
			tokyo1.createGoods(4, "アロエはちみつ", 650);


			System.out.println("=================================");
			tokyo1.printShop();
			System.out.println("=================================");

			tokyo.createGoods("海洋深層水", 1200);


			//(Customer)山田さん作る
			Customer yamada = new Customer("山田");
			yamada.createBag(1000);

			yamada.printCustomer();



			System.out.println( );
			yamada.buyGoods(tokyo1, "海洋深層水");


			System.out.println( );
			yamada.buyGoods(tokyo1, "青汁一杯");


			System.out.println( );
			yamada.buyGoods(tokyo1, "ビタミンABC");


			System.out.println( );
			yamada.printCustomer();



	}
}
