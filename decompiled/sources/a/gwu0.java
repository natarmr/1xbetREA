package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gwu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gwu0 f12046a;
    public static final gwu0 b;
    public static final gwu0 c;
    public static final /* synthetic */ gwu0[] d;

    static {
        gwu0 gwu0Var = new gwu0("DEFAULT", 0);
        f12046a = gwu0Var;
        gwu0 gwu0Var2 = new gwu0("TOP_UP_MAIN_BALANCE", 1);
        b = gwu0Var2;
        gwu0 gwu0Var3 = new gwu0("TOP_UP_ACTIVE_BALANCE", 2);
        c = gwu0Var3;
        d = new gwu0[]{gwu0Var, gwu0Var2, gwu0Var3};
    }

    public static gwu0 valueOf(String str) {
        return (gwu0) Enum.valueOf(gwu0.class, str);
    }

    public static gwu0[] values() {
        return (gwu0[]) d.clone();
    }
}
