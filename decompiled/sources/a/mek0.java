package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gle0 f21650a;
    public static final mek0 b;
    public static final mek0 c;
    public static final mek0 d;
    public static final mek0 e;
    public static final /* synthetic */ mek0[] f;

    static {
        mek0 mek0Var = new mek0("MONOCHROME_WITH_WHITE_ICON", 0);
        b = mek0Var;
        mek0 mek0Var2 = new mek0("MONOCHRONE_NO_ICON", 1);
        c = mek0Var2;
        mek0 mek0Var3 = new mek0("MONOCHROME_WITH_COLLORED_ICON", 2);
        d = mek0Var3;
        mek0 mek0Var4 = new mek0("COLLORED_BACKGROUND_NO_ICON", 3);
        e = mek0Var4;
        f = new mek0[]{mek0Var, mek0Var2, mek0Var3, mek0Var4};
        f21650a = new gle0();
    }

    public static mek0 valueOf(String str) {
        return (mek0) Enum.valueOf(mek0.class, str);
    }

    public static mek0[] values() {
        return (mek0[]) f.clone();
    }
}
