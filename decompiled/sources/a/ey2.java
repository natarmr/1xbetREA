package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ey2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ey2 f8605a;
    public static final ey2 b;
    public static final /* synthetic */ ey2[] c;

    static {
        ey2 ey2Var = new ey2("SHOW_ORIGINAL", 0);
        f8605a = ey2Var;
        ey2 ey2Var2 = new ey2("SHOW_TRANSLATED", 1);
        b = ey2Var2;
        c = new ey2[]{ey2Var, ey2Var2};
    }

    public static ey2 valueOf(String str) {
        return (ey2) Enum.valueOf(ey2.class, str);
    }

    public static ey2[] values() {
        return (ey2[]) c.clone();
    }
}
