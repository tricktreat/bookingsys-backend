package cn.ibilidi.serviceimp;

import cn.ibilidi.mapper.BookDetailMapper;
import cn.ibilidi.mapper.BookItemMapper;
import cn.ibilidi.model.BookDetail;
import cn.ibilidi.model.BookItem;
import cn.ibilidi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookServiceImp implements IBookService {
    @Autowired
    private BookItemMapper bookItemMapper;

    @Autowired
    private BookDetailMapper bookDetailMapper;

    @Override
    public int addBook(BookItem bookItem) {
        List<BookDetail> bookDetailList=bookItem.getBookdetaillist();
        for (BookDetail bookdetail:bookDetailList) {
            bookDetailMapper.insert(bookdetail);
        }
        return bookItemMapper.insert(bookItem);

    }

    @Override
    public List<BookItem> getBookitemsAfterSj(Date sj) {
        return bookItemMapper.getBookItems(sj);
    }

    @Override
    public List<BookDetail>  getBookdetailsByDate(Date date) {
        return bookDetailMapper.getBookdetailsByDate(date);
    }

    @Override
    public int updateBook(int status, String bookid) {
        bookDetailMapper.update(status+2,bookid);
        return bookItemMapper.update(status,bookid);
    }

    @Override
    public int cancelBook(String bookid) {
        bookDetailMapper.delete(bookid);
        return bookItemMapper.delete(bookid);
    }
}
