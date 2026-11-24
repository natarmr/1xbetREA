package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yi5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yi5 f42670a;
    public static final yi5 b;
    public static final yi5 c;
    public static final yi5 d;
    public static final yi5 e;
    public static final yi5 f;
    public static final /* synthetic */ yi5[] g;

    static {
        yi5 yi5Var = new yi5("VERIFICATION", 0);
        f42670a = yi5Var;
        yi5 yi5Var2 = new yi5("RESPONSIBLE_GAME", 1);
        b = yi5Var2;
        yi5 yi5Var3 = new yi5("PAYOUT_APPLICATION", 2);
        c = yi5Var3;
        yi5 yi5Var4 = new yi5("REWARD_SYSTEM", 3);
        d = yi5Var4;
        yi5 yi5Var5 = new yi5("PAYMENT_REQUESTS", 4);
        e = yi5Var5;
        yi5 yi5Var6 = new yi5("PAYMENT_ACCOUNT_NUMBER", 5);
        f = yi5Var6;
        g = new yi5[]{yi5Var, yi5Var2, yi5Var3, yi5Var4, yi5Var5, yi5Var6};
    }

    public static yi5 valueOf(String str) {
        return (yi5) Enum.valueOf(yi5.class, str);
    }

    public static yi5[] values() {
        return (yi5[]) g.clone();
    }
}
