package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e650 implements g650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e650 f7265a;
    public static final e650 b;
    public static final e650 c;
    public static final e650 d;
    public static final e650 e;
    public static final e650 f;
    public static final e650 g;
    public static final e650 h;
    public static final e650 i;
    public static final e650 j;
    public static final e650 k;
    public static final e650 l;
    public static final e650 m;
    public static final /* synthetic */ e650[] n;
    public static final /* synthetic */ c0o o;

    static {
        e650 e650Var = new e650("CHANGE_ACCOUNT", 0);
        f7265a = e650Var;
        e650 e650Var2 = new e650("OPEN_PAYMENT", 1);
        b = e650Var2;
        e650 e650Var3 = new e650("OPEN_BANNER", 2);
        e650 e650Var4 = new e650("OPEN_ALL", 3);
        c = e650Var4;
        e650 e650Var5 = new e650("OPEN_LOGIN", 4);
        d = e650Var5;
        e650 e650Var6 = new e650("OPEN_REGISTRATION", 5);
        e = e650Var6;
        e650 e650Var7 = new e650("OPEN_GAME", 6);
        f = e650Var7;
        e650 e650Var8 = new e650("OPEN_JACKPOT", 7);
        e650 e650Var9 = new e650("OPEN_TOURNAMENT", 8);
        g = e650Var9;
        e650 e650Var10 = new e650("DAILY_TASK_ACTION", 9);
        h = e650Var10;
        e650 e650Var11 = new e650("DAILY_TASKS", 10);
        i = e650Var11;
        e650 e650Var12 = new e650("OPEN_SEARCH", 11);
        j = e650Var12;
        e650 e650Var13 = new e650("OPEN_LOYALTY_PROGRAM", 12);
        k = e650Var13;
        e650 e650Var14 = new e650("OPEN_PROMO", 13);
        l = e650Var14;
        e650 e650Var15 = new e650("EXIT", 14);
        m = e650Var15;
        e650[] e650VarArr = {e650Var, e650Var2, e650Var3, e650Var4, e650Var5, e650Var6, e650Var7, e650Var8, e650Var9, e650Var10, e650Var11, e650Var12, e650Var13, e650Var14, e650Var15};
        n = e650VarArr;
        o = new c0o(e650VarArr);
    }

    public static e650 valueOf(String str) {
        return (e650) Enum.valueOf(e650.class, str);
    }

    public static e650[] values() {
        return (e650[]) n.clone();
    }
}
