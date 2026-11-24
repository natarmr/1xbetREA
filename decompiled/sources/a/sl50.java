package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sl50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sl50 f32381a;
    public static final sl50 b;
    public static final sl50 c;
    public static final sl50 d;
    public static final sl50 e;
    public static final sl50 f;
    public static final /* synthetic */ sl50[] g;

    static {
        sl50 sl50Var = new sl50("NOT_REQUIRED", 0);
        f32381a = sl50Var;
        sl50 sl50Var2 = new sl50("CONNECTED", 1);
        b = sl50Var2;
        sl50 sl50Var3 = new sl50("UNMETERED", 2);
        c = sl50Var3;
        sl50 sl50Var4 = new sl50("NOT_ROAMING", 3);
        d = sl50Var4;
        sl50 sl50Var5 = new sl50("METERED", 4);
        e = sl50Var5;
        sl50 sl50Var6 = new sl50("TEMPORARILY_UNMETERED", 5);
        f = sl50Var6;
        g = new sl50[]{sl50Var, sl50Var2, sl50Var3, sl50Var4, sl50Var5, sl50Var6};
    }

    public static sl50 valueOf(String str) {
        return (sl50) Enum.valueOf(sl50.class, str);
    }

    public static sl50[] values() {
        return (sl50[]) g.clone();
    }
}
