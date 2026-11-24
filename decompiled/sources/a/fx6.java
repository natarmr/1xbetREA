package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fx6 f10293a;
    public static final fx6 b;
    public static final fx6 c;
    public static final /* synthetic */ fx6[] d;

    static {
        fx6 fx6Var = new fx6("Primary", 0);
        f10293a = fx6Var;
        fx6 fx6Var2 = new fx6("Error", 1);
        b = fx6Var2;
        fx6 fx6Var3 = new fx6("Disabled", 2);
        c = fx6Var3;
        d = new fx6[]{fx6Var, fx6Var2, fx6Var3};
    }

    public static fx6 valueOf(String str) {
        return (fx6) Enum.valueOf(fx6.class, str);
    }

    public static fx6[] values() {
        return (fx6[]) d.clone();
    }
}
