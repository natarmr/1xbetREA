package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ro8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ro8 f30824a;
    public static final ro8 b;
    public static final ro8 c;
    public static final /* synthetic */ ro8[] d;

    static {
        ro8 ro8Var = new ro8("SMALL", 0);
        f30824a = ro8Var;
        ro8 ro8Var2 = new ro8("MEDIUM", 1);
        b = ro8Var2;
        ro8 ro8Var3 = new ro8("LARGE", 2);
        c = ro8Var3;
        d = new ro8[]{ro8Var, ro8Var2, ro8Var3};
    }

    public static ro8 valueOf(String str) {
        return (ro8) Enum.valueOf(ro8.class, str);
    }

    public static ro8[] values() {
        return (ro8[]) d.clone();
    }
}
