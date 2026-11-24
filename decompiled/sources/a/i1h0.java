package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1h0 f13999a;
    public static final i1h0 b;
    public static final i1h0 c;
    public static final i1h0 d;
    public static final i1h0 e;
    public static final /* synthetic */ i1h0[] f;

    static {
        i1h0 i1h0Var = new i1h0("TopBar", 0);
        f13999a = i1h0Var;
        i1h0 i1h0Var2 = new i1h0("MainContent", 1);
        b = i1h0Var2;
        i1h0 i1h0Var3 = new i1h0("Snackbar", 2);
        c = i1h0Var3;
        i1h0 i1h0Var4 = new i1h0("Fab", 3);
        d = i1h0Var4;
        i1h0 i1h0Var5 = new i1h0("BottomBar", 4);
        e = i1h0Var5;
        f = new i1h0[]{i1h0Var, i1h0Var2, i1h0Var3, i1h0Var4, i1h0Var5};
    }

    public static i1h0 valueOf(String str) {
        return (i1h0) Enum.valueOf(i1h0.class, str);
    }

    public static i1h0[] values() {
        return (i1h0[]) f.clone();
    }
}
