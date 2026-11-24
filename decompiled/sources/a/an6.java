package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class an6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kl5 f1135a;
    public static final an6 b;
    public static final an6 c;
    public static final an6 d;
    public static final an6 e;
    public static final an6 f;
    public static final an6 g;
    public static final /* synthetic */ an6[] h;

    static {
        an6 an6Var = new an6("ENG", 0);
        b = an6Var;
        an6 an6Var2 = new an6("US", 1);
        c = an6Var2;
        an6 an6Var3 = new an6("HONG", 2);
        d = an6Var3;
        an6 an6Var4 = new an6("IND", 3);
        e = an6Var4;
        an6 an6Var5 = new an6("MAL", 4);
        f = an6Var5;
        an6 an6Var6 = new an6("DEC", 5);
        g = an6Var6;
        h = new an6[]{an6Var, an6Var2, an6Var3, an6Var4, an6Var5, an6Var6};
        f1135a = new kl5();
    }

    public static an6 valueOf(String str) {
        return (an6) Enum.valueOf(an6.class, str);
    }

    public static an6[] values() {
        return (an6[]) h.clone();
    }
}
