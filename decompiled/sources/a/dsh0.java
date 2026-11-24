package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dsh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dsh0 f6610a;
    public static final dsh0 b;
    public static final dsh0 c;
    public static final dsh0 d;
    public static final dsh0 e;
    public static final dsh0 f;
    public static final /* synthetic */ dsh0[] g;

    static {
        dsh0 dsh0Var = new dsh0("LEVEL_PHONE", 0);
        f6610a = dsh0Var;
        dsh0 dsh0Var2 = new dsh0("LEVEL_PASSWORD", 1);
        b = dsh0Var2;
        dsh0 dsh0Var3 = new dsh0("LEVEL_QUESTION", 2);
        c = dsh0Var3;
        dsh0 dsh0Var4 = new dsh0("LEVEL_TWO_FACTOR", 3);
        d = dsh0Var4;
        dsh0 dsh0Var5 = new dsh0("LEVEL_PERSONAL_DATA", 4);
        e = dsh0Var5;
        dsh0 dsh0Var6 = new dsh0("LEVEL_EMAIL_LOGIN", 5);
        f = dsh0Var6;
        g = new dsh0[]{dsh0Var, dsh0Var2, dsh0Var3, dsh0Var4, dsh0Var5, dsh0Var6};
    }

    public static dsh0 valueOf(String str) {
        return (dsh0) Enum.valueOf(dsh0.class, str);
    }

    public static dsh0[] values() {
        return (dsh0[]) g.clone();
    }
}
