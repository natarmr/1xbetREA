package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e6e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e6e0 f7279a;
    public static final e6e0 b;
    public static final e6e0 c;
    public static final /* synthetic */ e6e0[] d;

    static {
        e6e0 e6e0Var = new e6e0("UP", 0);
        f7279a = e6e0Var;
        e6e0 e6e0Var2 = new e6e0("DOWN", 1);
        b = e6e0Var2;
        e6e0 e6e0Var3 = new e6e0("NOT_CHANGE", 2);
        c = e6e0Var3;
        d = new e6e0[]{e6e0Var, e6e0Var2, e6e0Var3};
    }

    public static e6e0 valueOf(String str) {
        return (e6e0) Enum.valueOf(e6e0.class, str);
    }

    public static e6e0[] values() {
        return (e6e0[]) d.clone();
    }
}
