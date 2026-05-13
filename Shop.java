
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


package S2_4;
import java.util.*;

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
	private ArrayList<Goods>  goodsList  ;

	// コンストラクタ
	public  Shop(String shopName, String telNo)
	{
		this.shopName = shopName;
		this.telNo = telNo ;
		goodsList = new ArrayList<>();

	}



	//引数なし

	public Shop()
	{

	}

	public void addGoods(String goodsName, int price)
	{
		goodsList.add(new Goods(goodsName,price));
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
    	for (Goods goods : goodsList)
    	{
    		goods.printGoods();
    	}
	}

	/**
	 * goodsListのGetter
	 * @return goodsList
	 */
	public ArrayList<Goods> getGoodsList() {
		return goodsList;
	}



	/**
	 * goodsListのSetter
	 * @param goodsList
	 */
	public void setGoodsList(ArrayList<Goods> goodsList) {
		this.goodsList = goodsList;
	}



	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
	    boolean found = false;

	    // 商品リストから探す
	    for (Goods g : goodsList)
	    {
	        if (goodsName.equals(g.getGoodsName()))
	        { // 商品があった
	            int price = g.getPrice();
	            int money = shoppingBag.getMoney() - price; // おつり

	            System.out.println();
	            if (money >= 0)
	            { // お金が足りる
	                shoppingBag.setMoney(money);
	                shoppingBag.setGoods(g);
	                System.out.println("　　(Shop)　"  +shopName + "　「" + goodsName+ "は"+  price+ "円です。まいどあり！　おつりは" + money+ "円です。」");
	            } else
	            { // 足りない
	            	System.out.println("　　(Shop)　"  +shopName + "　「" + goodsName+ "は"+  price+ "円です。お金が足りません。」");
	            }
	            found = true;
	            break; // 見つけたらループを抜ける
	        }
	    }

	    // 商品がなかった
	    if (found == false)
	    {
	    	System.out.println("　　(Shop)　"  +shopName + " 「" + goodsName + "は取り扱っておりません。申し訳ございません。」");
	    }
	}

	}






