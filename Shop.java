
/***********************************************************************************************
*
* 課題	S2-2
*
* クラス名	： Shop
* 作成者　クラス名：東京
* 　　　　受講番号：108
* 　　　　氏　　名：　江原　幸佑
*
* 完成日付	：2026/05/11
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
public class Shop {
	//宣言
	private String shopName ;
	private String telNo ;
	private Goods goods ;

	// コンストラクタ
	public  Shop(String shopName, String telNo)
	{
		this.shopName = shopName;
		this.telNo = telNo ;

	}



	//引数なし

	public Shop()
	{

	}



	/**
	 * goodsのGetter
	 * @return goods
	 */
	public Goods getGoods() {
		return goods;
	}



	/**
	 * goodsのSetter
	 * @param goods
	 */
	public void setGoods(Goods goods) {
		this.goods = goods;
	}




	//操作の委譲

	public void createGoods(String goodsName, int price)
	{
	    this.goods = new Goods(goodsName, price);
	}





	/**
	 * shopNameのGetter
	 * @return shopName
	 */
	public String getShopName() {
		return shopName;
	}



	/**
	 * shopNameのSetter
	 * @param shopName
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}



	/**
	 * telNoのGetter
	 * @return telNo
	 */
	public String getTelNo() {
		return telNo;
	}



	/**
	 * telNoのSetter
	 * @param telNo
	 */
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}



	//表示

	public  void printShop()
	{
		System.out.println("(Shop)　" +shopName + "です。 TEL:" +telNo );
	}

	public void saleGoods(String goodsName, ShoppingBag  shoppingBag)
	{
		int price= goods.getPrice();
		int money =  shoppingBag.getMoney() - price;//おつり

		System.out.println();
			if(goodsName.equals(getGoods().getGoodsName()) )//商品があるか
			{
				if (money >= 0) //お金が足りる場合
				{
					// 残高を更新する
				    shoppingBag.setMoney(money);
				    // 買い物かごに商品を入れる
				    shoppingBag.setGoods(goods);
					System.out.println("　　(Shop)　"  +shopName + "　「" + goodsName+ "は"+  price+ "円です。まいどあり！　おつりは" + money+ "円です。」");
				}else//tarinai
				{
					System.out.println("　　(Shop)　"  +shopName + "　「" + goodsName+ "は"+  price+ "円です。お金が足りません。」");
				}
			}else//商品がないとき
				{
					System.out.println("　　(Shop)　"  +shopName + " 「" + goodsName + "は取り扱っておりません。申し訳ございません。」");
				}

	}



}


