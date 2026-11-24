package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1h0 f12283a;
    public static final h1h0 b;
    public static final h1h0 c;
    public static final h1h0 d;
    public static final h1h0 e;
    public static final h1h0 f;
    public static final h1h0 g;
    public static final /* synthetic */ h1h0[] h;

    static {
        h1h0 h1h0Var = new h1h0("NavBar", 0);
        f12283a = h1h0Var;
        h1h0 h1h0Var2 = new h1h0("TopBarBackground", 1);
        b = h1h0Var2;
        h1h0 h1h0Var3 = new h1h0("TopBarBanner", 2);
        c = h1h0Var3;
        h1h0 h1h0Var4 = new h1h0("TopBar", 3);
        d = h1h0Var4;
        h1h0 h1h0Var5 = new h1h0("TopBarColorOverlay", 4);
        e = h1h0Var5;
        h1h0 h1h0Var6 = new h1h0("MainContent", 5);
        f = h1h0Var6;
        h1h0 h1h0Var7 = new h1h0("BottomBar", 6);
        g = h1h0Var7;
        h = new h1h0[]{h1h0Var, h1h0Var2, h1h0Var3, h1h0Var4, h1h0Var5, h1h0Var6, h1h0Var7};
    }

    public static h1h0 valueOf(String str) {
        return (h1h0) Enum.valueOf(h1h0.class, str);
    }

    public static h1h0[] values() {
        return (h1h0[]) h.clone();
    }
}
