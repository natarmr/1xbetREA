package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ugs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2m0 f35640a;
    public static final ugs0 b;
    public static final ugs0 c;
    public static final ugs0 d;
    public static final ugs0 e;
    public static final ugs0 f;
    public static final /* synthetic */ ugs0[] g;

    static {
        ugs0 ugs0Var = new ugs0("UNDEFINED", 0);
        b = ugs0Var;
        ugs0 ugs0Var2 = new ugs0("UPWARD", 1);
        c = ugs0Var2;
        ugs0 ugs0Var3 = new ugs0("DOWNWARD", 2);
        d = ugs0Var3;
        ugs0 ugs0Var4 = new ugs0("PROVISIONAL", 3);
        e = ugs0Var4;
        ugs0 ugs0Var5 = new ugs0("CLOSED", 4);
        f = ugs0Var5;
        g = new ugs0[]{ugs0Var, ugs0Var2, ugs0Var3, ugs0Var4, ugs0Var5};
        f35640a = new s2m0();
    }

    public static ugs0 valueOf(String str) {
        return (ugs0) Enum.valueOf(ugs0.class, str);
    }

    public static ugs0[] values() {
        return (ugs0[]) g.clone();
    }
}
