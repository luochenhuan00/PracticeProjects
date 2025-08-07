package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 使用更有意义的变量名
        ArrayList<String> memberNames = new ArrayList<>();
        ArrayList<String> userPhrases = new ArrayList<>();
        ArrayList<String> responses = new ArrayList<>();

        memberNames.add("马嘉祺");
        memberNames.add("丁程鑫");
        memberNames.add("宋亚轩");
        memberNames.add("刘耀文");
        memberNames.add("张真源");
        memberNames.add("严浩翔");
        memberNames.add("贺峻霖");

        userPhrases.add("可是我有点恐高...");
        responses.add("（挥手间，地面变成棉花糖）现在你恐高了吗？恐高是病，得治，我的治疗方法就是让你从珠穆朗玛峰顶端跳下来，我会用头发接住你。");

        userPhrases.add("可是我梦见自己变成了一只猫啊！");
        responses.add("（掏出一本《梦境法典》）根据第368章第7款，梦见自己是猫而不带上我，属于严重违规。（突然小娇妻家的所有猫都开始说话）它们都是我派来监视你的，现在它们都会用你的声音汇报你的行踪。");

        userPhrases.add("可是这太吵了！");
        responses.add("（挥手间，地球停止自转）现在不吵了，但全球时区都变成了\"爱你时区\"。");

        userPhrases.add("可是我昨天刚答应了外星人的求婚！");
        responses.add("（瞬间暴怒）什么？！（掏出一个对讲机）呼叫全宇宙舰队，准备星际战争！我要把那个外星人所在的星系从宇宙地图上抹去！");

        userPhrases.add("（打开盒子，里面是一张纸）这是什么？");
        responses.add("（深情款款）这是宇宙的产权证书，上面写着\"宇宙归你所有，但你是我的\"。（突然严肃）如果你拒绝我，我就让全宇宙的原子都重新排列，让你永远找不到自己的袜子。");

        Scanner sc = new Scanner(System.in);
        System.out.println("输入'退出'结束程序");

        while (true) {
            System.out.print("我：");
            String input = sc.nextLine().trim();

            // 添加退出条件
            if ("退出".equalsIgnoreCase(input)) {
                System.out.println("程序结束");
                break;
            }

            boolean foundMatch = false;

            // 检查输入是否匹配任何用户短语
            for (int i = 0; i < userPhrases.size(); i++) {
                if (userPhrases.get(i).contains(input)) {
                    foundMatch = true;
                    // 打印所有成员的回复
                    for (int j = 0; j < memberNames.size(); j++) {
                        System.out.println(memberNames.get(j) + ": " + responses.get(i));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt(); // 恢复中断状态
                            System.out.println("输出被中断");
                            return;
                        }
                    }
                }
            }

            // 如果没有找到匹配，提示用户
            if (!foundMatch) {
                System.out.println("没有找到匹配的回复");
            }
        }

        sc.close();
    }
}