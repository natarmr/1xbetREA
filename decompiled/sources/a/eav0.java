package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class eav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eav0 f7489a;
    public static final eav0 b;
    public static final eav0 c;
    public static final eav0 d;
    public static final eav0 e;
    public static final eav0 f;
    public static final eav0 g;
    public static final /* synthetic */ eav0[] h;

    static {
        eav0 eav0Var = new eav0("DATE_YEAR", 0);
        f7489a = eav0Var;
        eav0 eav0Var2 = new eav0("DATE_MONTH", 1);
        b = eav0Var2;
        eav0 eav0Var3 = new eav0("DATE_DAY", 2);
        c = eav0Var3;
        eav0 eav0Var4 = new eav0("TIME_HOUR", 3);
        d = eav0Var4;
        eav0 eav0Var5 = new eav0("TIME_MINUTE", 4);
        e = eav0Var5;
        eav0 eav0Var6 = new eav0("TIME_AMPM", 5);
        f = eav0Var6;
        eav0 eav0Var7 = new eav0("CUSTOM", 6);
        g = eav0Var7;
        h = new eav0[]{eav0Var, eav0Var2, eav0Var3, eav0Var4, eav0Var5, eav0Var6, eav0Var7};
    }

    public static eav0 valueOf(String str) {
        return (eav0) Enum.valueOf(eav0.class, str);
    }

    public static eav0[] values() {
        return (eav0[]) h.clone();
    }
}
