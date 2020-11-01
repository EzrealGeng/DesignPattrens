package fun.gengyun.chain.servlet;

public class SensitiveFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        String r = request.getStr();
        r = r.replace("996", "955");
        request.setStr(r);

        chain.doFilter(request, response, chain);

        String s = response.getStr();
        s += "SensitiveFilter_";
        response.setStr(s);
    }
}
