package Java_Study.Proxy;

public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "蝈蝈";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 18;
    }
}
