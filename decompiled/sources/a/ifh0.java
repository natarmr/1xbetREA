package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ifh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ifh0 f14687a;
    public static final ifh0 b;
    public static final /* synthetic */ ifh0[] c;
    public static final /* synthetic */ c0o d;

    static {
        ifh0 ifh0Var = new ifh0("MAIN_SCREEN", 0);
        f14687a = ifh0Var;
        ifh0 ifh0Var2 = new ifh0("RESULTS_SCREEN", 1);
        b = ifh0Var2;
        ifh0[] ifh0VarArr = {ifh0Var, ifh0Var2};
        c = ifh0VarArr;
        d = new c0o(ifh0VarArr);
    }

    public static ifh0 valueOf(String str) {
        return (ifh0) Enum.valueOf(ifh0.class, str);
    }

    public static ifh0[] values() {
        return (ifh0[]) c.clone();
    }
}
