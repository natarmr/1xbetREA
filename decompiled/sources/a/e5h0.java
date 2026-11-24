package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e5h0 f7234a;
    public static final e5h0 b;
    public static final /* synthetic */ e5h0[] c;

    static {
        e5h0 e5h0Var = new e5h0("ACTIVE_DEFAULT", 0);
        f7234a = e5h0Var;
        e5h0 e5h0Var2 = new e5h0("INACTIVE_DEFAULT", 1);
        b = e5h0Var2;
        c = new e5h0[]{e5h0Var, e5h0Var2, new e5h0("ACTIVE_GREEN", 2), new e5h0("INACTIVE_GREEN", 3)};
    }

    public static e5h0 valueOf(String str) {
        return (e5h0) Enum.valueOf(e5h0.class, str);
    }

    public static e5h0[] values() {
        return (e5h0[]) c.clone();
    }
}
