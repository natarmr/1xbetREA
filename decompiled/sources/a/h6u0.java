package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h6u0 f12546a;
    public static final h6u0 b;
    public static final /* synthetic */ h6u0[] c;

    static {
        h6u0 h6u0Var = new h6u0("Lsq2", 0);
        f12546a = h6u0Var;
        h6u0 h6u0Var2 = new h6u0("Impulse", 1);
        b = h6u0Var2;
        c = new h6u0[]{h6u0Var, h6u0Var2};
    }

    public static h6u0 valueOf(String str) {
        return (h6u0) Enum.valueOf(h6u0.class, str);
    }

    public static h6u0[] values() {
        return (h6u0[]) c.clone();
    }
}
