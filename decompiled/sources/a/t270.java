package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t270 f33203a;
    public static final t270 b;
    public static final t270 c;
    public static final t270 d;
    public static final /* synthetic */ t270[] e;

    static {
        t270 t270Var = new t270("ALL_GAMES", 0);
        f33203a = t270Var;
        t270 t270Var2 = new t270("PROMO", 1);
        b = t270Var2;
        t270 t270Var3 = new t270("CASHBACK", 2);
        c = t270Var3;
        t270 t270Var4 = new t270("FAVORITES", 3);
        d = t270Var4;
        e = new t270[]{t270Var, t270Var2, t270Var3, t270Var4};
    }

    public static t270 valueOf(String str) {
        return (t270) Enum.valueOf(t270.class, str);
    }

    public static t270[] values() {
        return (t270[]) e.clone();
    }
}
