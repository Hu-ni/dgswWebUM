package kr.hs.dgsw.member_registe;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    private List<User> userList;

    public UserServiceimpl(){
        userList = new ArrayList<User>();
    }

    @Override
    public List<User> selected() {
        return userList;
    }

    @Override
    public User view(String id) {
        User found = userList.stream()
                .filter(user -> user.getId().equals(id))
                .findAny()
                .orElse(null);
        return found;
    }

    @Override
    public boolean add(User user) {
        User found = this.view(user.getId());
        if(found != null) return false;
        return userList.add(user);
    }

    @Override
    public User update(User user) {
        User found = this.view(user.getId());
        if(found != null){
            found.setEmail(user.getEmail());
            found.setName(user.getName());
        }
        return found;
    }

    @Override
    public boolean delete(String id) {
        User found = this.view(id);
        return userList.remove(found);
    }


}
