package hello.login.domain.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); // static 사용
    private static long sequence = 0L; // static 사용

    public Member save(Member member) {
        member.setId(++sequence);
        log.info("save : member={}", member);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public Optional<Member> findByLoginId(String loginId) {
/*        List<Member> all = findAll();
        for (Member m : all) {
            if (m.getLoginId().equals(loginId)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();*/
        // Optional --> 객체가 있을 수도 있고 없을 수도 있음 값이 없을 땐 null 반환이 아닌 empty

        return findAll().stream().filter(m -> m.getLoginId().equals(loginId)).findFirst();
        // list 를 stream 으로 변경
        // filter 는 괄호 안의 조건을 만족했을 때만 다음 단계로 넘어감
        // findFirst : 제일 먼저 나오는 애를 반환
        // 람다, stream 중요!
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
        // map 에 들어간 값들을 values() 로 불러오고 list 로 리턴
    }

    public void clearStore() {
        store.clear();
    }
}
