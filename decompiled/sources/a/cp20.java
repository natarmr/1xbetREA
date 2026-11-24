package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zo20 f4725a;
    public static final zo20 b;

    static {
        c5d0 c5d0Var = c5d0.c;
        zo20 zo20Var = null;
        try {
            zo20Var = (zo20) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4725a = zo20Var;
        b = new zo20();
    }
}
