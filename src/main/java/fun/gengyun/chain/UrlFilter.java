package fun.gengyun.chain;

public class UrlFilter implements Filter{

    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("baidu", "www.baidu.com");
        msg.setMsg(r);
        return true;
    }
}
