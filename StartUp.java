
/***********************************************************************************************
*
* 課題	S2-2
*
* クラス名	：StartUp
* 作成者　クラス名：東京
* 　　　　受講番号：108
* 　　　　氏　　名：　江原　幸佑
*
* 完成日付	：2026/05/13
*
*
*
***********************************************************************************************/

package S2_3;




/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class StartUp {
	public static void main(String[] args) {


		//東京点を作る
			Shop tokyo = new Shop ("東京店","03-1234-5678");


			Shop2 tokyo2 = new Shop2 ("東京店","03-1234-5678" );




			tokyo2.addGoods("海洋深層水", 1200);
			tokyo2.addGoods("ビタミンABC", 350);
			tokyo2.addGoods("天然黒酢", 890);
			tokyo2.addGoods("アガリクス", 2000);
			tokyo2.addGoods("アロエはちみつ", 650);
			tokyo2.addGoods("青汁一杯", 120);





			System.out.println("=================================");
			tokyo2.printShop();
			System.out.println("=================================");

			tokyo.createGoods("海洋深層水", 1200);


			//(Customer)山田さん作る
			Customer yamada = new Customer("山田");
			yamada.createBag(2000);

			yamada.printCustomer();





			System.out.println( );
			yamada.buyGoods(tokyo2, "青汁一杯");

			System.out.println( );
			yamada.buyGoods(tokyo2, "ビタミンABC");


			System.out.println( );
			yamada.buyGoods(tokyo2, "アロエはちみつ");











			System.out.println( );
			yamada.printCustomer();






	}
}
