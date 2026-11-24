package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vvi0 f38101a;
    public static final vvi0 b;
    public static final vvi0 c;
    public static final vvi0 d;
    public static final vvi0 e;
    public static final /* synthetic */ vvi0[] f;

    static {
        vvi0 vvi0Var = new vvi0("SECURITY_SETTINGS", 0);
        f38101a = vvi0Var;
        vvi0 vvi0Var2 = new vvi0("MAKE_BET_SETTINGS", 1);
        b = vvi0Var2;
        vvi0 vvi0Var3 = new vvi0("ONE_CLICK_SETTINGS", 2);
        c = vvi0Var3;
        vvi0 vvi0Var4 = new vvi0("MAILING_MANAGEMENT_SETTINGS", 3);
        d = vvi0Var4;
        vvi0 vvi0Var5 = new vvi0("SIGN_IN_HISTORY", 4);
        e = vvi0Var5;
        f = new vvi0[]{vvi0Var, vvi0Var2, vvi0Var3, vvi0Var4, vvi0Var5};
    }

    public static vvi0 valueOf(String str) {
        return (vvi0) Enum.valueOf(vvi0.class, str);
    }

    public static vvi0[] values() {
        return (vvi0[]) f.clone();
    }
}
