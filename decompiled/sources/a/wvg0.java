package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wvg0 f39835a;
    public static final wvg0 b;
    public static final wvg0 c;
    public static final wvg0 d;
    public static final /* synthetic */ wvg0[] e;

    static {
        wvg0 wvg0Var = new wvg0("PART_SALE", 0);
        f39835a = wvg0Var;
        wvg0 wvg0Var2 = new wvg0("INITIAL", 1);
        b = wvg0Var2;
        wvg0 wvg0Var3 = new wvg0("AUTO_SALE", 2);
        c = wvg0Var3;
        wvg0 wvg0Var4 = new wvg0("AUTO_SALE_ONLY_FULL", 3);
        d = wvg0Var4;
        e = new wvg0[]{wvg0Var, wvg0Var2, wvg0Var3, wvg0Var4};
    }

    public static wvg0 valueOf(String str) {
        return (wvg0) Enum.valueOf(wvg0.class, str);
    }

    public static wvg0[] values() {
        return (wvg0[]) e.clone();
    }
}
