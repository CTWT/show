package board.show.mapper;

import board.show.domain.Board;
import board.show.domain.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> getList();

    List<Board> getListWithPaging(Criteria cri);

    Board getBoard(Long boardId);

    void uploadBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long boardId);
}
