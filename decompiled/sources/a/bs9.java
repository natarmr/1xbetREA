package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bs9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bs9 f3118a;
    public static final bs9 b;
    public static final bs9 c;
    public static final bs9 d;
    public static final bs9 e;
    public static final /* synthetic */ bs9[] f;

    static {
        bs9 bs9Var = new bs9("INITIAL", 0);
        f3118a = bs9Var;
        bs9 bs9Var2 = new bs9("LOADING", 1);
        b = bs9Var2;
        bs9 bs9Var3 = new bs9("ERROR", 2);
        c = bs9Var3;
        bs9 bs9Var4 = new bs9("SUCCESS_WITH_EMPTY", 3);
        d = bs9Var4;
        bs9 bs9Var5 = new bs9("SUCCESS", 4);
        e = bs9Var5;
        f = new bs9[]{bs9Var, bs9Var2, bs9Var3, bs9Var4, bs9Var5};
    }

    public static bs9 valueOf(String str) {
        return (bs9) Enum.valueOf(bs9.class, str);
    }

    public static bs9[] values() {
        return (bs9[]) f.clone();
    }
}
