package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pt0 f27539a;
    public static final pt0 b;
    public static final pt0 c;
    public static final pt0 d;
    public static final pt0 e;
    public static final /* synthetic */ pt0[] f;

    static {
        pt0 pt0Var = new pt0("BACKGROUND_L", 0);
        f27539a = pt0Var;
        pt0 pt0Var2 = new pt0("BACKGROUND_S", 1);
        b = pt0Var2;
        pt0 pt0Var3 = new pt0("GRADIENT", 2);
        c = pt0Var3;
        pt0 pt0Var4 = new pt0("TRANSPARENCY", 3);
        d = pt0Var4;
        pt0 pt0Var5 = new pt0("HORIZONTAL_BACKGROUND", 4);
        e = pt0Var5;
        f = new pt0[]{pt0Var, pt0Var2, pt0Var3, pt0Var4, pt0Var5};
    }

    public static pt0 valueOf(String str) {
        return (pt0) Enum.valueOf(pt0.class, str);
    }

    public static pt0[] values() {
        return (pt0[]) f.clone();
    }
}
