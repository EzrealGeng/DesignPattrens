package fun.gengyun.chain.servlet;

public class FaceFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        String r = request.getStr();
        r = r.replace(":)", "0^0");
        request.setStr(r);

        chain.doFilter(request, response, chain);

        String s = response.getStr();
        s += "FaceFilter_";
        response.setStr(s);
    }
}
