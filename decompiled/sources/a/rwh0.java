package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zie0 f31217a;
    public static final rwh0 b;
    public static final rwh0 c;
    public static final rwh0 d;
    public static final rwh0 e;
    public static final rwh0 f;
    public static final /* synthetic */ rwh0[] g;

    static {
        rwh0 rwh0Var = new rwh0("ANIMATE", 0);
        b = rwh0Var;
        rwh0 rwh0Var2 = new rwh0("PAUSE", 1);
        c = rwh0Var2;
        rwh0 rwh0Var3 = new rwh0("RESET", 2);
        d = rwh0Var3;
        rwh0 rwh0Var4 = new rwh0("FINISH", 3);
        e = rwh0Var4;
        rwh0 rwh0Var5 = new rwh0("CLEAR", 4);
        f = rwh0Var5;
        g = new rwh0[]{rwh0Var, rwh0Var2, rwh0Var3, rwh0Var4, rwh0Var5};
        f31217a = new zie0();
    }

    public static rwh0 valueOf(String str) {
        return (rwh0) Enum.valueOf(rwh0.class, str);
    }

    public static rwh0[] values() {
        return (rwh0[]) g.clone();
    }
}
