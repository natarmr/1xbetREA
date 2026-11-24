package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ba10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba10 f2236a;
    public static final ba10 b;
    public static final ba10 c;
    public static final ba10 d;
    public static final ba10 e;
    public static final ba10 f;
    public static final /* synthetic */ ba10[] g;

    static {
        ba10 ba10Var = new ba10("SET_ANIMATION", 0);
        f2236a = ba10Var;
        ba10 ba10Var2 = new ba10("SET_PROGRESS", 1);
        b = ba10Var2;
        ba10 ba10Var3 = new ba10("SET_REPEAT_MODE", 2);
        c = ba10Var3;
        ba10 ba10Var4 = new ba10("SET_REPEAT_COUNT", 3);
        d = ba10Var4;
        ba10 ba10Var5 = new ba10("SET_IMAGE_ASSETS", 4);
        e = ba10Var5;
        ba10 ba10Var6 = new ba10("PLAY_OPTION", 5);
        f = ba10Var6;
        g = new ba10[]{ba10Var, ba10Var2, ba10Var3, ba10Var4, ba10Var5, ba10Var6};
    }

    public static ba10 valueOf(String str) {
        return (ba10) Enum.valueOf(ba10.class, str);
    }

    public static ba10[] values() {
        return (ba10[]) g.clone();
    }
}
