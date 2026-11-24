package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class kfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kfg0 f18194a;
    public static final kfg0 b;
    public static final kfg0 c;
    public static final /* synthetic */ kfg0[] d;

    static {
        kfg0 kfg0Var = new kfg0("EUROPEAN", 0);
        f18194a = kfg0Var;
        kfg0 kfg0Var2 = new kfg0("AMERICAN", 1);
        b = kfg0Var2;
        kfg0 kfg0Var3 = new kfg0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = kfg0Var3;
        d = new kfg0[]{kfg0Var, kfg0Var2, kfg0Var3};
    }

    public static kfg0 valueOf(String str) {
        return (kfg0) Enum.valueOf(kfg0.class, str);
    }

    public static kfg0[] values() {
        return (kfg0[]) d.clone();
    }
}
