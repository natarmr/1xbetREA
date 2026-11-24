package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hys0 f13875a;
    public static final hys0 b;
    public static final hys0 c;
    public static final /* synthetic */ hys0[] d;

    static {
        hys0 hys0Var = new hys0("FLEXIBLE_LOWER", 0);
        f13875a = hys0Var;
        hys0 hys0Var2 = new hys0("FLEXIBLE_UPPER", 1);
        b = hys0Var2;
        hys0 hys0Var3 = new hys0("INFLEXIBLE", 2);
        c = hys0Var3;
        d = new hys0[]{hys0Var, hys0Var2, hys0Var3};
    }

    public static hys0 valueOf(String str) {
        return (hys0) Enum.valueOf(hys0.class, str);
    }

    public static hys0[] values() {
        return (hys0[]) d.clone();
    }
}
