package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t7u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t7u0 f33484a;
    public static final t7u0 b;
    public static final /* synthetic */ t7u0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    t7u0 EF0;

    static {
        t7u0 t7u0Var = new t7u0("STRICT", 0);
        t7u0 t7u0Var2 = new t7u0("LOG", 1);
        f33484a = t7u0Var2;
        t7u0 t7u0Var3 = new t7u0("QUIET", 2);
        b = t7u0Var3;
        c = new t7u0[]{t7u0Var, t7u0Var2, t7u0Var3};
    }

    public static t7u0 valueOf(String str) {
        return (t7u0) Enum.valueOf(t7u0.class, str);
    }

    public static t7u0[] values() {
        return (t7u0[]) c.clone();
    }
}
