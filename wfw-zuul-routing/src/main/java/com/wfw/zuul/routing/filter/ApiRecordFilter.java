package com.wfw.zuul.routing.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by killer9527 on 2018/5/30.
 * 接口调用记录Filter
 */
@Component
public class ApiRecordFilter extends ZuulFilter {
    private final Logger logger = LoggerFactory.getLogger(ApiRecordFilter.class);

    /**
     * 不同生命周期的过滤器类型:
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，NoSql去判断该请求到底有没有权限访问。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().setCharacterEncoding("gbk");
        HttpServletRequest request = ctx.getRequest();
        this.logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        /** 权限验证
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            this.logger.warn("token为空");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("无权限");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         **/
        return null;
    }
}
