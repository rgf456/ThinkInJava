package nine;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class Implementation2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
