package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class src0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xi70 f32669a;
    public static final src0 b;
    public static final src0 c;
    public static final src0 d;
    public static final src0 e;
    public static final src0 f;
    public static final /* synthetic */ src0[] g;

    static {
        src0 src0Var = new src0("BET", 0);
        b = src0Var;
        src0 src0Var2 = new src0("SPORT", 1);
        c = src0Var2;
        src0 src0Var3 = new src0("GAME", 2);
        d = src0Var3;
        src0 src0Var4 = new src0("CYBER", 3);
        e = src0Var4;
        src0 src0Var5 = new src0("AGGREGATOR", 4);
        f = src0Var5;
        g = new src0[]{src0Var, src0Var2, src0Var3, src0Var4, src0Var5};
        f32669a = new xi70();
    }

    public static src0 valueOf(String str) {
        return (src0) Enum.valueOf(src0.class, str);
    }

    public static src0[] values() {
        return (src0[]) g.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "promo_bets";
        }
        if (iOrdinal == 1) {
            return "promo_sport";
        }
        if (iOrdinal == 2) {
            return "promo_games";
        }
        if (iOrdinal == 3) {
            return "promo_cyber";
        }
        if (iOrdinal == 4) {
            return "promo_aggregator";
        }
        t9f.b();
        return null;
    }

    public final long getId() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 0L;
        }
        if (iOrdinal == 1) {
            return 1L;
        }
        if (iOrdinal == 2) {
            return 2L;
        }
        if (iOrdinal == 3) {
            return 3L;
        }
        if (iOrdinal == 4) {
            return 4L;
        }
        t9f.b();
        return 0L;
    }
}
