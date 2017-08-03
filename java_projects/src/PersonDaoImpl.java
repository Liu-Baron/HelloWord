import annotation.HelloWord;

/**
 * Created by 82595 on 2017/7/7.
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public void say(String str) {
        System.out.println("吃上了--" + str);
    }

    @Override
    public void say2(String str) {
        System.out.println("222  吃上了--" + str);
    }

    @HelloWord("弄哈雷")
    public void testShow() {

    }
}
