package fun.gengyun.chain.servlet;

public class UrlFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        String r = request.getStr();
        r = r.replace("baidu", "www.baidu.com");
        request.setStr(r);

        chain.doFilter(request, response, chain);

        String s = response.getStr();
        s += "UrlFilter_";
        response.setStr(s);
    }
}
