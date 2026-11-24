package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qc0 f28463a;
    public static final qc0 b;
    public static final qc0 c;
    public static final qc0 d;
    public static final /* synthetic */ qc0[] e;

    static {
        qc0 qc0Var = new qc0("ACTIVE", 0);
        f28463a = qc0Var;
        qc0 qc0Var2 = new qc0("AVAILABLE", 1);
        b = qc0Var2;
        qc0 qc0Var3 = new qc0("TITLE", 2);
        c = qc0Var3;
        qc0 qc0Var4 = new qc0("DISABLED", 3);
        d = qc0Var4;
        e = new qc0[]{qc0Var, qc0Var2, qc0Var3, qc0Var4};
    }

    public static qc0 valueOf(String str) {
        return (qc0) Enum.valueOf(qc0.class, str);
    }

    public static qc0[] values() {
        return (qc0[]) e.clone();
    }
}
