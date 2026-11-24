package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class q0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0m0 f27907a;
    public static final q0m0 b;
    public static final q0m0 c;
    public static final q0m0 d;
    public static final /* synthetic */ q0m0[] e;

    static {
        q0m0 q0m0Var = new q0m0("EMPTY", 0);
        f27907a = q0m0Var;
        q0m0 q0m0Var2 = new q0m0("TRANSPARENT_STYLE_CODE", 1);
        b = q0m0Var2;
        q0m0 q0m0Var3 = new q0m0("CUSTOM_STYLE_CODE", 2);
        c = q0m0Var3;
        q0m0 q0m0Var4 = new q0m0("DEFAULT_STYLE_CODE", 3);
        d = q0m0Var4;
        e = new q0m0[]{q0m0Var, q0m0Var2, q0m0Var3, q0m0Var4};
    }

    public static q0m0 valueOf(String str) {
        return (q0m0) Enum.valueOf(q0m0.class, str);
    }

    public static q0m0[] values() {
        return (q0m0[]) e.clone();
    }
}
