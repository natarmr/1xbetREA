package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x3b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3b0 f40211a;
    public static final x3b0 b;
    public static final x3b0 c;
    public static final x3b0 d;
    public static final /* synthetic */ x3b0[] e;

    static {
        x3b0 x3b0Var = new x3b0("SINGLE", 0);
        f40211a = x3b0Var;
        x3b0 x3b0Var2 = new x3b0("FIRST", 1);
        b = x3b0Var2;
        x3b0 x3b0Var3 = new x3b0("MIDDLE", 2);
        c = x3b0Var3;
        x3b0 x3b0Var4 = new x3b0("LAST", 3);
        d = x3b0Var4;
        e = new x3b0[]{x3b0Var, x3b0Var2, x3b0Var3, x3b0Var4};
    }

    public static x3b0 valueOf(String str) {
        return (x3b0) Enum.valueOf(x3b0.class, str);
    }

    public static x3b0[] values() {
        return (x3b0[]) e.clone();
    }
}
