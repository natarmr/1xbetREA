package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class eix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eix0 f7881a;
    public static final eix0 b;
    public static final eix0 c;
    public static final /* synthetic */ eix0[] d;

    static {
        eix0 eix0Var = new eix0("UNCOMPRESSED", 0);
        f7881a = eix0Var;
        eix0 eix0Var2 = new eix0("COMPRESSED", 1);
        b = eix0Var2;
        eix0 eix0Var3 = new eix0("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        c = eix0Var3;
        d = new eix0[]{eix0Var, eix0Var2, eix0Var3};
    }

    public static eix0[] values() {
        return (eix0[]) d.clone();
    }
}
