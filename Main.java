import java.util.HashMap;
import java.util.Map;

public class Main {
    //    ここはMAPのブロック
    public static Map<String,String> nationByCode = new HashMap<>(){{
        put("IS","アイスランド共和国");
        put("IE","アイルランド");
        put("AZ","アゼルバイジャン共和国");
    }};

    //    ここが処理のブロック
    public static void main(String[] args) {
        //      例外が発生する可能性のある処理
        try {
            System.out.println(findNationCode("JP"));
        //      例外が発生した場合の処理
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    ここはクラスのブロック
    public static String findNationCode(String code) throws Exception{
        String nationName = nationByCode.get(code);
        //        if文で分岐をつくって何を表示する決めている。
        if (nationName==null){
            throw new Exception("No such a nation code :"+code);
        }
        return nationName;
    }

}
