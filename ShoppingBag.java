
/***********************************************************************************************
*
* 課題	S2-1
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


package S2_1;

/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class ShoppingBag {

	private int money ;
	private Goods goods ;

	// コンストラクタ
	public ShoppingBag(int money)
	{
		this.money = money ;
	}
	//引数なし
	public ShoppingBag()
	{

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


	// 買い物かごの中身を表示する
	//ないときは例外
	public void printShoppingBag() throws MyException {
	    System.out.println("　　(ShoppingBag)　限度額　" + money + "円");
	    if (goods == null) {
	        throw new MyException("　　(ShoppingBag)　商品は入っていません。");
	    }
	    goods.printGoods();
	}
}
