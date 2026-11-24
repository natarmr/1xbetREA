package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class io10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io10 f15096a;
    public static final io10 b;
    public static final io10 c;
    public static final io10 d;
    public static final /* synthetic */ io10[] e;

    static {
        io10 io10Var = new io10("LOADING", 0);
        f15096a = io10Var;
        io10 io10Var2 = new io10("MAIN", 1);
        b = io10Var2;
        io10 io10Var3 = new io10("RESULT", 2);
        c = io10Var3;
        io10 io10Var4 = new io10("PRIZES", 3);
        d = io10Var4;
        e = new io10[]{io10Var, io10Var2, io10Var3, io10Var4};
    }

    public static io10 valueOf(String str) {
        return (io10) Enum.valueOf(io10.class, str);
    }

    public static io10[] values() {
        return (io10[]) e.clone();
    }
}
