package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cys0 f5194a;
    public static final cys0 b;
    public static final cys0 c;
    public static final cys0 d;
    public static final cys0 e;
    public static final cys0 f;
    public static final cys0 g;
    public static final /* synthetic */ cys0[] h;

    static {
        cys0 cys0Var = new cys0("SINGLE_GAME", 0);
        f5194a = cys0Var;
        cys0 cys0Var2 = new cys0("MULTI_GAME", 1);
        b = cys0Var2;
        cys0 cys0Var3 = new cys0("MULTI_PLAYER_GAME", 2);
        c = cys0Var3;
        cys0 cys0Var4 = new cys0("CRICKET_GAME", 3);
        d = cys0Var4;
        cys0 cys0Var5 = new cys0("TENNIS_GAME", 4);
        e = cys0Var5;
        cys0 cys0Var6 = new cys0("ONE_OPPONENT_LOGO", 5);
        f = cys0Var6;
        cys0 cys0Var7 = new cys0("EMPTY", 6);
        g = cys0Var7;
        h = new cys0[]{cys0Var, cys0Var2, cys0Var3, cys0Var4, cys0Var5, cys0Var6, cys0Var7};
    }

    public static cys0 valueOf(String str) {
        return (cys0) Enum.valueOf(cys0.class, str);
    }

    public static cys0[] values() {
        return (cys0[]) h.clone();
    }
}
