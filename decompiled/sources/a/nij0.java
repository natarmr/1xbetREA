package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nij0 f23591a;
    public static final nij0 b;
    public static final nij0 c;
    public static final nij0 d;
    public static final nij0 e;
    public static final nij0 f;
    public static final nij0 g;
    public static final /* synthetic */ nij0[] h;

    static {
        nij0 nij0Var = new nij0("DISTRIBUTION", 0);
        f23591a = nij0Var;
        nij0 nij0Var2 = new nij0("PLAYER_TURN", 1);
        b = nij0Var2;
        nij0 nij0Var3 = new nij0("DEALER_TURN", 2);
        c = nij0Var3;
        nij0 nij0Var4 = new nij0("PLAYER_WIN", 3);
        d = nij0Var4;
        nij0 nij0Var5 = new nij0("DRAW", 4);
        e = nij0Var5;
        nij0 nij0Var6 = new nij0("DEALER_WIN", 5);
        f = nij0Var6;
        nij0 nij0Var7 = new nij0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        g = nij0Var7;
        h = new nij0[]{nij0Var, nij0Var2, nij0Var3, nij0Var4, nij0Var5, nij0Var6, nij0Var7};
    }

    public static nij0 valueOf(String str) {
        return (nij0) Enum.valueOf(nij0.class, str);
    }

    public static nij0[] values() {
        return (nij0[]) h.clone();
    }
}
