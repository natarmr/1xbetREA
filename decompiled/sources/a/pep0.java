package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pep0 f26864a;
    public static final pep0 b;
    public static final /* synthetic */ pep0[] c;

    static {
        pep0 pep0Var = new pep0("LOGO_TO_NAME", 0);
        f26864a = pep0Var;
        pep0 pep0Var2 = new pep0("NAME_TO_LOGO", 1);
        b = pep0Var2;
        c = new pep0[]{pep0Var, pep0Var2};
    }

    public static pep0 valueOf(String str) {
        return (pep0) Enum.valueOf(pep0.class, str);
    }

    public static pep0[] values() {
        return (pep0[]) c.clone();
    }
}
