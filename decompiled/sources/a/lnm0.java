package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2m0 f20353a;
    public static final lnm0 b;
    public static final lnm0 c;
    public static final lnm0 d;
    public static final lnm0 e;
    public static final lnm0 f;
    public static final /* synthetic */ lnm0[] g;

    static {
        lnm0 lnm0Var = new lnm0("UNDEFINED", 0);
        b = lnm0Var;
        lnm0 lnm0Var2 = new lnm0("ACTIVE", 1);
        c = lnm0Var2;
        lnm0 lnm0Var3 = new lnm0("WIN", 2);
        d = lnm0Var3;
        lnm0 lnm0Var4 = new lnm0("LOSE", 3);
        e = lnm0Var4;
        lnm0 lnm0Var5 = new lnm0("DRAW", 4);
        f = lnm0Var5;
        g = new lnm0[]{lnm0Var, lnm0Var2, lnm0Var3, lnm0Var4, lnm0Var5};
        f20353a = new y2m0((byte) 2);
    }

    public static lnm0 valueOf(String str) {
        return (lnm0) Enum.valueOf(lnm0.class, str);
    }

    public static lnm0[] values() {
        return (lnm0[]) g.clone();
    }
}
