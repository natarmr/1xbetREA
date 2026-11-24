package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gx6 f12062a;
    public static final gx6 b;
    public static final gx6 c;
    public static final /* synthetic */ gx6[] d;

    static {
        gx6 gx6Var = new gx6("Primary", 0);
        f12062a = gx6Var;
        gx6 gx6Var2 = new gx6("Error", 1);
        b = gx6Var2;
        gx6 gx6Var3 = new gx6("Disabled", 2);
        c = gx6Var3;
        d = new gx6[]{gx6Var, gx6Var2, gx6Var3};
    }

    public static gx6 valueOf(String str) {
        return (gx6) Enum.valueOf(gx6.class, str);
    }

    public static gx6[] values() {
        return (gx6[]) d.clone();
    }
}
