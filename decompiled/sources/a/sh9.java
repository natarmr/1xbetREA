package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sh9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sh9 f32202a;
    public static final sh9 b;
    public static final /* synthetic */ sh9[] c;

    static {
        sh9 sh9Var = new sh9("all", 0);
        f32202a = sh9Var;
        sh9 sh9Var2 = new sh9("aural", 1);
        sh9 sh9Var3 = new sh9("braille", 2);
        sh9 sh9Var4 = new sh9("embossed", 3);
        sh9 sh9Var5 = new sh9("handheld", 4);
        sh9 sh9Var6 = new sh9("print", 5);
        sh9 sh9Var7 = new sh9("projection", 6);
        sh9 sh9Var8 = new sh9("screen", 7);
        b = sh9Var8;
        c = new sh9[]{sh9Var, sh9Var2, sh9Var3, sh9Var4, sh9Var5, sh9Var6, sh9Var7, sh9Var8, new sh9("speech", 8), new sh9("tty", 9), new sh9("tv", 10)};
    }

    public static sh9 valueOf(String str) {
        return (sh9) Enum.valueOf(sh9.class, str);
    }

    public static sh9[] values() {
        return (sh9[]) c.clone();
    }
}
