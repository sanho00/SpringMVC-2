package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class MyNumberFormatter implements Formatter<Number> {

    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text={}, locale={}", text, locale);
        // "1,000" -> 1000
        NumberFormat format = NumberFormat.getInstance(locale);
        return format.parse(text);
    }
    // 1,000 처럼 숫자 중간의 쉼표 적용하려면 자바가 기본으로 제공하는 NumberFormat 객체 사용
    // 이 객체는 Locale 정보를 활용해서 나라별로 다른 숫자 포맷 만들어줌

    @Override
    public String print(Number object, Locale locale) {
        log.info("object={}, locale={}", object, locale);
        NumberFormat instance = NumberFormat.getInstance(locale);
        return instance.format(object);
    }
}
