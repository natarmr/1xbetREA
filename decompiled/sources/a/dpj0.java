package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dpj0 f6470a;
    public static final dpj0 b;
    public static final /* synthetic */ dpj0[] c;

    static {
        dpj0 dpj0Var = new dpj0("GENERAL", 0);
        f6470a = dpj0Var;
        dpj0 dpj0Var2 = new dpj0("FALLBACK", 1);
        b = dpj0Var2;
        c = new dpj0[]{dpj0Var, dpj0Var2};
    }

    public static dpj0 valueOf(String str) {
        return (dpj0) Enum.valueOf(dpj0.class, str);
    }

    public static dpj0[] values() {
        return (dpj0[]) c.clone();
    }
}
