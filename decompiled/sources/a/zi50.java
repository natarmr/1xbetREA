package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zi50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi50 f44426a;
    public static final zi50 b;
    public static final zi50 c;
    public static final /* synthetic */ zi50[] d;

    static {
        zi50 zi50Var = new zi50("None", 0);
        f44426a = zi50Var;
        zi50 zi50Var2 = new zi50("Up", 1);
        b = zi50Var2;
        zi50 zi50Var3 = new zi50("Down", 2);
        c = zi50Var3;
        d = new zi50[]{zi50Var, zi50Var2, zi50Var3};
    }

    public static zi50 valueOf(String str) {
        return (zi50) Enum.valueOf(zi50.class, str);
    }

    public static zi50[] values() {
        return (zi50[]) d.clone();
    }
}
