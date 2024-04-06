public class Review01 {
    public static void main(String[] args) {
        // 商品価格
        int price = 1500;

        // 消費税を計算
        int taxAmount = tax(price);

        // 税込価格を計算
        int totalPrice = price + taxAmount;

        // 結果を出力
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    // 消費税を計算するメソッド
    public static int tax(int price) {
        // 税率
        double taxRate = 0.1;

        // 消費税を計算し、小数点以下を切り捨てて整数値に変換
        int taxAmount = (int) (price * taxRate);

        return taxAmount;
    }
}
