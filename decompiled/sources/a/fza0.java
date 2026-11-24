package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fl70 f10399a;
    public static final fza0 b;
    public static final fza0 c;
    public static final fza0 d;
    public static final fza0 e;
    public static final fza0 f;
    public static final /* synthetic */ fza0[] g;

    static {
        fza0 fza0Var = new fza0("ONE_X_LIVE_AGGREGATOR", 0);
        b = fza0Var;
        fza0 fza0Var2 = new fza0("LIVE_AGGREGATOR", 1);
        fza0 fza0Var3 = new fza0("SLOTS", 2);
        fza0 fza0Var4 = new fza0("NONE", 3);
        c = fza0Var4;
        fza0 fza0Var5 = new fza0("POPULAR", 4);
        fza0 fza0Var6 = new fza0("SLOTS_POPULAR", 5);
        d = fza0Var6;
        fza0 fza0Var7 = new fza0("LIVE_AGGREGATOR_POPULAR", 6);
        e = fza0Var7;
        fza0 fza0Var8 = new fza0("TOP_CHOICE", 7);
        fza0 fza0Var9 = new fza0("NEW_SLOTS", 8);
        fza0 fza0Var10 = new fza0("EXCLUSIVE", 9);
        f = fza0Var10;
        g = new fza0[]{fza0Var, fza0Var2, fza0Var3, fza0Var4, fza0Var5, fza0Var6, fza0Var7, fza0Var8, fza0Var9, fza0Var10, new fza0("RECOMMENDATION", 10)};
        f10399a = new fl70();
    }

    public static fza0 valueOf(String str) {
        return (fza0) Enum.valueOf(fza0.class, str);
    }

    public static fza0[] values() {
        return (fza0[]) g.clone();
    }

    public final long B() {
        switch (ordinal()) {
            case 0:
                return 75L;
            case 1:
            case 2:
            case 3:
                return 0L;
            case 4:
            case 5:
            case 6:
                return 17L;
            case 7:
                return 94L;
            case 8:
                return 21L;
            case 9:
                return 89L;
            case 10:
                return 0L;
            default:
                t9f.b();
                return 0L;
        }
    }
}
