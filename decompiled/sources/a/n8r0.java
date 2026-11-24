package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n8r0 f23103a;
    public static final n8r0 b;
    public static final n8r0 c;
    public static final /* synthetic */ n8r0[] d;

    static {
        n8r0 n8r0Var = new n8r0("NO_ERROR", 0);
        f23103a = n8r0Var;
        n8r0 n8r0Var2 = new n8r0("CONTENT_ERROR", 1);
        b = n8r0Var2;
        n8r0 n8r0Var3 = new n8r0("CONTENT_EMPTY_ERROR", 2);
        c = n8r0Var3;
        d = new n8r0[]{n8r0Var, n8r0Var2, n8r0Var3};
    }

    public static n8r0 valueOf(String str) {
        return (n8r0) Enum.valueOf(n8r0.class, str);
    }

    public static n8r0[] values() {
        return (n8r0[]) d.clone();
    }
}
