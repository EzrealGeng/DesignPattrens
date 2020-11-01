package fun.gengyun.chain.servlet;

// https://www.cnblogs.com/zhulei2/p/13668235.html
public class Main {

    public static void main(String[] args) {
        Request request = new Request("大家好:),<script> 欢迎访问baidu，大家都是996");
        Response response = new Response("");

        FilterChain fc = new FilterChain();
        fc.add(new HtmlFilter()).add(new SensitiveFilter()).add(new FaceFilter()).add(new UrlFilter());

        fc.doFilter(request, response, fc);

        System.out.println(request.toString());
        System.out.println(response.toString());
    }
}
