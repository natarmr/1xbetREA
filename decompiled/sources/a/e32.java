package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e32 f7113a;
    public static final e32 b;
    public static final e32 c;
    public static final /* synthetic */ e32[] d;

    static {
        e32 e32Var = new e32("NO_ERROR", 0);
        f7113a = e32Var;
        e32 e32Var2 = new e32("CONTENT_ERROR", 1);
        b = e32Var2;
        e32 e32Var3 = new e32("CONTENT_EMPTY_ERROR", 2);
        c = e32Var3;
        d = new e32[]{e32Var, e32Var2, e32Var3};
    }

    public static e32 valueOf(String str) {
        return (e32) Enum.valueOf(e32.class, str);
    }

    public static e32[] values() {
        return (e32[]) d.clone();
    }
}
