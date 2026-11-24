package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fsh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fsh0 f10063a;
    public static final fsh0 b;
    public static final /* synthetic */ fsh0[] c;
    public static final /* synthetic */ c0o d;

    /* JADX INFO: Fake field, exist only in values array */
    fsh0 EF0;

    static {
        fsh0 fsh0Var = new fsh0("NONE", 0);
        fsh0 fsh0Var2 = new fsh0("NAV_SECURITY_QUESTION", 1);
        f10063a = fsh0Var2;
        fsh0 fsh0Var3 = new fsh0("NAV_TWO_FACTOR", 2);
        b = fsh0Var3;
        fsh0[] fsh0VarArr = {fsh0Var, fsh0Var2, fsh0Var3};
        c = fsh0VarArr;
        d = new c0o(fsh0VarArr);
    }

    public static fsh0 valueOf(String str) {
        return (fsh0) Enum.valueOf(fsh0.class, str);
    }

    public static fsh0[] values() {
        return (fsh0[]) c.clone();
    }
}
