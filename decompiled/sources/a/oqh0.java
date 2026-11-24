package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class oqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oqh0 f25688a;
    public static final oqh0 b;
    public static final /* synthetic */ oqh0[] c;

    static {
        oqh0 oqh0Var = new oqh0("PROFILE", 0);
        f25688a = oqh0Var;
        oqh0 oqh0Var2 = new oqh0("SESSION", 1);
        b = oqh0Var2;
        c = new oqh0[]{oqh0Var, oqh0Var2};
    }

    public static oqh0 valueOf(String str) {
        return (oqh0) Enum.valueOf(oqh0.class, str);
    }

    public static oqh0[] values() {
        return (oqh0[]) c.clone();
    }
}
