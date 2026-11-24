package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class aib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aib0 f916a;
    public static final aib0 b;
    public static final aib0 c;
    public static final aib0 d;
    public static final /* synthetic */ aib0[] e;

    static {
        aib0 aib0Var = new aib0("PERSONALIZATION", 0);
        f916a = aib0Var;
        aib0 aib0Var2 = new aib0("SPORTS", 1);
        b = aib0Var2;
        aib0 aib0Var3 = new aib0("BANNERS", 2);
        c = aib0Var3;
        aib0 aib0Var4 = new aib0("ONE_X_GAMES", 3);
        d = aib0Var4;
        e = new aib0[]{aib0Var, aib0Var2, aib0Var3, aib0Var4};
    }

    public static aib0 valueOf(String str) {
        return (aib0) Enum.valueOf(aib0.class, str);
    }

    public static aib0[] values() {
        return (aib0[]) e.clone();
    }
}
