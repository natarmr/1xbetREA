package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aub0 f1470a;
    public static final aub0 b;
    public static final aub0 c;
    public static final aub0 d;
    public static final aub0 e;
    public static final aub0 f;
    public static final aub0 g;
    public static final aub0 h;
    public static final aub0 i;
    public static final aub0 j;
    public static final /* synthetic */ aub0[] k;

    static {
        aub0 aub0Var = new aub0("none", 0);
        f1470a = aub0Var;
        aub0 aub0Var2 = new aub0("xMinYMin", 1);
        b = aub0Var2;
        aub0 aub0Var3 = new aub0("xMidYMin", 2);
        c = aub0Var3;
        aub0 aub0Var4 = new aub0("xMaxYMin", 3);
        d = aub0Var4;
        aub0 aub0Var5 = new aub0("xMinYMid", 4);
        e = aub0Var5;
        aub0 aub0Var6 = new aub0("xMidYMid", 5);
        f = aub0Var6;
        aub0 aub0Var7 = new aub0("xMaxYMid", 6);
        g = aub0Var7;
        aub0 aub0Var8 = new aub0("xMinYMax", 7);
        h = aub0Var8;
        aub0 aub0Var9 = new aub0("xMidYMax", 8);
        i = aub0Var9;
        aub0 aub0Var10 = new aub0("xMaxYMax", 9);
        j = aub0Var10;
        k = new aub0[]{aub0Var, aub0Var2, aub0Var3, aub0Var4, aub0Var5, aub0Var6, aub0Var7, aub0Var8, aub0Var9, aub0Var10};
    }

    public static aub0 valueOf(String str) {
        return (aub0) Enum.valueOf(aub0.class, str);
    }

    public static aub0[] values() {
        return (aub0[]) k.clone();
    }
}
