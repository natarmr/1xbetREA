package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gx1 f12054a;
    public static final gx1 b;
    public static final gx1 c;
    public static final gx1 d;
    public static final /* synthetic */ gx1[] e;

    static {
        gx1 gx1Var = new gx1("CARDS_S", 0);
        f12054a = gx1Var;
        gx1 gx1Var2 = new gx1("CARDS_L", 1);
        b = gx1Var2;
        gx1 gx1Var3 = new gx1("TRANSPARENT_VERTICAL", 2);
        c = gx1Var3;
        gx1 gx1Var4 = new gx1("TRANSPARENT_HORIZONTAL", 3);
        d = gx1Var4;
        e = new gx1[]{gx1Var, gx1Var2, gx1Var3, gx1Var4};
    }

    public static gx1 valueOf(String str) {
        return (gx1) Enum.valueOf(gx1.class, str);
    }

    public static gx1[] values() {
        return (gx1[]) e.clone();
    }
}
