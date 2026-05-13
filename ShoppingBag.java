
/***********************************************************************************************
*
* 課題	S2-2
*
* クラス名	：ShoppingBag
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

import java.util.ArrayList;

/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class ShoppingBag {

	private int money ;
	private Goods goods ;
	private ArrayList<Goods>  buyGoodsList   ;

	// コンストラクタ
	public ShoppingBag(int money)
	{
		this.money = money ;
		buyGoodsList = new ArrayList<>();
	}
	//引数なし
	public ShoppingBag()
	{
		buyGoodsList = new ArrayList<>();
	}







	/**
	 * moneyのGetter
	 * @return money
	 */
	public int getMoney() {
		return money;
	}
	/**
	 * moneyのSetter
	 * @param money
	 */
	public void setMoney(int money) {
		this.money = money;
	}
	/**
	 * buyGoodsListのGetter
	 * @return buyGoodsList
	 */
	public ArrayList<Goods> getBuyGoodsList() {
		return buyGoodsList;
	}
	/**
	 * buyGoodsListのSetter
	 * @param buyGoodsList
	 */
	public void setBuyGoodsList(ArrayList<Goods> buyGoodsList) {
		this.buyGoodsList = buyGoodsList;
	}
	/**
	 * goodsのGetter
	 * @return goods
	 */
	public Goods getGoods() {
		return goods;
	}



	// 買い物かごの中身を表示する
	//ないときは例外
	public void printShoppingBag() throws MyException {
	    System.out.println("　　(ShoppingBag)　限度額　" + money + "円");
	    if (buyGoodsList.isEmpty()) {
	        throw new MyException("　　(ShoppingBag)　商品は入っていません。");
	    }
	    // 購入品リストの全件を、親に1件ずつ表示させる
	    for (Goods goods : buyGoodsList)
	    {


	    		goods.printGoods();

		}
	}
	public void setGoods(Goods goods)
	{
		this.goods = goods;
	    buyGoodsList.add(goods);  // 購入品リストにも追加
	}
}
