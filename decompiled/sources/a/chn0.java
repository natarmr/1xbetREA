package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class chn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final chn0 f4368a;
    public static final chn0 b;
    public static final /* synthetic */ chn0[] c;

    static {
        chn0 chn0Var = new chn0("COLORED_TEXT", 0);
        f4368a = chn0Var;
        chn0 chn0Var2 = new chn0("BLACK_TEXT", 1);
        b = chn0Var2;
        c = new chn0[]{chn0Var, chn0Var2};
    }

    public static chn0 valueOf(String str) {
        return (chn0) Enum.valueOf(chn0.class, str);
    }

    public static chn0[] values() {
        return (chn0[]) c.clone();
    }
}
