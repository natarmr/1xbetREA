package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ap20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo20 f1230a;
    public static final xo20 b;

    static {
        xo20 xo20Var = null;
        try {
            xo20Var = (xo20) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1230a = xo20Var;
        b = new xo20();
    }
}
