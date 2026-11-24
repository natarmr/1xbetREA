package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vsf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vsf0 f37948a;
    public static final vsf0 b;
    public static final vsf0 c;
    public static final /* synthetic */ vsf0[] d;

    static {
        vsf0 vsf0Var = new vsf0("NO_CHOICE", 0);
        f37948a = vsf0Var;
        vsf0 vsf0Var2 = new vsf0("RESOLVED", 1);
        b = vsf0Var2;
        vsf0 vsf0Var3 = new vsf0("NOT_RESOLVED", 2);
        c = vsf0Var3;
        d = new vsf0[]{vsf0Var, vsf0Var2, vsf0Var3};
    }

    public static vsf0 valueOf(String str) {
        return (vsf0) Enum.valueOf(vsf0.class, str);
    }

    public static vsf0[] values() {
        return (vsf0[]) d.clone();
    }
}
