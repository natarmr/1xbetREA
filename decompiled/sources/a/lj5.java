package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lj5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj5 f20134a;
    public static final lj5 b;
    public static final lj5 c;
    public static final lj5 d;
    public static final lj5 e;
    public static final /* synthetic */ lj5[] f;

    static {
        lj5 lj5Var = new lj5("NONE", 0);
        b = lj5Var;
        lj5 lj5Var2 = new lj5("PAYMENT_SUPPORT", 1);
        c = lj5Var2;
        lj5 lj5Var3 = new lj5("BALANCES", 2);
        d = lj5Var3;
        lj5 lj5Var4 = new lj5("ADD_BALANCE", 3);
        e = lj5Var4;
        f = new lj5[]{lj5Var, lj5Var2, lj5Var3, lj5Var4};
        f20134a = new kj5();
    }

    public static lj5 valueOf(String str) {
        return (lj5) Enum.valueOf(lj5.class, str);
    }

    public static lj5[] values() {
        return (lj5[]) f.clone();
    }
}
