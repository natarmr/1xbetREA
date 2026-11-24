package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mr1 f22247a;
    public static final mr1 b;
    public static final mr1 c;
    public static final mr1 d;
    public static final mr1 e;
    public static final mr1 f;
    public static final /* synthetic */ mr1[] g;

    static {
        mr1 mr1Var = new mr1("PROMO", 0);
        f22247a = mr1Var;
        mr1 mr1Var2 = new mr1("FAVORITES", 1);
        b = mr1Var2;
        mr1 mr1Var3 = new mr1("PROVIDERS", 2);
        c = mr1Var3;
        mr1 mr1Var4 = new mr1("MY_AGGREGATOR", 3);
        d = mr1Var4;
        mr1 mr1Var5 = new mr1("VIRTUAL", 4);
        mr1 mr1Var6 = new mr1("CATEGORIES", 5);
        e = mr1Var6;
        mr1 mr1Var7 = new mr1("NONE", 6);
        f = mr1Var7;
        g = new mr1[]{mr1Var, mr1Var2, mr1Var3, mr1Var4, mr1Var5, mr1Var6, mr1Var7};
    }

    public static mr1 valueOf(String str) {
        return (mr1) Enum.valueOf(mr1.class, str);
    }

    public static mr1[] values() {
        return (mr1[]) g.clone();
    }
}
