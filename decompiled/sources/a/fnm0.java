package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fnm0 f9845a;
    public static final fnm0 b;
    public static final fnm0 c;
    public static final /* synthetic */ fnm0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    fnm0 EF0;

    static {
        fnm0 fnm0Var = new fnm0("Unknown", 0);
        fnm0 fnm0Var2 = new fnm0("Fixed", 1);
        f9845a = fnm0Var2;
        fnm0 fnm0Var3 = new fnm0("NotApplicable", 2);
        b = fnm0Var3;
        fnm0 fnm0Var4 = new fnm0("NotFixed", 3);
        c = fnm0Var4;
        d = new fnm0[]{fnm0Var, fnm0Var2, fnm0Var3, fnm0Var4};
    }

    public static fnm0 valueOf(String str) {
        return (fnm0) Enum.valueOf(fnm0.class, str);
    }

    public static fnm0[] values() {
        return (fnm0[]) d.clone();
    }
}
