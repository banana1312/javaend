
/***********************************************************************************************
*
* 課題	S2-1
*
* クラス名	： Shop1
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
//継承関係：Shop1 → Sho
public class Shop1 extends Shop{

//宣言　コンポジション
	private Goods[]  goodsList;

//コンストラクタ　superで初期化shopName,telNo
//doodsListのサイズを５で固定
	public Shop1(String shopName, String telNo)
	{
		super(shopName, telNo);
		this.goodsList = new Goods[5];
	}
//引数なしコンストラクタを呼ぶ
	public Shop1() {
	    super();
	}
//指定した番号nnに登録する。
	public void createGoods(int nn, String shopName, int price)
	{
		goodsList[nn] = new Goods(shopName,price);
	}



	 // 配列を指定サイズで生成
    public void createGoodsList(int nn)
    {
        this.goodsList = new Goods[nn];
    }


	/**
	 * goodsListのGetter
	 * @return goodsList
	 */
	public Goods[] getGoodsList() {
		return goodsList;
	}
	/**
	 * goodsListのSetter
	 * @param goodsList
	 */
	public void setGoodsList(Goods[] goodsList) {
		this.goodsList = goodsList;
	}

	//店舗クラスと全商品を表示
	@Override
	public void printShop()
	{
		System.out.println("(Shop1) " + getShopName() + "です。 TEL:" + getTelNo()); // 親の店舗情報を表示

        // 配列の全商品を繰り返し表示
        for (int i = 0; i < goodsList.length; i++)
        {

        	goodsList[i].printGoods();

        }

	}


	//指定した商品を販売する
	@Override
	public void saleGoods(String goodsName,ShoppingBag shoppingBag)
	{
		boolean found = false;

		for (int i = 0; i < goodsList.length; i++)
        {

			if(goodsList[i].getGoodsName().equals(goodsName))
			{
				found =  true ;
				setGoods(goodsList[i]);
				break;
			}


        }
		if (found == true)
	    {
	        // 計算はShopに任せる
	        super.saleGoods(goodsName, shoppingBag);
	    }else {
	    	//商品がないときの処理
	    	System.out.println("\n"+"　　(Shop)　"  +getShopName() + " 「" + goodsName + "は取り扱っておりません。申し訳ございません。」");
	    }
	}



	}



