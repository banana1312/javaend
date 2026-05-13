
/***********************************************************************************************
*
* 課題	S2-4
*
* クラス名	：Customer
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
public class Customer {




	private String customerName ;
	private ShoppingBag shoppingBag ;


	//コンストラクタ
	public Customer(String customerName)
	{
		this.customerName = customerName ;
	}
//	引数なし
	public Customer()
	{

	}



	/**
	 * customerNameのGetter
	 * @return customerName
	 */
	public String getCustomerName() {
		return customerName;
	}



	/**
	 * customerNameのSetter
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	/**
	 * shoppingBagのGetter
	 * @return shoppingBag
	 */
	public ShoppingBag getShoppingBag() {
		return shoppingBag;
	}



	/**
	 * shoppingBagのSetter
	 * @param shoppingBag
	 */
	public void setShoppingBag(ShoppingBag shoppingBag) {
		this.shoppingBag = shoppingBag;
	}


		//操作の委譲
		public void createBag(int money)
		{
			shoppingBag = new ShoppingBag(money);
		}

		 // 客の情報を表示
		public void printCustomer()
		{
			System.out.println("(Customer)　" + customerName+ "さんの買い物かご");
			//買い物前のかごの中身を確認
			try
			{
				shoppingBag.printShoppingBag();
			} 	catch (MyException e)
				{
					System.out.println(e.getMessage());
				}
		}



		public void queryShop(Shop shop)
		{
			System.out.println("(Customer)　"+ customerName+"　「このお店は何店ですか？」");
			shop.printShop();
		}

		// 商品を注文
		public void buyGoods(Shop shop, String goodsName) {

		    System.out.print("(Customer)　" + customerName + "　「" + goodsName + "をください」");
		   //Shop側のおつりとかの計算を任せる
		    shop.saleGoods(goodsName, shoppingBag);

		}


}
