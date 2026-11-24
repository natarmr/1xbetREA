package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0t0 f1776a;
    public static final b0t0 b;
    public static final /* synthetic */ b0t0[] c;

    static {
        b0t0 b0t0Var = new b0t0("SUPERTYPE", 0);
        f1776a = b0t0Var;
        b0t0 b0t0Var2 = new b0t0("COMMON", 1);
        b = b0t0Var2;
        c = new b0t0[]{b0t0Var, b0t0Var2};
    }

    public static b0t0 valueOf(String str) {
        return (b0t0) Enum.valueOf(b0t0.class, str);
    }

    public static b0t0[] values() {
        return (b0t0[]) c.clone();
    }
}
