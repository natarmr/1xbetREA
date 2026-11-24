package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nlb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nlb0 f23718a;
    public static final nlb0 b;
    public static final nlb0 c;
    public static final nlb0 d;
    public static final nlb0 e;
    public static final nlb0 f;
    public static final /* synthetic */ nlb0[] g;

    static {
        nlb0 nlb0Var = new nlb0("CHAMP_LIVE", 0);
        f23718a = nlb0Var;
        nlb0 nlb0Var2 = new nlb0("CHAMP_LINE", 1);
        b = nlb0Var2;
        nlb0 nlb0Var3 = new nlb0("POPULAR_LIVE", 2);
        c = nlb0Var3;
        nlb0 nlb0Var4 = new nlb0("POPULAR_LINE", 3);
        d = nlb0Var4;
        nlb0 nlb0Var5 = new nlb0("DAILY_EXPRESS_LIVE", 4);
        e = nlb0Var5;
        nlb0 nlb0Var6 = new nlb0("DAILY_EXPRESS_LINE", 5);
        f = nlb0Var6;
        g = new nlb0[]{nlb0Var, nlb0Var2, nlb0Var3, nlb0Var4, nlb0Var5, nlb0Var6};
    }

    public static nlb0 valueOf(String str) {
        return (nlb0) Enum.valueOf(nlb0.class, str);
    }

    public static nlb0[] values() {
        return (nlb0[]) g.clone();
    }
}
