package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class im50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fm50 f15010a;
    public static final fm50 b;

    static {
        c5d0 c5d0Var = c5d0.c;
        fm50 fm50Var = null;
        try {
            fm50Var = (fm50) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15010a = fm50Var;
        b = new fm50();
    }
}
