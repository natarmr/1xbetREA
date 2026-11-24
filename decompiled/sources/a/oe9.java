package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class oe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oe9 f25112a;
    public static final oe9 b;
    public static final oe9 c;
    public static final oe9 d;
    public static final /* synthetic */ oe9[] e;

    static {
        oe9 oe9Var = new oe9("LARGE", 0);
        f25112a = oe9Var;
        oe9 oe9Var2 = new oe9("MEDIUM", 1);
        b = oe9Var2;
        oe9 oe9Var3 = new oe9("SMALL", 2);
        c = oe9Var3;
        oe9 oe9Var4 = new oe9("EXTRA_SMALL", 3);
        d = oe9Var4;
        e = new oe9[]{oe9Var, oe9Var2, oe9Var3, oe9Var4};
    }

    public static oe9 valueOf(String str) {
        return (oe9) Enum.valueOf(oe9.class, str);
    }

    public static oe9[] values() {
        return (oe9[]) e.clone();
    }
}
