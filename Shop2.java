
/***********************************************************************************************
*
* 課題	S2-2
*
* クラス名	： Shop2
* 作成者　クラス名：東京
* 　　　　受講番号：108
* 　　　　氏　　名：　江原　幸佑
*
* 完成日付	：2026/05/13
*
*
*
***********************************************************************************************/

package S2_2;
import java.util.*;



/**
 *
 * @author FLM
 * @version 1.0.0
 */
public class Shop2 extends Shop{



	private ArrayList<Goods>  goodsList  ;




	//コンストラクタ
		public Shop2(String shopName, String telNo)
		{
			super(shopName, telNo);


			goodsList = new ArrayList<>();

		}
	//引数なし
		public Shop2() {
		    super();
		}



		public void addGoods(String goodsName, int price)
		{
			goodsList.add(new Goods(goodsName,price));
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
		@Override
		public void printShop()
		{
			System.out.println("(Shop2)　" + getShopName() + "です。 TEL:" + getTelNo()); // 親の店舗情報を表示

	        // 配列の全商品を繰り返し表示

	        	for (Goods goods : goodsList)
	        	{
	        		goods.printGoods();
	        	}



		}
		@Override
		public void saleGoods(String goodsName,ShoppingBag shoppingBag)
		{
			boolean found = false;



			for (Goods goods : goodsList)
	        {

				if(goods.getGoodsName().equals(goodsName))
				{
					found=true;
					setGoods(goods);
					break;
				}

	        }

			if (found=true)
		    {
		        // 計算はShopに任せる
		        super.saleGoods(goodsName, shoppingBag);
		    }else {
		    	System.out.println("\n"+"　　(Shop)　"  +getShopName() + " 「" + goodsName + "は取り扱っておりません。申し訳ございません。」");
		    }
		}



		}









