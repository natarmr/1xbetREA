package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gzs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gzs0 f12197a;
    public static final gzs0 b;
    public static final gzs0 c;
    public static final /* synthetic */ gzs0[] d;

    static {
        gzs0 gzs0Var = new gzs0("NOT_NULL", 0);
        f12197a = gzs0Var;
        gzs0 gzs0Var2 = new gzs0("NULLABLE", 1);
        b = gzs0Var2;
        gzs0 gzs0Var3 = new gzs0("FLEXIBLE", 2);
        c = gzs0Var3;
        d = new gzs0[]{gzs0Var, gzs0Var2, gzs0Var3};
    }

    public static gzs0 valueOf(String str) {
        return (gzs0) Enum.valueOf(gzs0.class, str);
    }

    public static gzs0[] values() {
        return (gzs0[]) d.clone();
    }
}
