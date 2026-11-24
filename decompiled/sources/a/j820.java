package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j820 f16066a;
    public static final j820 b;
    public static final j820 c;
    public static final j820 d;
    public static final j820 e;
    public static final /* synthetic */ j820[] f;

    static {
        j820 j820Var = new j820("MAIN", 0);
        f16066a = j820Var;
        j820 j820Var2 = new j820("COUPON", 1);
        b = j820Var2;
        j820 j820Var3 = new j820("TOTO", 2);
        c = j820Var3;
        j820 j820Var4 = new j820("TOTO_JACKPOT", 3);
        j820 j820Var5 = new j820("FIN_BET", 4);
        d = j820Var5;
        j820 j820Var6 = new j820("BET_CONSTRUCTOR", 5);
        e = j820Var6;
        f = new j820[]{j820Var, j820Var2, j820Var3, j820Var4, j820Var5, j820Var6};
    }

    public static j820 valueOf(String str) {
        return (j820) Enum.valueOf(j820.class, str);
    }

    public static j820[] values() {
        return (j820[]) f.clone();
    }
}
