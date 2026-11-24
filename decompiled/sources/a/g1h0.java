package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1h0 f10512a;
    public static final g1h0 b;
    public static final /* synthetic */ g1h0[] c;

    static {
        g1h0 g1h0Var = new g1h0("TopBar", 0);
        f10512a = g1h0Var;
        g1h0 g1h0Var2 = new g1h0("MainContent", 1);
        b = g1h0Var2;
        c = new g1h0[]{g1h0Var, g1h0Var2};
    }

    public static g1h0 valueOf(String str) {
        return (g1h0) Enum.valueOf(g1h0.class, str);
    }

    public static g1h0[] values() {
        return (g1h0[]) c.clone();
    }
}
