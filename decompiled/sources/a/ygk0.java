package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ygk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ygk0 f42589a;
    public static final ygk0 b;
    public static final ygk0 c;
    public static final /* synthetic */ ygk0[] d;

    static {
        ygk0 ygk0Var = new ygk0("SELECTED", 0);
        f42589a = ygk0Var;
        ygk0 ygk0Var2 = new ygk0("ERROR", 1);
        b = ygk0Var2;
        ygk0 ygk0Var3 = new ygk0("DEFAULT", 2);
        c = ygk0Var3;
        d = new ygk0[]{ygk0Var, ygk0Var2, ygk0Var3};
    }

    public static ygk0 valueOf(String str) {
        return (ygk0) Enum.valueOf(ygk0.class, str);
    }

    public static ygk0[] values() {
        return (ygk0[]) d.clone();
    }
}
