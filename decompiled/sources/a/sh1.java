package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sh1 f32187a;
    public static final sh1 b;
    public static final sh1 c;
    public static final /* synthetic */ sh1[] d;

    static {
        sh1 sh1Var = new sh1("Vertical", 0);
        f32187a = sh1Var;
        sh1 sh1Var2 = new sh1("Horizontal", 1);
        b = sh1Var2;
        sh1 sh1Var3 = new sh1("WithStates", 2);
        c = sh1Var3;
        d = new sh1[]{sh1Var, sh1Var2, sh1Var3, new sh1("VerticalConstrained", 3)};
    }

    public static sh1 valueOf(String str) {
        return (sh1) Enum.valueOf(sh1.class, str);
    }

    public static sh1[] values() {
        return (sh1[]) d.clone();
    }
}
