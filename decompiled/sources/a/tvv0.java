package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class tvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tvv0 f34622a;
    public static final tvv0 b;
    public static final tvv0 c;
    public static final tvv0 d;
    public static final tvv0 e;
    public static final tvv0 f;
    public static final tvv0 g;
    public static final /* synthetic */ tvv0[] h;

    static {
        tvv0 tvv0Var = new tvv0("RECTS", 0);
        f34622a = tvv0Var;
        tvv0 tvv0Var2 = new tvv0("USER", 1);
        b = tvv0Var2;
        tvv0 tvv0Var3 = new tvv0("COUNT", 2);
        c = tvv0Var3;
        tvv0 tvv0Var4 = new tvv0("FIRST", 3);
        d = tvv0Var4;
        tvv0 tvv0Var5 = new tvv0("TALL", 4);
        e = tvv0Var5;
        tvv0 tvv0Var6 = new tvv0("CLAMPED", 5);
        f = tvv0Var6;
        tvv0 tvv0Var7 = new tvv0("FITTED", 6);
        g = tvv0Var7;
        h = new tvv0[]{tvv0Var, tvv0Var2, tvv0Var3, tvv0Var4, tvv0Var5, tvv0Var6, tvv0Var7};
    }

    public static tvv0 valueOf(String str) {
        return (tvv0) Enum.valueOf(tvv0.class, str);
    }

    public static tvv0[] values() {
        return (tvv0[]) h.clone();
    }
}
