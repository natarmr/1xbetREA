package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wqf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wqf0 f39589a;
    public static final wqf0 b;
    public static final wqf0 c;
    public static final wqf0 d;
    public static final wqf0 e;
    public static final /* synthetic */ wqf0[] f;

    static {
        wqf0 wqf0Var = new wqf0("DEFAULT", 0);
        f39589a = wqf0Var;
        wqf0 wqf0Var2 = new wqf0("WIN", 1);
        b = wqf0Var2;
        wqf0 wqf0Var3 = new wqf0("LOOSE", 2);
        c = wqf0Var3;
        wqf0 wqf0Var4 = new wqf0("LOOSE_BONUS_GAME", 3);
        d = wqf0Var4;
        wqf0 wqf0Var5 = new wqf0("PUT_OUT_FIRE", 4);
        e = wqf0Var5;
        f = new wqf0[]{wqf0Var, wqf0Var2, wqf0Var3, wqf0Var4, wqf0Var5};
    }

    public static wqf0 valueOf(String str) {
        return (wqf0) Enum.valueOf(wqf0.class, str);
    }

    public static wqf0[] values() {
        return (wqf0[]) f.clone();
    }
}
