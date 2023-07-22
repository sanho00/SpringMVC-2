package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    // 로그인 했을 때 회원 조회 후 파라미터로 넘어온 password 와 비교해서 같으면 회원 반환
    // password 다르면 null 반환
    public Member login(String loginId, String password) {
/*        Optional<Member> findMemberPOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberPOptional.get();
        if (member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }*/
        // 위의 주석과 같은 코드
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);

    }
}
