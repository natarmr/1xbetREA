package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1h0 f15734a;
    public static final j1h0 b;
    public static final /* synthetic */ j1h0[] c;

    static {
        j1h0 j1h0Var = new j1h0("FILL", 0);
        f15734a = j1h0Var;
        j1h0 j1h0Var2 = new j1h0("FIT", 1);
        b = j1h0Var2;
        c = new j1h0[]{j1h0Var, j1h0Var2};
    }

    public static j1h0 valueOf(String str) {
        return (j1h0) Enum.valueOf(j1h0.class, str);
    }

    public static j1h0[] values() {
        return (j1h0[]) c.clone();
    }
}
