package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r270 f29718a;
    public static final r270 b;
    public static final r270 c;
    public static final r270 d;
    public static final /* synthetic */ r270[] e;

    static {
        r270 r270Var = new r270("ALL_GAMES", 0);
        f29718a = r270Var;
        r270 r270Var2 = new r270("PROMO", 1);
        b = r270Var2;
        r270 r270Var3 = new r270("CASHBACK", 2);
        c = r270Var3;
        r270 r270Var4 = new r270("FAVORITES", 3);
        d = r270Var4;
        e = new r270[]{r270Var, r270Var2, r270Var3, r270Var4};
    }

    public static r270 valueOf(String str) {
        return (r270) Enum.valueOf(r270.class, str);
    }

    public static r270[] values() {
        return (r270[]) e.clone();
    }
}
