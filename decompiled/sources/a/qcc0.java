package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qcc0 f28478a;
    public static final qcc0 b;
    public static final qcc0 c;
    public static final qcc0 d;
    public static final /* synthetic */ qcc0[] e;

    static {
        qcc0 qcc0Var = new qcc0("POINTS", 0);
        f28478a = qcc0Var;
        qcc0 qcc0Var2 = new qcc0("TICKETS", 1);
        b = qcc0Var2;
        qcc0 qcc0Var3 = new qcc0("SPINS", 2);
        c = qcc0Var3;
        qcc0 qcc0Var4 = new qcc0("UNDEFINED", 3);
        d = qcc0Var4;
        e = new qcc0[]{qcc0Var, qcc0Var2, qcc0Var3, qcc0Var4};
    }

    public static qcc0 valueOf(String str) {
        return (qcc0) Enum.valueOf(qcc0.class, str);
    }

    public static qcc0[] values() {
        return (qcc0[]) e.clone();
    }
}
