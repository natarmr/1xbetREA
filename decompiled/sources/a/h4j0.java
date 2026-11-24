package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4j0 f12435a;
    public static final h4j0 b;
    public static final h4j0 c;
    public static final /* synthetic */ h4j0[] d;

    static {
        h4j0 h4j0Var = new h4j0("FIRST", 0);
        f12435a = h4j0Var;
        h4j0 h4j0Var2 = new h4j0("SECOND", 1);
        b = h4j0Var2;
        h4j0 h4j0Var3 = new h4j0("THIRD", 2);
        c = h4j0Var3;
        d = new h4j0[]{h4j0Var, h4j0Var2, h4j0Var3};
    }

    public static h4j0 valueOf(String str) {
        return (h4j0) Enum.valueOf(h4j0.class, str);
    }

    public static h4j0[] values() {
        return (h4j0[]) d.clone();
    }
}
