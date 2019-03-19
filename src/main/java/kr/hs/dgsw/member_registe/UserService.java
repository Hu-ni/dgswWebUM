package kr.hs.dgsw.member_registe;

import java.util.List;

public interface UserService {
    List<User> selected();
    User view(String id);
    boolean add(User user);
    User update(User user);
    boolean delete(String id);
}
