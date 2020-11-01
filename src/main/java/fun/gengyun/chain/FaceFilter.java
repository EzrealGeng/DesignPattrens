package fun.gengyun.chain;

public class FaceFilter implements Filter{

    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace(":)", "0^0");
        msg.setMsg(r);
        return true;
    }
}
