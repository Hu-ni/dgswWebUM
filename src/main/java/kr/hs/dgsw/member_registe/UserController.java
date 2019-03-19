package kr.hs.dgsw.member_registe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService us;

    @GetMapping("/user")
    @ResponseBody
    public List<User> selected(){
        return us.selected();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User view(@PathVariable String id){
        return us.view(id);
    }

    @PostMapping("/user")
    @ResponseBody
    public boolean add(@RequestBody User user){
        return us.add(user);
    }

    @PutMapping("/user")
    @ResponseBody
    public User update(@RequestBody User user){
        return us.update(user);
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public boolean delete(@PathVariable    String id){
        return us.delete(id);
    }

}
