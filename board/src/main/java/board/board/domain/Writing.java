package board.board.domain;

import java.util.List;

public class Writing {
    //제목, 작성자 , 글번호, 내용, 시간, 댓글 목록

    private String name;
    private long userCode;
    private long writingNum;
    private String stuffing;
    private int time;

    private List<Writing> sideWrite;
    public Writing(String name, long userCode, String stuffing, int time) {
        this.name = name;
        this.userCode = userCode;
        this.stuffing = stuffing;
        this.time = time;
    }

    public long getWritingNum() {
        return writingNum;
    }

    public void setWritingNum(long writingNum) {
        this.writingNum = writingNum;
    }

    public List<Writing> getSideWrite() {
        return sideWrite;
    }

    public void setSideWrite(List<Writing> sideWrite) {
        this.sideWrite = sideWrite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserCode() {
        return userCode;
    }

    public void setUserCode(long userCode) {
        this.userCode = userCode;
    }

    public String getStuffing() {
        return stuffing;
    }

    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
