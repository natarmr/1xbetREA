package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jdk0 f39093a;
    public static final wg3 b;
    public static final wg3 c;
    public static final wg3 d;
    public static final wg3 e;
    public static final /* synthetic */ wg3[] f;

    static {
        wg3 wg3Var = new wg3("BALLS", 0);
        b = wg3Var;
        wg3 wg3Var2 = new wg3("DOTS", 1);
        c = wg3Var2;
        wg3 wg3Var3 = new wg3("ARROWS", 2);
        d = wg3Var3;
        wg3 wg3Var4 = new wg3("SPORTSMEN", 3);
        e = wg3Var4;
        f = new wg3[]{wg3Var, wg3Var2, wg3Var3, wg3Var4};
        f39093a = new jdk0();
    }

    public static wg3 valueOf(String str) {
        return (wg3) Enum.valueOf(wg3.class, str);
    }

    public static wg3[] values() {
        return (wg3[]) f.clone();
    }
}
