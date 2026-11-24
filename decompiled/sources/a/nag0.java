package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nag0 f23190a;
    public static final /* synthetic */ nag0[] b;

    static {
        nag0 nag0Var = new nag0("MustUse", 0);
        f23190a = nag0Var;
        b = new nag0[]{nag0Var, new nag0("ExplicitlyIgnorable", 1), new nag0("Unspecified", 2)};
    }

    public static nag0 valueOf(String str) {
        return (nag0) Enum.valueOf(nag0.class, str);
    }

    public static nag0[] values() {
        return (nag0[]) b.clone();
    }
}
