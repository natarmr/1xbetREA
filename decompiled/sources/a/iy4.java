package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iy4 implements jvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iy4 f15571a;
    public static final iy4 b;
    public static final iy4 c;
    public static final iy4 d;
    public static final /* synthetic */ iy4[] e;

    static {
        iy4 iy4Var = new iy4("NONE", 0);
        f15571a = iy4Var;
        iy4 iy4Var2 = new iy4("AUTOBET_WAITING", 1);
        b = iy4Var2;
        iy4 iy4Var3 = new iy4("AUTOBET_DROPPED", 2);
        c = iy4Var3;
        iy4 iy4Var4 = new iy4("AUTOBET_ACTIVATED", 3);
        d = iy4Var4;
        e = new iy4[]{iy4Var, iy4Var2, iy4Var3, iy4Var4};
    }

    public static iy4 valueOf(String str) {
        return (iy4) Enum.valueOf(iy4.class, str);
    }

    public static iy4[] values() {
        return (iy4[]) e.clone();
    }
}
