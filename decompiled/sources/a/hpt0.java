package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hpt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hpt0 f13459a;
    public static final hpt0 b;
    public static final hpt0 c;
    public static final hpt0 d;
    public static final hpt0 e;
    public static final hpt0 f;
    public static final /* synthetic */ hpt0[] g;

    static {
        hpt0 hpt0Var = new hpt0("IMAGE_CAPTURE", 0);
        f13459a = hpt0Var;
        hpt0 hpt0Var2 = new hpt0("PREVIEW", 1);
        b = hpt0Var2;
        hpt0 hpt0Var3 = new hpt0("IMAGE_ANALYSIS", 2);
        c = hpt0Var3;
        hpt0 hpt0Var4 = new hpt0("VIDEO_CAPTURE", 3);
        d = hpt0Var4;
        hpt0 hpt0Var5 = new hpt0("STREAM_SHARING", 4);
        e = hpt0Var5;
        hpt0 hpt0Var6 = new hpt0("METERING_REPEATING", 5);
        f = hpt0Var6;
        g = new hpt0[]{hpt0Var, hpt0Var2, hpt0Var3, hpt0Var4, hpt0Var5, hpt0Var6};
    }

    public static hpt0 valueOf(String str) {
        return (hpt0) Enum.valueOf(hpt0.class, str);
    }

    public static hpt0[] values() {
        return (hpt0[]) g.clone();
    }
}
