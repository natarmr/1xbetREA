package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b7b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b7b0 f2099a;
    public static final b7b0 b;
    public static final /* synthetic */ b7b0[] c;

    static {
        b7b0 b7b0Var = new b7b0("LIVE", 0);
        f2099a = b7b0Var;
        b7b0 b7b0Var2 = new b7b0("LINE", 1);
        b = b7b0Var2;
        c = new b7b0[]{b7b0Var, b7b0Var2};
    }

    public static b7b0 valueOf(String str) {
        return (b7b0) Enum.valueOf(b7b0.class, str);
    }

    public static b7b0[] values() {
        return (b7b0[]) c.clone();
    }
}
