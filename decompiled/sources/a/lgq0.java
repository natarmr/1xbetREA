package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lgq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lgq0 f20020a;
    public static final lgq0 b;
    public static final lgq0 c;
    public static final lgq0 d;
    public static final lgq0 e;
    public static final lgq0 f;
    public static final /* synthetic */ lgq0[] g;

    static {
        lgq0 lgq0Var = new lgq0("CELL_ONE", 0);
        f20020a = lgq0Var;
        lgq0 lgq0Var2 = new lgq0("CELL_TWO", 1);
        b = lgq0Var2;
        lgq0 lgq0Var3 = new lgq0("CELL_THREE", 2);
        c = lgq0Var3;
        lgq0 lgq0Var4 = new lgq0("CELL_FOUR", 3);
        d = lgq0Var4;
        lgq0 lgq0Var5 = new lgq0("CELL_FIVE", 4);
        e = lgq0Var5;
        lgq0 lgq0Var6 = new lgq0("CELL_SIX", 5);
        f = lgq0Var6;
        g = new lgq0[]{lgq0Var, lgq0Var2, lgq0Var3, lgq0Var4, lgq0Var5, lgq0Var6};
    }

    public static lgq0 valueOf(String str) {
        return (lgq0) Enum.valueOf(lgq0.class, str);
    }

    public static lgq0[] values() {
        return (lgq0[]) g.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        t9f.b();
                        return 0;
                    }
                }
            }
        }
        return i;
    }
}
