package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hx6 f13799a;
    public static final hx6 b;
    public static final hx6 c;
    public static final /* synthetic */ hx6[] d;

    static {
        hx6 hx6Var = new hx6("Primary", 0);
        f13799a = hx6Var;
        hx6 hx6Var2 = new hx6("Error", 1);
        b = hx6Var2;
        hx6 hx6Var3 = new hx6("Disabled", 2);
        c = hx6Var3;
        d = new hx6[]{hx6Var, hx6Var2, hx6Var3};
    }

    public static hx6 valueOf(String str) {
        return (hx6) Enum.valueOf(hx6.class, str);
    }

    public static hx6[] values() {
        return (hx6[]) d.clone();
    }
}
