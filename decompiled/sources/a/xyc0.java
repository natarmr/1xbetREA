package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xyc0 f41702a;
    public static final xyc0 b;
    public static final /* synthetic */ xyc0[] c;

    static {
        xyc0 xyc0Var = new xyc0("Primary", 0);
        f41702a = xyc0Var;
        xyc0 xyc0Var2 = new xyc0("Disabled", 1);
        b = xyc0Var2;
        c = new xyc0[]{xyc0Var, xyc0Var2};
    }

    public static xyc0 valueOf(String str) {
        return (xyc0) Enum.valueOf(xyc0.class, str);
    }

    public static xyc0[] values() {
        return (xyc0[]) c.clone();
    }
}
