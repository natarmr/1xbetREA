package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xev0 f40762a;
    public static final xev0 b;
    public static final /* synthetic */ xev0[] c;

    static {
        xev0 xev0Var = new xev0("WIDE", 0);
        f40762a = xev0Var;
        xev0 xev0Var2 = new xev0("ABBREVIATED", 1);
        b = xev0Var2;
        c = new xev0[]{xev0Var, xev0Var2, new xev0("NARROW", 2)};
    }

    public static xev0 valueOf(String str) {
        return (xev0) Enum.valueOf(xev0.class, str);
    }

    public static xev0[] values() {
        return (xev0[]) c.clone();
    }
}
