package fun.gengyun.chain.servlet;

public interface Filter {

    // 让每一个filter的实现者都持有整个链条的引用
    void doFilter(Request request, Response response, FilterChain chain);
}
