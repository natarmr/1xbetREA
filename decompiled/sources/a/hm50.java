package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hm50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final em50 f13290a;
    public static final em50 b;

    static {
        em50 em50Var = null;
        try {
            em50Var = (em50) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f13290a = em50Var;
        b = new em50();
    }
}
