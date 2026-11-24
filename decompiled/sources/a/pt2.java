package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pt2 f27542a;
    public static final pt2 b;
    public static final pt2 c;
    public static final /* synthetic */ pt2[] d;

    static {
        pt2 pt2Var = new pt2("HIDDEN", 0);
        f27542a = pt2Var;
        pt2 pt2Var2 = new pt2("HALF_EXPANDED", 1);
        b = pt2Var2;
        pt2 pt2Var3 = new pt2("EXPANDED", 2);
        c = pt2Var3;
        d = new pt2[]{pt2Var, pt2Var2, pt2Var3};
    }

    public static pt2 valueOf(String str) {
        return (pt2) Enum.valueOf(pt2.class, str);
    }

    public static pt2[] values() {
        return (pt2[]) d.clone();
    }
}
