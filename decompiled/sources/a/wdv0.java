package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wdv0 f38992a;
    public static final wdv0 b;
    public static final wdv0 c;
    public static final /* synthetic */ wdv0[] d;

    static {
        wdv0 wdv0Var = new wdv0("NONE", 0);
        f38992a = wdv0Var;
        wdv0 wdv0Var2 = new wdv0("SMALL", 1);
        b = wdv0Var2;
        wdv0 wdv0Var3 = new wdv0("LARGE", 2);
        c = wdv0Var3;
        d = new wdv0[]{wdv0Var, wdv0Var2, wdv0Var3};
    }

    public static wdv0 valueOf(String str) {
        return (wdv0) Enum.valueOf(wdv0.class, str);
    }

    public static wdv0[] values() {
        return (wdv0[]) d.clone();
    }
}
