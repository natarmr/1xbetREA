package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class paa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final paa0 f26647a;
    public static final paa0 b;
    public static final /* synthetic */ paa0[] c;

    static {
        paa0 paa0Var = new paa0("SELECTED", 0);
        f26647a = paa0Var;
        paa0 paa0Var2 = new paa0("UNSELECTED", 1);
        b = paa0Var2;
        c = new paa0[]{paa0Var, paa0Var2};
    }

    public static paa0 valueOf(String str) {
        return (paa0) Enum.valueOf(paa0.class, str);
    }

    public static paa0[] values() {
        return (paa0[]) c.clone();
    }
}
