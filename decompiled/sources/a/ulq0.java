package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ulq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ulq0 f35886a;
    public static final ulq0 b;
    public static final /* synthetic */ ulq0[] c;

    static {
        ulq0 ulq0Var = new ulq0("ON", 0);
        f35886a = ulq0Var;
        ulq0 ulq0Var2 = new ulq0("OFF", 1);
        b = ulq0Var2;
        c = new ulq0[]{ulq0Var, ulq0Var2};
    }

    public static ulq0 valueOf(String str) {
        return (ulq0) Enum.valueOf(ulq0.class, str);
    }

    public static ulq0[] values() {
        return (ulq0[]) c.clone();
    }
}
