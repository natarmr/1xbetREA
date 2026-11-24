package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ic50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ic50 f14520a;
    public static final ic50 b;
    public static final ic50 c;
    public static final /* synthetic */ ic50[] d;

    static {
        ic50 ic50Var = new ic50("STATIC", 0);
        f14520a = ic50Var;
        ic50 ic50Var2 = new ic50("ACTIVE", 1);
        b = ic50Var2;
        ic50 ic50Var3 = new ic50("INACTIVE", 2);
        c = ic50Var3;
        d = new ic50[]{ic50Var, ic50Var2, ic50Var3};
    }

    public static ic50 valueOf(String str) {
        return (ic50) Enum.valueOf(ic50.class, str);
    }

    public static ic50[] values() {
        return (ic50[]) d.clone();
    }
}
