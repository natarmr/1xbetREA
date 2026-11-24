package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class eed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eed0 f7667a;
    public static final eed0 b;
    public static final /* synthetic */ eed0[] c;

    static {
        eed0 eed0Var = new eed0("EVENTS", 0);
        f7667a = eed0Var;
        eed0 eed0Var2 = new eed0("FAVORITES", 1);
        b = eed0Var2;
        c = new eed0[]{eed0Var, eed0Var2};
    }

    public static eed0 valueOf(String str) {
        return (eed0) Enum.valueOf(eed0.class, str);
    }

    public static eed0[] values() {
        return (eed0[]) c.clone();
    }
}
