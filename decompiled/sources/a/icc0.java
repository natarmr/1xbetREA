package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class icc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final icc0 f14530a;
    public static final icc0 b;
    public static final icc0 c;
    public static final /* synthetic */ icc0[] d;

    static {
        icc0 icc0Var = new icc0("RATING", 0);
        f14530a = icc0Var;
        icc0 icc0Var2 = new icc0("RANDOM", 1);
        b = icc0Var2;
        icc0 icc0Var3 = new icc0("UNDEFINED", 2);
        c = icc0Var3;
        d = new icc0[]{icc0Var, icc0Var2, icc0Var3};
    }

    public static icc0 valueOf(String str) {
        return (icc0) Enum.valueOf(icc0.class, str);
    }

    public static icc0[] values() {
        return (icc0[]) d.clone();
    }
}
