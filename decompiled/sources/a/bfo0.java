package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bfo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfo0 f2512a;
    public static final bfo0 b;
    public static final bfo0 c;
    public static final bfo0 d;
    public static final /* synthetic */ bfo0[] e;

    static {
        bfo0 bfo0Var = new bfo0("SPORT", 0);
        f2512a = bfo0Var;
        bfo0 bfo0Var2 = new bfo0("ONE_X_GAMES", 1);
        b = bfo0Var2;
        bfo0 bfo0Var3 = new bfo0("AGGREGATOR_GAMES", 2);
        c = bfo0Var3;
        bfo0 bfo0Var4 = new bfo0("COUPON_SEARCH", 3);
        bfo0 bfo0Var5 = new bfo0("AGGREGATOR_BRANDS", 4);
        d = bfo0Var5;
        e = new bfo0[]{bfo0Var, bfo0Var2, bfo0Var3, bfo0Var4, bfo0Var5};
    }

    public static bfo0 valueOf(String str) {
        return (bfo0) Enum.valueOf(bfo0.class, str);
    }

    public static bfo0[] values() {
        return (bfo0[]) e.clone();
    }
}
