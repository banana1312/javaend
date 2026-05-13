
/***********************************************************************************************
*
* 課題	S2-4
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

package S2_4;




/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class StartUp {
	public static void main(String[] args) {


		//東京点を作る
			Shop tokyo = new Shop ("東京店","03-1234-5678");


//			Shop2 tokyo2 = new Shop2 ("東京店","03-1234-5678" );




			tokyo.addGoods("海洋深層水", 1200);
			tokyo.addGoods("ビタミンABC", 350);
			tokyo.addGoods("天然黒酢", 890);
			tokyo.addGoods("アガリクス", 2000);
			tokyo.addGoods("アロエはちみつ", 650);
			tokyo.addGoods("青汁一杯", 120);





			System.out.println("=================================");
			tokyo.printShop();
			System.out.println("=================================");

			tokyo.createGoods("海洋深層水", 1200);


			//(Customer)山田さん作る
			Customer yamada = new Customer("山田");
			yamada.createBag(2000);


			yamada.buyGoods(tokyo, "青汁一杯");

			System.out.println( );
			yamada.buyGoods(tokyo, "ビタミンABC");


			System.out.println( );
			yamada.buyGoods(tokyo, "アロエはちみつ");











			System.out.println( );
			yamada.printCustomer();






	}
}
