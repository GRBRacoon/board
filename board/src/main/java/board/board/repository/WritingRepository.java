package board.board.repository;

import board.board.domain.Writing;

import java.util.List;

public interface WritingRepository {
    public Writing save(Writing writing);
    public void delete(Writing writing);



    public List<Writing> findByName(String name);//제목으로
    public  List<Writing> findAll();//전체호출
    public  List<Writing> findByStuff(String stuff);//내용으로
    public List<Writing> findByUserName(String name);//사람이름으로

}
