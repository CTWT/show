package board.show.controller;

import board.show.domain.Board;
import board.show.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello() {
        return "/board/hello";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());

        return "/board/hello";
    }

    @GetMapping("/main")
    public String maint(Model model) {
        model.addAttribute("list", service.boardList());
        return "/board/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId) {
        model.addAttribute("view", service.getBoard(boardId));
        return "/board/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm() {
        return "/board/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board) {
        service.uploadBoard(board);
        return "redirect:/board/main";
    }

    @PutMapping("/update")
    public String updateBoard(Board board) {
        service.updateBoard(board);
        return "redirect:/board/main";
    }

    @DeleteMapping("/delete")
    public String deleteBoard(Long boardId) {
        service.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}
