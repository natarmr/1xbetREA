package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3h0 f12386a;
    public static final h3h0 b;
    public static final /* synthetic */ h3h0[] c;

    static {
        h3h0 h3h0Var = new h3h0("SPORT_COLOR", 0);
        f12386a = h3h0Var;
        h3h0 h3h0Var2 = new h3h0("DEFAULT", 1);
        b = h3h0Var2;
        c = new h3h0[]{h3h0Var, h3h0Var2};
    }

    public static h3h0 valueOf(String str) {
        return (h3h0) Enum.valueOf(h3h0.class, str);
    }

    public static h3h0[] values() {
        return (h3h0[]) c.clone();
    }
}
