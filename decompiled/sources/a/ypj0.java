package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ypj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ypj0 f43033a;
    public static final ypj0 b;
    public static final ypj0 c;
    public static final /* synthetic */ ypj0[] d;

    static {
        ypj0 ypj0Var = new ypj0("Hidden", 0);
        f43033a = ypj0Var;
        ypj0 ypj0Var2 = new ypj0("Expanded", 1);
        b = ypj0Var2;
        ypj0 ypj0Var3 = new ypj0("PartiallyExpanded", 2);
        c = ypj0Var3;
        d = new ypj0[]{ypj0Var, ypj0Var2, ypj0Var3};
    }

    public static ypj0 valueOf(String str) {
        return (ypj0) Enum.valueOf(ypj0.class, str);
    }

    public static ypj0[] values() {
        return (ypj0[]) d.clone();
    }
}
