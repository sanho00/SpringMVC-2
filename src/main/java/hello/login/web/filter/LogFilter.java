package hello.login.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

@Slf4j
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("log filter init");
    }

    // HTTP 요청 오면 doFilter 호출됨
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("log filter doFilter");

        // ServletRequest 는 HTTP 요청이 아닌 경우까지 고려해서 만든 경우임
        // HTTP 를 사용할 거면 HttpServletRequest 로 다운 캐스팅 하여 사용
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        // HTT{ 요청 구문하기 위해 요청당 임의의 uuid 생성
        String uuid = UUID.randomUUID().toString();

        try {
            // uuid 와 requestURI 출력
            log.info("REQUEST [{}][{}]", uuid, requestURI);

            // 다음 필터가 있으면 필터를 호출하고 필터가 없으면 서블릿 호출함
            // 이 로직을 호출하지 않으면 다음 단계로 진행 X, 컨트롤러와 서블릿 모두 호출 안돼서 웹페이지 먹통됨
            chain.doFilter(request, response);
        } catch (Exception e) {
            throw e;
        } finally {
            log.info("RESPONSE [{}][{}]", uuid, requestURI);
        }
    }

    @Override
    public void destroy() {
        log.info("log filter destroy");
    }
}
