package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pu40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pu40 f27597a;
    public static final pu40 b;
    public static final pu40 c;
    public static final pu40 d;
    public static final pu40 e;
    public static final /* synthetic */ pu40[] f;

    static {
        pu40 pu40Var = new pu40("ALREADY_MOVED", 0);
        f27597a = pu40Var;
        pu40 pu40Var2 = new pu40("CAN_MOVE", 1);
        b = pu40Var2;
        pu40 pu40Var3 = new pu40("MULTI_BET_ERROR", 2);
        c = pu40Var3;
        pu40 pu40Var4 = new pu40("CONDITION_BET_ERROR", 3);
        d = pu40Var4;
        pu40 pu40Var5 = new pu40("DEFAULT", 4);
        e = pu40Var5;
        f = new pu40[]{pu40Var, pu40Var2, pu40Var3, pu40Var4, pu40Var5};
    }

    public static pu40 valueOf(String str) {
        return (pu40) Enum.valueOf(pu40.class, str);
    }

    public static pu40[] values() {
        return (pu40[]) f.clone();
    }
}
