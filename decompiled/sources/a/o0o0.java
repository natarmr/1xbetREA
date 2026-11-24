package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o0o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0o0 f24438a;
    public static final o0o0 b;
    public static final o0o0 c;
    public static final o0o0 d;
    public static final /* synthetic */ o0o0[] e;

    static {
        o0o0 o0o0Var = new o0o0("SKIPPED_SELECTED", 0);
        f24438a = o0o0Var;
        o0o0 o0o0Var2 = new o0o0("NOT_FOUND_SELECTED", 1);
        b = o0o0Var2;
        o0o0 o0o0Var3 = new o0o0("FOUND_ALL_SELECTED", 2);
        c = o0o0Var3;
        o0o0 o0o0Var4 = new o0o0("NO_FILTERS", 3);
        d = o0o0Var4;
        e = new o0o0[]{o0o0Var, o0o0Var2, o0o0Var3, o0o0Var4};
    }

    public static o0o0 valueOf(String str) {
        return (o0o0) Enum.valueOf(o0o0.class, str);
    }

    public static o0o0[] values() {
        return (o0o0[]) e.clone();
    }
}
