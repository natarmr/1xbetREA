package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class txr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final txr0 f34716a;
    public static final txr0 b;
    public static final txr0 c;
    public static final /* synthetic */ txr0[] d;

    static {
        txr0 txr0Var = new txr0("WIN", 0);
        f34716a = txr0Var;
        txr0 txr0Var2 = new txr0("LOSE", 1);
        b = txr0Var2;
        txr0 txr0Var3 = new txr0("DEFAULT", 2);
        c = txr0Var3;
        d = new txr0[]{txr0Var, txr0Var2, txr0Var3};
    }

    public static txr0 valueOf(String str) {
        return (txr0) Enum.valueOf(txr0.class, str);
    }

    public static txr0[] values() {
        return (txr0[]) d.clone();
    }
}
