import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> sdsnt = new ArrayList<>();
        ArrayList<String> Al1 = new ArrayList<>();
        ArrayList<String> Al2 = new ArrayList<>();
        sdsnt.add("马嘉祺");
        sdsnt.add("丁程鑫");
        sdsnt.add("宋亚轩");
        sdsnt.add("刘耀文");
        sdsnt.add("张真源");
        sdsnt.add("严浩翔");
        sdsnt.add("贺峻霖");
        Al1.add("可是我有点恐高...");
        Al2.add("（挥手间，地面变成棉花糖）现在你恐高了吗？恐高是病，得治，我的治疗方法就是让你从珠穆朗玛峰顶端跳下来，我会用头发接住你。");
        Al1.add("可是我梦见自己变成了一只猫啊！");
        Al2.add("（掏出一本《梦境法典》）根据第368章第7款，梦见自己是猫而不带上我，属于严重违规。（突然小娇妻家的所有猫都开始说话）它们都是我派来监视你的，现在它们都会用你的声音汇报你的行踪。");
        Al1.add("可是这太吵了！");
        Al2.add("（挥手间，地球停止自转）现在不吵了，但全球时区都变成了\"爱你时区\"。");
        Al1.add("可是我昨天刚答应了外星人的求婚！");
        Al2.add("（瞬间暴怒）什么？！（掏出一个对讲机）呼叫全宇宙舰队，准备星际战争！我要把那个外星人所在的星系从宇宙地图上抹去！");
        Al1.add("（打开盒子，里面是一张纸）这是什么？");
        Al2.add("（深情款款）这是宇宙的产权证书，上面写着\"宇宙归你所有，但你是我的\"。（突然严肃）如果你拒绝我，我就让全宇宙的原子都重新排列，让你永远找不到自己的袜子。");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("我：");
            String input = sc.nextLine().toString();
            for (int i = 0; i < Al1.size(); i++) {
                if (Al1.get(i).contains(input)) {
                    for (int i2 = 0; i2 < sdsnt.size(); i2++) {
                        System.out.println(sdsnt.get(i2) + ":" + Al2.get(i));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
}
