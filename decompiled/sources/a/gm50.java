package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gm50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dm50 f11526a;
    public static final dm50 b;

    static {
        dm50 dm50Var = null;
        try {
            dm50Var = (dm50) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f11526a = dm50Var;
        b = new dm50();
    }
}
