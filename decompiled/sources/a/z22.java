package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z22 f43650a;
    public static final z22 b;
    public static final z22 c;
    public static final /* synthetic */ z22[] d;

    static {
        z22 z22Var = new z22("LIVE", 0);
        f43650a = z22Var;
        z22 z22Var2 = new z22("LINE", 1);
        b = z22Var2;
        z22 z22Var3 = new z22("HISTORY", 2);
        c = z22Var3;
        d = new z22[]{z22Var, z22Var2, z22Var3};
    }

    public static z22 valueOf(String str) {
        return (z22) Enum.valueOf(z22.class, str);
    }

    public static z22[] values() {
        return (z22[]) d.clone();
    }
}
