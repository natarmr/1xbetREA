package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lx6 f20799a;
    public static final lx6 b;
    public static final lx6 c;
    public static final /* synthetic */ lx6[] d;

    static {
        lx6 lx6Var = new lx6("Primary", 0);
        f20799a = lx6Var;
        lx6 lx6Var2 = new lx6("Error", 1);
        b = lx6Var2;
        lx6 lx6Var3 = new lx6("Disabled", 2);
        c = lx6Var3;
        d = new lx6[]{lx6Var, lx6Var2, lx6Var3};
    }

    public static lx6 valueOf(String str) {
        return (lx6) Enum.valueOf(lx6.class, str);
    }

    public static lx6[] values() {
        return (lx6[]) d.clone();
    }
}
