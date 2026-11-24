package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hh5 f13045a;
    public static final hh5 b;
    public static final /* synthetic */ hh5[] c;

    static {
        hh5 hh5Var = new hh5("DEPOSIT", 0);
        f13045a = hh5Var;
        hh5 hh5Var2 = new hh5("PAYOUT", 1);
        b = hh5Var2;
        c = new hh5[]{hh5Var, hh5Var2};
    }

    public static hh5 valueOf(String str) {
        return (hh5) Enum.valueOf(hh5.class, str);
    }

    public static hh5[] values() {
        return (hh5[]) c.clone();
    }
}
