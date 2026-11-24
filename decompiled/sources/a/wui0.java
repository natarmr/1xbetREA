package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wui0 f39793a;
    public static final wui0 b;
    public static final wui0 c;
    public static final wui0 d;
    public static final /* synthetic */ wui0[] e;

    static {
        wui0 wui0Var = new wui0("Single", 0);
        f39793a = wui0Var;
        wui0 wui0Var2 = new wui0("Top", 1);
        b = wui0Var2;
        wui0 wui0Var3 = new wui0("Middle", 2);
        c = wui0Var3;
        wui0 wui0Var4 = new wui0("Bottom", 3);
        d = wui0Var4;
        e = new wui0[]{wui0Var, wui0Var2, wui0Var3, wui0Var4};
    }

    public static wui0 valueOf(String str) {
        return (wui0) Enum.valueOf(wui0.class, str);
    }

    public static wui0[] values() {
        return (wui0[]) e.clone();
    }
}
