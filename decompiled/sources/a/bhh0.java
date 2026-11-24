package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bhh0 f2606a;
    public static final bhh0 b;
    public static final bhh0 c;
    public static final /* synthetic */ bhh0[] d;

    static {
        bhh0 bhh0Var = new bhh0("SPORT", 0);
        f2606a = bhh0Var;
        bhh0 bhh0Var2 = new bhh0("ONE_X_GAMES", 1);
        bhh0 bhh0Var3 = new bhh0("AGGREGATOR_GAMES", 2);
        bhh0 bhh0Var4 = new bhh0("COUPON_SEARCH", 3);
        b = bhh0Var4;
        bhh0 bhh0Var5 = new bhh0("FAVORITES_TEAM", 4);
        c = bhh0Var5;
        d = new bhh0[]{bhh0Var, bhh0Var2, bhh0Var3, bhh0Var4, bhh0Var5, new bhh0("AGGREGATOR_BRANDS", 5)};
    }

    public static bhh0 valueOf(String str) {
        return (bhh0) Enum.valueOf(bhh0.class, str);
    }

    public static bhh0[] values() {
        return (bhh0[]) d.clone();
    }
}
