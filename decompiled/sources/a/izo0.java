package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class izo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final izo0 f15644a;
    public static final izo0 b;
    public static final izo0 c;
    public static final /* synthetic */ izo0[] d;

    static {
        izo0 izo0Var = new izo0("NO_ERROR", 0);
        f15644a = izo0Var;
        izo0 izo0Var2 = new izo0("CONTENT_ERROR", 1);
        b = izo0Var2;
        izo0 izo0Var3 = new izo0("CONTENT_EMPTY_ERROR", 2);
        c = izo0Var3;
        d = new izo0[]{izo0Var, izo0Var2, izo0Var3};
    }

    public static izo0 valueOf(String str) {
        return (izo0) Enum.valueOf(izo0.class, str);
    }

    public static izo0[] values() {
        return (izo0[]) d.clone();
    }
}
