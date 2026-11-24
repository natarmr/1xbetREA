package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wkn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wkn0 f39315a;
    public static final wkn0 b;
    public static final wkn0 c;
    public static final wkn0 d;
    public static final wkn0 e;
    public static final /* synthetic */ wkn0[] f;

    static {
        wkn0 wkn0Var = new wkn0("END", 0);
        f39315a = wkn0Var;
        wkn0 wkn0Var2 = new wkn0("ROLLBACK", 1);
        b = wkn0Var2;
        wkn0 wkn0Var3 = new wkn0("BEGIN_EXCLUSIVE", 2);
        c = wkn0Var3;
        wkn0 wkn0Var4 = new wkn0("BEGIN_IMMEDIATE", 3);
        d = wkn0Var4;
        wkn0 wkn0Var5 = new wkn0("BEGIN_DEFERRED", 4);
        e = wkn0Var5;
        f = new wkn0[]{wkn0Var, wkn0Var2, wkn0Var3, wkn0Var4, wkn0Var5};
    }

    public static wkn0 valueOf(String str) {
        return (wkn0) Enum.valueOf(wkn0.class, str);
    }

    public static wkn0[] values() {
        return (wkn0[]) f.clone();
    }
}
