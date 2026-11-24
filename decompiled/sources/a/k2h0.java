package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2h0 f17572a;
    public static final k2h0 b;
    public static final k2h0 c;
    public static final /* synthetic */ k2h0[] d;

    static {
        k2h0 k2h0Var = new k2h0("NETWORK_UNMETERED", 0);
        f17572a = k2h0Var;
        k2h0 k2h0Var2 = new k2h0("DEVICE_IDLE", 1);
        b = k2h0Var2;
        k2h0 k2h0Var3 = new k2h0("DEVICE_CHARGING", 2);
        c = k2h0Var3;
        d = new k2h0[]{k2h0Var, k2h0Var2, k2h0Var3};
    }

    public static k2h0 valueOf(String str) {
        return (k2h0) Enum.valueOf(k2h0.class, str);
    }

    public static k2h0[] values() {
        return (k2h0[]) d.clone();
    }
}
