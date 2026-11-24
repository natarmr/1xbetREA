package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ato {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xso f1440a = new xso();
    public static final xso b;

    static {
        c5d0 c5d0Var = c5d0.c;
        xso xsoVar = null;
        try {
            xsoVar = (xso) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = xsoVar;
    }
}
