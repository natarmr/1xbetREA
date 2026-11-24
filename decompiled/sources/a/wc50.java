package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wc50 f38910a;
    public static final wc50 b;
    public static final wc50 c;
    public static final /* synthetic */ wc50[] d;

    static {
        wc50 wc50Var = new wc50("TITLE", 0);
        f38910a = wc50Var;
        wc50 wc50Var2 = new wc50("PRE_TITLE", 1);
        b = wc50Var2;
        wc50 wc50Var3 = new wc50("SUB_TITLE", 2);
        c = wc50Var3;
        d = new wc50[]{wc50Var, wc50Var2, wc50Var3};
    }

    public static wc50 valueOf(String str) {
        return (wc50) Enum.valueOf(wc50.class, str);
    }

    public static wc50[] values() {
        return (wc50[]) d.clone();
    }
}
