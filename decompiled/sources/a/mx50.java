package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mx50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mx50 f22536a;
    public static final mx50 b;
    public static final mx50 c;
    public static final /* synthetic */ mx50[] d;

    static {
        mx50 mx50Var = new mx50("NONE_ACTIVE", 0);
        f22536a = mx50Var;
        mx50 mx50Var2 = new mx50("OPENING", 1);
        b = mx50Var2;
        mx50 mx50Var3 = new mx50("OPENED", 2);
        c = mx50Var3;
        d = new mx50[]{mx50Var, mx50Var2, mx50Var3};
    }

    public static mx50 valueOf(String str) {
        return (mx50) Enum.valueOf(mx50.class, str);
    }

    public static mx50[] values() {
        return (mx50[]) d.clone();
    }
}
