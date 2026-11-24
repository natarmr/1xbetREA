package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nt2 f24075a;
    public static final nt2 b;
    public static final /* synthetic */ nt2[] c;

    static {
        nt2 nt2Var = new nt2("COLLAPSED", 0);
        f24075a = nt2Var;
        nt2 nt2Var2 = new nt2("EXPANDED", 1);
        b = nt2Var2;
        c = new nt2[]{nt2Var, nt2Var2};
    }

    public static nt2 valueOf(String str) {
        return (nt2) Enum.valueOf(nt2.class, str);
    }

    public static nt2[] values() {
        return (nt2[]) c.clone();
    }
}
