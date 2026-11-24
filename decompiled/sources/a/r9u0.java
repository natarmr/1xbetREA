package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9u0 f30105a;
    public static final r9u0 b;
    public static final r9u0 c;
    public static final /* synthetic */ r9u0[] d;

    static {
        r9u0 r9u0Var = new r9u0("CHECKED_SUCCESSFUL", 0);
        f30105a = r9u0Var;
        r9u0 r9u0Var2 = new r9u0("CHECKED_WRONG", 1);
        b = r9u0Var2;
        r9u0 r9u0Var3 = new r9u0("UNCHECKED", 2);
        c = r9u0Var3;
        d = new r9u0[]{r9u0Var, r9u0Var2, r9u0Var3};
    }

    public static r9u0 valueOf(String str) {
        return (r9u0) Enum.valueOf(r9u0.class, str);
    }

    public static r9u0[] values() {
        return (r9u0[]) d.clone();
    }
}
