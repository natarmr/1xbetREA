package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pno0 f27299a;
    public static final pno0 b;
    public static final /* synthetic */ pno0[] c;

    static {
        pno0 pno0Var = new pno0("NO_MARGIN", 0);
        f27299a = pno0Var;
        pno0 pno0Var2 = new pno0("EXTRA_TOP", 1);
        b = pno0Var2;
        c = new pno0[]{pno0Var, pno0Var2};
    }

    public static pno0 valueOf(String str) {
        return (pno0) Enum.valueOf(pno0.class, str);
    }

    public static pno0[] values() {
        return (pno0[]) c.clone();
    }
}
