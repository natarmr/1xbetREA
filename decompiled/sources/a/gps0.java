package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gps0 f11699a;
    public static final gps0 b;
    public static final gps0 c;
    public static final /* synthetic */ gps0[] d;

    static {
        gps0 gps0Var = new gps0("ContinueTraversal", 0);
        f11699a = gps0Var;
        gps0 gps0Var2 = new gps0("SkipSubtreeAndContinueTraversal", 1);
        b = gps0Var2;
        gps0 gps0Var3 = new gps0("CancelTraversal", 2);
        c = gps0Var3;
        d = new gps0[]{gps0Var, gps0Var2, gps0Var3};
    }

    public static gps0 valueOf(String str) {
        return (gps0) Enum.valueOf(gps0.class, str);
    }

    public static gps0[] values() {
        return (gps0[]) d.clone();
    }
}
