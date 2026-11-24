package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf60 f11194a;
    public static final gf60 b;
    public static final gf60 c;
    public static final /* synthetic */ gf60[] d;

    static {
        gf60 gf60Var = new gf60("NATIVE_SSO", 0);
        f11194a = gf60Var;
        gf60 gf60Var2 = new gf60("WEBVIEW_OAUTH", 1);
        b = gf60Var2;
        gf60 gf60Var3 = new gf60("ANY", 2);
        c = gf60Var3;
        d = new gf60[]{gf60Var, gf60Var2, gf60Var3};
    }

    public static gf60 valueOf(String str) {
        return (gf60) Enum.valueOf(gf60.class, str);
    }

    public static gf60[] values() {
        return (gf60[]) d.clone();
    }
}
