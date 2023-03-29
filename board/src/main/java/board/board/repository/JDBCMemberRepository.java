package board.board.repository;

import board.board.domain.Member;

import java.util.List;

public class JDBCMemberRepository implements MemberRepository{
    @Override
    public Member save(Member member) {
        return member;
    }

    @Override
    public void delete(Member member) {

    }

    @Override
    public List<Member> findByCode(Long userCode) {
        return null;
    }

    @Override
    public List<Member> findByNickname(String Nickname) {
        return null;
    }
}
