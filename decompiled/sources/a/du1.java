package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class du1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final du1 f6679a;
    public static final du1 b;
    public static final du1 c;
    public static final du1 d;
    public static final /* synthetic */ du1[] e;

    static {
        du1 du1Var = new du1("PICTURE", 0);
        f6679a = du1Var;
        du1 du1Var2 = new du1("PICTURE_HEAD", 1);
        b = du1Var2;
        du1 du1Var3 = new du1("GRADIENT", 2);
        c = du1Var3;
        du1 du1Var4 = new du1("FIXED", 3);
        d = du1Var4;
        e = new du1[]{du1Var, du1Var2, du1Var3, du1Var4};
    }

    public static du1 valueOf(String str) {
        return (du1) Enum.valueOf(du1.class, str);
    }

    public static du1[] values() {
        return (du1[]) e.clone();
    }
}
