package board.board.repository;

import board.board.domain.Member;

import java.util.List;

public interface MemberRepository {
    public Member save(Member member);
    public void delete(Member member);
    public List<Member> findByCode(Long userCode);
    public List<Member> findByNickname(String Nickname);

}
