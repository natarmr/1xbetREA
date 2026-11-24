package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cgg0 f4312a;
    public static final cgg0 b;
    public static final cgg0 c;
    public static final cgg0 d;
    public static final cgg0 e;
    public static final cgg0 f;
    public static final /* synthetic */ cgg0[] g;

    static {
        cgg0 cgg0Var = new cgg0("ATTACK", 0);
        f4312a = cgg0Var;
        cgg0 cgg0Var2 = new cgg0("KILL", 1);
        b = cgg0Var2;
        cgg0 cgg0Var3 = new cgg0("GOAL", 2);
        c = cgg0Var3;
        cgg0 cgg0Var4 = new cgg0("DEFEND", 3);
        d = cgg0Var4;
        cgg0 cgg0Var5 = new cgg0("TIME", 4);
        e = cgg0Var5;
        cgg0 cgg0Var6 = new cgg0("SWAP", 5);
        f = cgg0Var6;
        g = new cgg0[]{cgg0Var, cgg0Var2, cgg0Var3, cgg0Var4, cgg0Var5, cgg0Var6};
    }

    public static cgg0 valueOf(String str) {
        return (cgg0) Enum.valueOf(cgg0.class, str);
    }

    public static cgg0[] values() {
        return (cgg0[]) g.clone();
    }
}
