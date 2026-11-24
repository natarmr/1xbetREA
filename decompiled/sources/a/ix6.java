package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ix6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ix6 f15526a;
    public static final ix6 b;
    public static final ix6 c;
    public static final /* synthetic */ ix6[] d;

    static {
        ix6 ix6Var = new ix6("Primary", 0);
        f15526a = ix6Var;
        ix6 ix6Var2 = new ix6("Error", 1);
        b = ix6Var2;
        ix6 ix6Var3 = new ix6("Disabled", 2);
        c = ix6Var3;
        d = new ix6[]{ix6Var, ix6Var2, ix6Var3};
    }

    public static ix6 valueOf(String str) {
        return (ix6) Enum.valueOf(ix6.class, str);
    }

    public static ix6[] values() {
        return (ix6[]) d.clone();
    }
}
