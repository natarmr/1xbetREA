package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o8u0 f24851a;
    public static final o8u0 b;
    public static final o8u0 c;
    public static final /* synthetic */ o8u0[] d;

    static {
        o8u0 o8u0Var = new o8u0("INITIALIZE", 0);
        f24851a = o8u0Var;
        o8u0 o8u0Var2 = new o8u0("CONTENT", 1);
        b = o8u0Var2;
        o8u0 o8u0Var3 = new o8u0("ERROR", 2);
        c = o8u0Var3;
        d = new o8u0[]{o8u0Var, o8u0Var2, o8u0Var3};
    }

    public static o8u0 valueOf(String str) {
        return (o8u0) Enum.valueOf(o8u0.class, str);
    }

    public static o8u0[] values() {
        return (o8u0[]) d.clone();
    }
}
