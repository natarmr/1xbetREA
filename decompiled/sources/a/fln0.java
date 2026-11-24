package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fln0 f9747a;
    public static final fln0 b;
    public static final fln0 c;
    public static final /* synthetic */ fln0[] d;

    static {
        fln0 fln0Var = new fln0("WITHOUT_FEATURE_COMBO", 0);
        f9747a = fln0Var;
        fln0 fln0Var2 = new fln0("WITH_FEATURE_COMBO", 1);
        b = fln0Var2;
        fln0 fln0Var3 = new fln0("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        c = fln0Var3;
        d = new fln0[]{fln0Var, fln0Var2, fln0Var3};
    }

    public static fln0 valueOf(String str) {
        return (fln0) Enum.valueOf(fln0.class, str);
    }

    public static fln0[] values() {
        return (fln0[]) d.clone();
    }
}
