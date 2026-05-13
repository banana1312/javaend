
/***********************************************************************************************
*
* 課題	S2-3
*
* クラス名	：ShoppingBag2
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

import java.util.ArrayList;

/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class ShoppingBag2 extends ShoppingBag {

	private ArrayList<Goods>  buyGoodsList   ;



	public ShoppingBag2(int money)
	{
		super(money);
		buyGoodsList = new ArrayList<>();//空の購入リスト
	}
	//引数なし
	public ShoppingBag2()
	{
		super();
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



		@Override
		public void printShoppingBag()throws MyException
		{
			System.out.println("  (ShoppingBag2) 限度額　"+ getMoney()+"円");
			if ( buyGoodsList.isEmpty())
			{
		        throw new MyException("　　(ShoppingBag2)　商品は入っていません。");
			}


		    // 購入品リストの全件を、親に1件ずつ表示させる
		    for (Goods goods : buyGoodsList)
		    {


		    		goods.printGoods();

			}
		}



		@Override
		public void setGoods(Goods goods) {
		    super.setGoods(goods);    // 親の goods にもセット
		    buyGoodsList.add(goods);  // 購入品リストにも追加
		}

}
