package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cmb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cmb0 f4595a;
    public static final cmb0 b;
    public static final cmb0 c;
    public static final /* synthetic */ cmb0[] d;

    static {
        cmb0 cmb0Var = new cmb0("CHAMP_LIVE", 0);
        f4595a = cmb0Var;
        cmb0 cmb0Var2 = new cmb0("POPULAR_LIVE", 1);
        b = cmb0Var2;
        cmb0 cmb0Var3 = new cmb0("POPULAR_LINE", 2);
        c = cmb0Var3;
        d = new cmb0[]{cmb0Var, cmb0Var2, cmb0Var3, new cmb0("CYBERSPORT", 3), new cmb0("CHAMP_ALL", 4)};
    }

    public static cmb0 valueOf(String str) {
        return (cmb0) Enum.valueOf(cmb0.class, str);
    }

    public static cmb0[] values() {
        return (cmb0[]) d.clone();
    }
}
