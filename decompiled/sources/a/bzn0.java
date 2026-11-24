package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bzn0 f3478a;
    public static final bzn0 b;
    public static final /* synthetic */ bzn0[] c;

    static {
        bzn0 bzn0Var = new bzn0("TWO", 0);
        f3478a = bzn0Var;
        bzn0 bzn0Var2 = new bzn0("THREE", 1);
        b = bzn0Var2;
        c = new bzn0[]{bzn0Var, bzn0Var2};
    }

    public static bzn0 valueOf(String str) {
        return (bzn0) Enum.valueOf(bzn0.class, str);
    }

    public static bzn0[] values() {
        return (bzn0[]) c.clone();
    }
}
