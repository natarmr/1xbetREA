package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sb50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xuz f31916a;
    public static final sb50 b;
    public static final sb50 c;
    public static final sb50 d;
    public static final sb50 e;
    public static final /* synthetic */ sb50[] f;

    static {
        sb50 sb50Var = new sb50("NONE", 0);
        b = sb50Var;
        sb50 sb50Var2 = new sb50("PAYMENT_SUPPORT", 1);
        c = sb50Var2;
        sb50 sb50Var3 = new sb50("BALANCES", 2);
        d = sb50Var3;
        sb50 sb50Var4 = new sb50("ADD_BALANCE", 3);
        e = sb50Var4;
        f = new sb50[]{sb50Var, sb50Var2, sb50Var3, sb50Var4};
        f31916a = new xuz();
    }

    public static sb50 valueOf(String str) {
        return (sb50) Enum.valueOf(sb50.class, str);
    }

    public static sb50[] values() {
        return (sb50[]) f.clone();
    }
}
