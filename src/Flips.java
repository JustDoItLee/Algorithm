
/**
 * @author 李智
 * @date 2017/1/4
 * <p>
 * 实例化
 */
public class Flips {
    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        System.out.println(heads.getHead());

    }
}

class Counter {
    private String head;

    public Counter(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
