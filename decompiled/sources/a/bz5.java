package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bz5 f3449a;
    public static final bz5 b;
    public static final bz5 c;
    public static final /* synthetic */ bz5[] d;

    static {
        bz5 bz5Var = new bz5("LINE", 0);
        f3449a = bz5Var;
        bz5 bz5Var2 = new bz5("LIVE", 1);
        b = bz5Var2;
        bz5 bz5Var3 = new bz5("ALL", 2);
        c = bz5Var3;
        d = new bz5[]{bz5Var, bz5Var2, bz5Var3};
    }

    public static bz5 valueOf(String str) {
        return (bz5) Enum.valueOf(bz5.class, str);
    }

    public static bz5[] values() {
        return (bz5[]) d.clone();
    }
}
