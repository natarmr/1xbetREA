package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w270 f38437a;
    public static final w270 b;
    public static final w270 c;
    public static final /* synthetic */ w270[] d;

    static {
        w270 w270Var = new w270("NAME", 0);
        f38437a = w270Var;
        w270 w270Var2 = new w270("MAX_WIN_COEFF_ASC", 1);
        b = w270Var2;
        w270 w270Var3 = new w270("MAX_WIN_COEFF_DESC", 2);
        c = w270Var3;
        d = new w270[]{w270Var, w270Var2, w270Var3};
    }

    public static w270 valueOf(String str) {
        return (w270) Enum.valueOf(w270.class, str);
    }

    public static w270[] values() {
        return (w270[]) d.clone();
    }
}
