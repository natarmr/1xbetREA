package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bp20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yo20 f2959a;
    public static final yo20 b;

    static {
        yo20 yo20Var = null;
        try {
            yo20Var = (yo20) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2959a = yo20Var;
        b = new yo20();
    }
}
