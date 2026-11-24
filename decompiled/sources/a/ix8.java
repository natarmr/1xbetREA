package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ix8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ix8 f15529a;
    public static final ix8 b;
    public static final ix8 c;
    public static final /* synthetic */ ix8[] d;

    static {
        ix8 ix8Var = new ix8("SIMPLE", 0);
        f15529a = ix8Var;
        ix8 ix8Var2 = new ix8("PICTURE", 1);
        b = ix8Var2;
        ix8 ix8Var3 = new ix8("ONE_X_LIVE", 2);
        c = ix8Var3;
        d = new ix8[]{ix8Var, ix8Var2, ix8Var3};
    }

    public static ix8 valueOf(String str) {
        return (ix8) Enum.valueOf(ix8.class, str);
    }

    public static ix8[] values() {
        return (ix8[]) d.clone();
    }
}
