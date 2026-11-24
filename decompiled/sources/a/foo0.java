package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class foo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final foo0 f9892a;
    public static final /* synthetic */ foo0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    foo0 EF1;

    static {
        foo0 foo0Var = new foo0("Primary", 0);
        foo0 foo0Var2 = new foo0("Secondary", 1);
        foo0 foo0Var3 = new foo0("BackgroundLight", 2);
        foo0 foo0Var4 = new foo0("Red", 3);
        f9892a = foo0Var4;
        b = new foo0[]{foo0Var, foo0Var2, foo0Var3, foo0Var4, new foo0("Green", 4), new foo0("Violet", 5), new foo0("Purple", 6), new foo0("Blue", 7), new foo0("Teal", 8), new foo0("Yellow", 9), new foo0("Orange", 10), new foo0("DarkOrange", 11), new foo0("Pink", 12), new foo0("DarkPink", 13), new foo0("Gray", 14), new foo0("DarkGray", 15), new foo0("White", 16), new foo0("TransparentRed", 17), new foo0("TransparentGreen", 18), new foo0("TransparentDarkOrange", 19), new foo0("TransparentWhite", 20)};
    }

    public static foo0 valueOf(String str) {
        return (foo0) Enum.valueOf(foo0.class, str);
    }

    public static foo0[] values() {
        return (foo0[]) b.clone();
    }
}
