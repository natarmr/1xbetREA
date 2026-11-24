package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hqt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hqt0 f13500a;
    public static final hqt0 b;
    public static final hqt0 c;
    public static final hqt0 d;
    public static final hqt0 e;
    public static final hqt0 f;
    public static final hqt0 g;
    public static final hqt0 h;
    public static final /* synthetic */ hqt0[] i;

    static {
        hqt0 hqt0Var = new hqt0("CAN_PARTICIPATE", 0);
        f13500a = hqt0Var;
        hqt0 hqt0Var2 = new hqt0("ALREADY_PARTICIPATING", 1);
        b = hqt0Var2;
        hqt0 hqt0Var3 = new hqt0("HOW_TO_PARTICIPATE", 2);
        c = hqt0Var3;
        hqt0 hqt0Var4 = new hqt0("BLOCKED", 3);
        d = hqt0Var4;
        hqt0 hqt0Var5 = new hqt0("DETAILS", 4);
        e = hqt0Var5;
        hqt0 hqt0Var6 = new hqt0("GAMES", 5);
        f = hqt0Var6;
        hqt0 hqt0Var7 = new hqt0("GAME", 6);
        g = hqt0Var7;
        hqt0 hqt0Var8 = new hqt0("NONE", 7);
        h = hqt0Var8;
        i = new hqt0[]{hqt0Var, hqt0Var2, hqt0Var3, hqt0Var4, hqt0Var5, hqt0Var6, hqt0Var7, hqt0Var8};
    }

    public static hqt0 valueOf(String str) {
        return (hqt0) Enum.valueOf(hqt0.class, str);
    }

    public static hqt0[] values() {
        return (hqt0[]) i.clone();
    }
}
