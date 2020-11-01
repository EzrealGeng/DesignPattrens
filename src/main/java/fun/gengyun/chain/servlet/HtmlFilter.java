package fun.gengyun.chain.servlet;

public class HtmlFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        String r = request.getStr();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        request.setStr(r);

        chain.doFilter(request, response, chain);

        String s = response.getStr();
        s += "HtmlFilter_";
        response.setStr(s);
    }
}
