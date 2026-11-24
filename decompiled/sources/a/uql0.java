package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uql0 f36125a;
    public static final uql0 b;
    public static final uql0 c;
    public static final uql0 d;
    public static final uql0 e;
    public static final /* synthetic */ uql0[] f;

    static {
        uql0 uql0Var = new uql0("RECTANGLE_S_WITH_HEADER", 0);
        f36125a = uql0Var;
        uql0 uql0Var2 = new uql0("CIRCLE_WITH_LABEL", 1);
        b = uql0Var2;
        uql0 uql0Var3 = new uql0("RECTANGLE_S", 2);
        c = uql0Var3;
        uql0 uql0Var4 = new uql0("RECTANGLE_M", 3);
        d = uql0Var4;
        uql0 uql0Var5 = new uql0("RECTANGLE_L", 4);
        e = uql0Var5;
        f = new uql0[]{uql0Var, uql0Var2, uql0Var3, uql0Var4, uql0Var5};
    }

    public static uql0 valueOf(String str) {
        return (uql0) Enum.valueOf(uql0.class, str);
    }

    public static uql0[] values() {
        return (uql0[]) f.clone();
    }
}
