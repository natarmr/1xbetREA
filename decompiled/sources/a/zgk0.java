package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zgk0 f44349a;
    public static final zgk0 b;
    public static final zgk0 c;
    public static final /* synthetic */ zgk0[] d;

    static {
        zgk0 zgk0Var = new zgk0("SELECTED", 0);
        f44349a = zgk0Var;
        zgk0 zgk0Var2 = new zgk0("ERROR", 1);
        b = zgk0Var2;
        zgk0 zgk0Var3 = new zgk0("DEFAULT", 2);
        c = zgk0Var3;
        d = new zgk0[]{zgk0Var, zgk0Var2, zgk0Var3};
    }

    public static zgk0 valueOf(String str) {
        return (zgk0) Enum.valueOf(zgk0.class, str);
    }

    public static zgk0[] values() {
        return (zgk0[]) d.clone();
    }
}
