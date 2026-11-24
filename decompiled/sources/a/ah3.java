package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek0 f854a;
    public static final ah3 b;
    public static final ah3 c;
    public static final ah3 d;
    public static final ah3 e;
    public static final ah3 f;
    public static final /* synthetic */ ah3[] g;

    static {
        ah3 ah3Var = new ah3("LOADER_TOP_LOGO_CENTER", 0);
        b = ah3Var;
        ah3 ah3Var2 = new ah3("LOADER_MIDDLE_LOGO_MIDDLE", 1);
        c = ah3Var2;
        ah3 ah3Var3 = new ah3("LOADER_MIDDLE_BOTTOM_LOGO_TOP", 2);
        d = ah3Var3;
        ah3 ah3Var4 = new ah3("LOADER_BOTTOM_LOGO_TOP", 3);
        e = ah3Var4;
        ah3 ah3Var5 = new ah3("LOADER_BOTTOM_LOGO_MIDDLE", 4);
        f = ah3Var5;
        g = new ah3[]{ah3Var, ah3Var2, ah3Var3, ah3Var4, ah3Var5};
        f854a = new pek0();
    }

    public static ah3 valueOf(String str) {
        return (ah3) Enum.valueOf(ah3.class, str);
    }

    public static ah3[] values() {
        return (ah3[]) g.clone();
    }
}
