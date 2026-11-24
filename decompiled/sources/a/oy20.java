package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class oy20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oy20 f26041a;
    public static final oy20 b;
    public static final oy20 c;
    public static final oy20 d;
    public static final oy20 e;
    public static final /* synthetic */ oy20[] f;

    static {
        oy20 oy20Var = new oy20("GAME", 0);
        f26041a = oy20Var;
        oy20 oy20Var2 = new oy20("INSIGHTS", 1);
        b = oy20Var2;
        oy20 oy20Var3 = new oy20("DUEL", 2);
        c = oy20Var3;
        oy20 oy20Var4 = new oy20("PLAYERS", 3);
        d = oy20Var4;
        oy20 oy20Var5 = new oy20("CYBER", 4);
        e = oy20Var5;
        f = new oy20[]{oy20Var, oy20Var2, oy20Var3, oy20Var4, oy20Var5};
    }

    public static oy20 valueOf(String str) {
        return (oy20) Enum.valueOf(oy20.class, str);
    }

    public static oy20[] values() {
        return (oy20[]) f.clone();
    }
}
