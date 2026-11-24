package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fix0 f9611a;
    public static final fix0 b;
    public static final fix0 c;
    public static final /* synthetic */ fix0[] d;

    static {
        fix0 fix0Var = new fix0("NIST_P256", 0);
        f9611a = fix0Var;
        fix0 fix0Var2 = new fix0("NIST_P384", 1);
        b = fix0Var2;
        fix0 fix0Var3 = new fix0("NIST_P521", 2);
        c = fix0Var3;
        d = new fix0[]{fix0Var, fix0Var2, fix0Var3};
    }

    public static fix0[] values() {
        return (fix0[]) d.clone();
    }
}
