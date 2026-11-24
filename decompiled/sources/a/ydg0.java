package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ydg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ydg0 f42436a;
    public static final ydg0 b;
    public static final /* synthetic */ ydg0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ydg0 EF0;

    static {
        ydg0 ydg0Var = new ydg0("AUTOMATIC", 0);
        ydg0 ydg0Var2 = new ydg0("TRUNCATE", 1);
        f42436a = ydg0Var2;
        ydg0 ydg0Var3 = new ydg0("WRITE_AHEAD_LOGGING", 2);
        b = ydg0Var3;
        c = new ydg0[]{ydg0Var, ydg0Var2, ydg0Var3};
    }

    public static ydg0 valueOf(String str) {
        return (ydg0) Enum.valueOf(ydg0.class, str);
    }

    public static ydg0[] values() {
        return (ydg0[]) c.clone();
    }
}
