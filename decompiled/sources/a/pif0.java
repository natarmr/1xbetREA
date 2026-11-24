package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pif0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pif0 f27041a;
    public static final pif0 b;
    public static final pif0 c;
    public static final /* synthetic */ pif0[] d;

    static {
        pif0 pif0Var = new pif0("FIRST_TEAM", 0);
        f27041a = pif0Var;
        pif0 pif0Var2 = new pif0("SECOND_TEAM", 1);
        b = pif0Var2;
        pif0 pif0Var3 = new pif0("ALL_TEAMS", 2);
        c = pif0Var3;
        d = new pif0[]{pif0Var, pif0Var2, pif0Var3};
    }

    public static pif0 valueOf(String str) {
        return (pif0) Enum.valueOf(pif0.class, str);
    }

    public static pif0[] values() {
        return (pif0[]) d.clone();
    }
}
