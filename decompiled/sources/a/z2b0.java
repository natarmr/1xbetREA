package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2b0 f43663a;
    public static final z2b0 b;
    public static final z2b0 c;
    public static final z2b0 d;
    public static final z2b0 e;
    public static final /* synthetic */ z2b0[] f;

    static {
        z2b0 z2b0Var = new z2b0("LOADING", 0);
        f43663a = z2b0Var;
        z2b0 z2b0Var2 = new z2b0("ERROR", 1);
        b = z2b0Var2;
        z2b0 z2b0Var3 = new z2b0("EMPTY", 2);
        c = z2b0Var3;
        z2b0 z2b0Var4 = new z2b0("CONTENT", 3);
        d = z2b0Var4;
        z2b0 z2b0Var5 = new z2b0("COUNTRY_BLOCKING", 4);
        e = z2b0Var5;
        f = new z2b0[]{z2b0Var, z2b0Var2, z2b0Var3, z2b0Var4, z2b0Var5};
    }

    public static z2b0 valueOf(String str) {
        return (z2b0) Enum.valueOf(z2b0.class, str);
    }

    public static z2b0[] values() {
        return (z2b0[]) f.clone();
    }
}
