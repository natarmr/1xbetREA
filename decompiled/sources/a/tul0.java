package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tul0 f34557a;
    public static final tul0 b;
    public static final tul0 c;
    public static final /* synthetic */ tul0[] d;

    static {
        tul0 tul0Var = new tul0("STABLE", 0);
        f34557a = tul0Var;
        tul0 tul0Var2 = new tul0("OPTIMAL", 1);
        b = tul0Var2;
        tul0 tul0Var3 = new tul0("UNIQUE", 2);
        c = tul0Var3;
        d = new tul0[]{tul0Var, tul0Var2, tul0Var3};
    }

    public static tul0 valueOf(String str) {
        return (tul0) Enum.valueOf(tul0.class, str);
    }

    public static tul0[] values() {
        return (tul0[]) d.clone();
    }
}
