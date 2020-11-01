package fun.gengyun.chain;

public class SensitiveFilter implements Filter{

    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("996", "955");
        msg.setMsg(r);
        return false;
    }
}
