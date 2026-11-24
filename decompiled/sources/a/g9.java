package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g9 f10888a;
    public static final g9 b;
    public static final g9 c;
    public static final g9 d;
    public static final g9 e;
    public static final /* synthetic */ g9[] f;

    static {
        g9 g9Var = new g9("SECURITY_SETTINGS", 0);
        f10888a = g9Var;
        g9 g9Var2 = new g9("BETTING_SETTINGS", 1);
        b = g9Var2;
        g9 g9Var3 = new g9("APP_SETTINGS", 2);
        c = g9Var3;
        g9 g9Var4 = new g9("ADDITIONAL_SETTINGS", 3);
        d = g9Var4;
        g9 g9Var5 = new g9("B2B", 4);
        g9 g9Var6 = new g9("ABOUT_APP", 5);
        e = g9Var6;
        f = new g9[]{g9Var, g9Var2, g9Var3, g9Var4, g9Var5, g9Var6};
    }

    public static g9 valueOf(String str) {
        return (g9) Enum.valueOf(g9.class, str);
    }

    public static g9[] values() {
        return (g9[]) f.clone();
    }
}
