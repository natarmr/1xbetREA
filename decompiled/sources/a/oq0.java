package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class oq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oq0 f25665a;
    public static final oq0 b;
    public static final /* synthetic */ oq0[] c;

    static {
        oq0 oq0Var = new oq0("SETTING_CELL", 0);
        f25665a = oq0Var;
        oq0 oq0Var2 = new oq0("CHIPS", 1);
        b = oq0Var2;
        c = new oq0[]{oq0Var, oq0Var2};
    }

    public static oq0 valueOf(String str) {
        return (oq0) Enum.valueOf(oq0.class, str);
    }

    public static oq0[] values() {
        return (oq0[]) c.clone();
    }
}
