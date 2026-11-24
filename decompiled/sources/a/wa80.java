package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wa80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jh70 f38814a;
    public static final wa80 b;
    public static final wa80 c;
    public static final wa80 d;
    public static final wa80 e;
    public static final wa80 f;
    public static final /* synthetic */ wa80[] g;

    static {
        wa80 wa80Var = new wa80("OS_UNKNOWN", 0);
        b = wa80Var;
        wa80 wa80Var2 = new wa80("OS_WINDOWS", 1);
        c = wa80Var2;
        wa80 wa80Var3 = new wa80("OS_MAC", 2);
        d = wa80Var3;
        wa80 wa80Var4 = new wa80("OS_ANDROID", 3);
        e = wa80Var4;
        wa80 wa80Var5 = new wa80("OS_IOS", 4);
        f = wa80Var5;
        g = new wa80[]{wa80Var, wa80Var2, wa80Var3, wa80Var4, wa80Var5};
        f38814a = new jh70();
    }

    public static wa80 valueOf(String str) {
        return (wa80) Enum.valueOf(wa80.class, str);
    }

    public static wa80[] values() {
        return (wa80[]) g.clone();
    }
}
