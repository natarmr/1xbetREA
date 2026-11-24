package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gxk0 f12081a;
    public static final gxk0 b;
    public static final gxk0 c;
    public static final /* synthetic */ gxk0[] d;

    static {
        gxk0 gxk0Var = new gxk0("ONE_COLLECTION_PARAMETER", 0);
        f12081a = gxk0Var;
        gxk0 gxk0Var2 = new gxk0("OBJECT_PARAMETER_NON_GENERIC", 1);
        b = gxk0Var2;
        gxk0 gxk0Var3 = new gxk0("OBJECT_PARAMETER_GENERIC", 2);
        c = gxk0Var3;
        d = new gxk0[]{gxk0Var, gxk0Var2, gxk0Var3};
    }

    public static gxk0 valueOf(String str) {
        return (gxk0) Enum.valueOf(gxk0.class, str);
    }

    public static gxk0[] values() {
        return (gxk0[]) d.clone();
    }
}
