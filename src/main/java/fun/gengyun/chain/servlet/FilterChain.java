package fun.gengyun.chain.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    int index = 0;

    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response, FilterChain chain) {
        if (filters.size() == index){
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, chain);
    }
}
