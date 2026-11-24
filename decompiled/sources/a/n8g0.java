package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zie0 f23086a;
    public static final n8g0 b;
    public static final n8g0 c;
    public static final n8g0 d;
    public static final /* synthetic */ n8g0[] e;

    static {
        n8g0 n8g0Var = new n8g0("NONE", 0);
        b = n8g0Var;
        n8g0 n8g0Var2 = new n8g0("FIRST", 1);
        c = n8g0Var2;
        n8g0 n8g0Var3 = new n8g0("SECOND", 2);
        d = n8g0Var3;
        e = new n8g0[]{n8g0Var, n8g0Var2, n8g0Var3};
        f23086a = new zie0();
    }

    public static n8g0 valueOf(String str) {
        return (n8g0) Enum.valueOf(n8g0.class, str);
    }

    public static n8g0[] values() {
        return (n8g0[]) e.clone();
    }
}
