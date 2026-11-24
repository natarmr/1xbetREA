package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv8 f3267a;
    public static final bv8 b;
    public static final bv8 c;
    public static final bv8 d;
    public static final /* synthetic */ bv8[] e;

    static {
        bv8 bv8Var = new bv8("TOP", 0);
        f3267a = bv8Var;
        bv8 bv8Var2 = new bv8("BOTTOM", 1);
        b = bv8Var2;
        bv8 bv8Var3 = new bv8("MIDDLE", 2);
        bv8 bv8Var4 = new bv8("SINGLE", 3);
        c = bv8Var4;
        bv8 bv8Var5 = new bv8("NONE", 4);
        d = bv8Var5;
        e = new bv8[]{bv8Var, bv8Var2, bv8Var3, bv8Var4, bv8Var5};
    }

    public static bv8 valueOf(String str) {
        return (bv8) Enum.valueOf(bv8.class, str);
    }

    public static bv8[] values() {
        return (bv8[]) e.clone();
    }
}
