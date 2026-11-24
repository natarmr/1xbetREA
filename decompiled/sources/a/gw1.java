package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gw1 f12002a;
    public static final gw1 b;
    public static final gw1 c;
    public static final gw1 d;
    public static final /* synthetic */ gw1[] e;

    static {
        gw1 gw1Var = new gw1("ICON_S", 0);
        f12002a = gw1Var;
        gw1 gw1Var2 = new gw1("ICON_L", 1);
        b = gw1Var2;
        gw1 gw1Var3 = new gw1("NUMBER", 2);
        c = gw1Var3;
        gw1 gw1Var4 = new gw1("ILLUSTRATION", 3);
        d = gw1Var4;
        e = new gw1[]{gw1Var, gw1Var2, gw1Var3, gw1Var4};
    }

    public static gw1 valueOf(String str) {
        return (gw1) Enum.valueOf(gw1.class, str);
    }

    public static gw1[] values() {
        return (gw1[]) e.clone();
    }
}
