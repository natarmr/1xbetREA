package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h810 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h810 f12604a;
    public static final h810 b;
    public static final h810 c;
    public static final /* synthetic */ h810[] d;

    static {
        h810 h810Var = new h810("IsPlacedInLookahead", 0);
        f12604a = h810Var;
        h810 h810Var2 = new h810("IsPlacedInApproach", 1);
        b = h810Var2;
        h810 h810Var3 = new h810("IsNotPlaced", 2);
        c = h810Var3;
        d = new h810[]{h810Var, h810Var2, h810Var3};
    }

    public static h810 valueOf(String str) {
        return (h810) Enum.valueOf(h810.class, str);
    }

    public static h810[] values() {
        return (h810[]) d.clone();
    }
}
