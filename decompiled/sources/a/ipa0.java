package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ipa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ipa0 f15153a;
    public static final ipa0 b;
    public static final ipa0 c;
    public static final /* synthetic */ ipa0[] d;

    static {
        ipa0 ipa0Var = new ipa0("Unknown", 0);
        f15153a = ipa0Var;
        ipa0 ipa0Var2 = new ipa0("Dispatching", 1);
        b = ipa0Var2;
        ipa0 ipa0Var3 = new ipa0("NotDispatching", 2);
        c = ipa0Var3;
        d = new ipa0[]{ipa0Var, ipa0Var2, ipa0Var3};
    }

    public static ipa0 valueOf(String str) {
        return (ipa0) Enum.valueOf(ipa0.class, str);
    }

    public static ipa0[] values() {
        return (ipa0[]) d.clone();
    }
}
