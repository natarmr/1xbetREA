package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class py20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final py20 f27786a;
    public static final py20 b;
    public static final py20 c;
    public static final /* synthetic */ py20[] d;

    static {
        py20 py20Var = new py20("COLLAPSED", 0);
        f27786a = py20Var;
        py20 py20Var2 = new py20("EXPANDED", 1);
        b = py20Var2;
        py20 py20Var3 = new py20("FULL", 2);
        c = py20Var3;
        d = new py20[]{py20Var, py20Var2, py20Var3};
    }

    public static py20 valueOf(String str) {
        return (py20) Enum.valueOf(py20.class, str);
    }

    public static py20[] values() {
        return (py20[]) d.clone();
    }
}
