import io.realm.react.RealmReactPackage; // add this import

public class MainApplication extends Application implements ReactApplication {
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new RealmReactPackage() // add this line
        );
    }
}