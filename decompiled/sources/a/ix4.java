package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ix4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ix4 f15523a;
    public static final ix4 b;
    public static final ix4 c;
    public static final /* synthetic */ ix4[] d;

    static {
        ix4 ix4Var = new ix4("WAITING", 0);
        f15523a = ix4Var;
        ix4 ix4Var2 = new ix4("ACTIVATED", 1);
        b = ix4Var2;
        ix4 ix4Var3 = new ix4("CANCELED", 2);
        c = ix4Var3;
        d = new ix4[]{ix4Var, ix4Var2, ix4Var3};
    }

    public static ix4 valueOf(String str) {
        return (ix4) Enum.valueOf(ix4.class, str);
    }

    public static ix4[] values() {
        return (ix4[]) d.clone();
    }
}
