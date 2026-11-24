package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h2l0 f12340a;
    public static final h2l0 b;
    public static final h2l0 c;
    public static final h2l0 d;
    public static final h2l0 e;
    public static final /* synthetic */ h2l0[] f;

    static {
        h2l0 h2l0Var = new h2l0("ACTION_ICON", 0);
        f12340a = h2l0Var;
        h2l0 h2l0Var2 = new h2l0("CHECK_BOX", 1);
        b = h2l0Var2;
        h2l0 h2l0Var3 = new h2l0("ACCORDION", 2);
        c = h2l0Var3;
        h2l0 h2l0Var4 = new h2l0("FAVOURITE_ICON", 3);
        d = h2l0Var4;
        h2l0 h2l0Var5 = new h2l0("NOTIFICATION_ICON", 4);
        e = h2l0Var5;
        f = new h2l0[]{h2l0Var, h2l0Var2, h2l0Var3, h2l0Var4, h2l0Var5};
    }

    public static h2l0 valueOf(String str) {
        return (h2l0) Enum.valueOf(h2l0.class, str);
    }

    public static h2l0[] values() {
        return (h2l0[]) f.clone();
    }
}
