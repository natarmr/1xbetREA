package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hui0 f13682a;
    public static final hui0 b;
    public static final /* synthetic */ hui0[] c;

    static {
        hui0 hui0Var = new hui0("SHOW_ALL", 0);
        f13682a = hui0Var;
        hui0 hui0Var2 = new hui0("RESET_SETTING", 1);
        b = hui0Var2;
        c = new hui0[]{hui0Var, hui0Var2};
    }

    public static hui0 valueOf(String str) {
        return (hui0) Enum.valueOf(hui0.class, str);
    }

    public static hui0[] values() {
        return (hui0[]) c.clone();
    }
}
