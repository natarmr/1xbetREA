package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class sah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sah0 f31888a;
    public static final sah0 b;
    public static final sah0 c;
    public static final /* synthetic */ sah0[] d;

    static {
        sah0 sah0Var = new sah0("NONE", 0);
        f31888a = sah0Var;
        sah0 sah0Var2 = new sah0("SMOOTH", 1);
        b = sah0Var2;
        sah0 sah0Var3 = new sah0("INSTANT", 2);
        c = sah0Var3;
        d = new sah0[]{sah0Var, sah0Var2, sah0Var3};
    }

    public static sah0 valueOf(String str) {
        return (sah0) Enum.valueOf(sah0.class, str);
    }

    public static sah0[] values() {
        return (sah0[]) d.clone();
    }
}
