package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vq4 f37837a;
    public static final vq4 b;
    public static final vq4 c;
    public static final vq4 d;
    public static final vq4 e;
    public static final vq4 f;
    public static final vq4 g;
    public static final /* synthetic */ vq4[] h;

    static {
        vq4 vq4Var = new vq4(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f37837a = vq4Var;
        vq4 vq4Var2 = new vq4("RESTORE_PASSWORD", 1);
        b = vq4Var2;
        vq4 vq4Var3 = new vq4("MIGRATION", 2);
        c = vq4Var3;
        vq4 vq4Var4 = new vq4("CASH_OUT", 3);
        d = vq4Var4;
        vq4 vq4Var5 = new vq4("NEW_PLACE_LOGIN", 4);
        e = vq4Var5;
        vq4 vq4Var6 = new vq4("CONFIRM_BY_AUTHENTICATOR", 5);
        f = vq4Var6;
        vq4 vq4Var7 = new vq4("CHANGE_PASSWORD", 6);
        g = vq4Var7;
        h = new vq4[]{vq4Var, vq4Var2, vq4Var3, vq4Var4, vq4Var5, vq4Var6, vq4Var7};
    }

    public static vq4 valueOf(String str) {
        return (vq4) Enum.valueOf(vq4.class, str);
    }

    public static vq4[] values() {
        return (vq4[]) h.clone();
    }
}
