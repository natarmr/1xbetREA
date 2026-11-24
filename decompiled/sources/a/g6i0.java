package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g6i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g6i0 f10767a;
    public static final g6i0 b;
    public static final g6i0 c;
    public static final g6i0 d;
    public static final g6i0 e;
    public static final g6i0 f;
    public static final g6i0 g;
    public static final g6i0 h;
    public static final g6i0 i;
    public static final /* synthetic */ g6i0[] j;
    public static final /* synthetic */ c0o k;

    static {
        g6i0 g6i0Var = new g6i0("GROUP_SELECTOR", 0);
        f10767a = g6i0Var;
        g6i0 g6i0Var2 = new g6i0("SEASON_SELECTOR", 1);
        b = g6i0Var2;
        g6i0 g6i0Var3 = new g6i0("DATE_SELECTOR", 2);
        c = g6i0Var3;
        g6i0 g6i0Var4 = new g6i0("DISCIPLINE_SELECTOR", 3);
        d = g6i0Var4;
        g6i0 g6i0Var5 = new g6i0("AGE_SELECTOR", 4);
        e = g6i0Var5;
        g6i0 g6i0Var6 = new g6i0("TOURNAMENT_TYPE_SELECTOR", 5);
        f = g6i0Var6;
        g6i0 g6i0Var7 = new g6i0("TOURNAMENT_SELECTOR", 6);
        g = g6i0Var7;
        g6i0 g6i0Var8 = new g6i0("COMPETITOR_TYPE_SELECTOR", 7);
        h = g6i0Var8;
        g6i0 g6i0Var9 = new g6i0("NOT_SET", 8);
        i = g6i0Var9;
        g6i0[] g6i0VarArr = {g6i0Var, g6i0Var2, g6i0Var3, g6i0Var4, g6i0Var5, g6i0Var6, g6i0Var7, g6i0Var8, g6i0Var9};
        j = g6i0VarArr;
        k = new c0o(g6i0VarArr);
    }

    public static g6i0 valueOf(String str) {
        return (g6i0) Enum.valueOf(g6i0.class, str);
    }

    public static g6i0[] values() {
        return (g6i0[]) j.clone();
    }
}
