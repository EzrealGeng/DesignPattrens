package fun.gengyun.chain;


public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg("张三", "大家好:),<script> 欢迎访问baidu，大家都是996");

        FilterChain fc1 = new FilterChain();
        fc1.add(new HtmlFilter()).add(new SensitiveFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new FaceFilter()).add(new UrlFilter());

//        fc1.doFilter(msg);
//        fc2.doFilter(msg);

        fc1.add(fc2);
        fc1.doFilter(msg);

        System.out.println(msg);
    }
}
