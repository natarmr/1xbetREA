package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w9p0 f38791a;
    public static final w9p0 b;
    public static final w9p0 c;
    public static final w9p0 d;
    public static final w9p0 e;
    public static final w9p0 f;
    public static final /* synthetic */ w9p0[] g;

    static {
        w9p0 w9p0Var = new w9p0("UNDEFINED", 0);
        f38791a = w9p0Var;
        w9p0 w9p0Var2 = new w9p0("EASY", 1);
        b = w9p0Var2;
        w9p0 w9p0Var3 = new w9p0("MIDDLE", 2);
        c = w9p0Var3;
        w9p0 w9p0Var4 = new w9p0("HARD", 3);
        d = w9p0Var4;
        w9p0 w9p0Var5 = new w9p0("SUPPORT", 4);
        e = w9p0Var5;
        w9p0 w9p0Var6 = new w9p0("FULL_SUPPORT", 5);
        f = w9p0Var6;
        g = new w9p0[]{w9p0Var, w9p0Var2, w9p0Var3, w9p0Var4, w9p0Var5, w9p0Var6};
    }

    public static w9p0 valueOf(String str) {
        return (w9p0) Enum.valueOf(w9p0.class, str);
    }

    public static w9p0[] values() {
        return (w9p0[]) g.clone();
    }
}
