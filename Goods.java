
/***********************************************************************************************
*
* 課題	S2-1
*
* クラス名	： Goods
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
public class Goods {

	private String goodsName ;
	private int price ;
	// コンストラクタ
	public Goods(String goodsName,int price)
	{
		this.goodsName =goodsName;
		this.price = price;

	}

	 // 引数なし
	public Goods()
	{

	}

	/**
	 * priceのGetter
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * priceのSetter
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * goodsNaneのGetter
	 * @return goodsNane
	 */
	public String getGoodsName() {
		return goodsName;
	}


	/**
	 * goodsNaneのSetter
	 * @param goodsNane
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	 // 商品の情報を表示する
	public void printGoods()
	{
		System.out.println("  "+"(Goods) "+ goodsName + " " + price + "円");
	}


}
