package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zb0 f44090a;
    public static final zb0 b;
    public static final zb0 c;
    public static final /* synthetic */ zb0[] d;

    static {
        zb0 zb0Var = new zb0("NONE", 0);
        f44090a = zb0Var;
        zb0 zb0Var2 = new zb0("NOT_ALLOWED_BALANCE", 1);
        b = zb0Var2;
        zb0 zb0Var3 = new zb0("SAVED_BALANCE_UNAVAILABLE", 2);
        c = zb0Var3;
        d = new zb0[]{zb0Var, zb0Var2, zb0Var3};
    }

    public static zb0 valueOf(String str) {
        return (zb0) Enum.valueOf(zb0.class, str);
    }

    public static zb0[] values() {
        return (zb0[]) d.clone();
    }
}
