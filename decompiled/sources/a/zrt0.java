package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zrt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zrt0 f44875a;
    public static final zrt0 b;
    public static final zrt0 c;
    public static final zrt0 d;
    public static final /* synthetic */ zrt0[] e;

    static {
        zrt0 zrt0Var = new zrt0("CHANGE_PHONE", 0);
        f44875a = zrt0Var;
        zrt0 zrt0Var2 = new zrt0("BINDING_PHONE", 1);
        b = zrt0Var2;
        zrt0 zrt0Var3 = new zrt0("ACTIVATE_PHONE", 2);
        c = zrt0Var3;
        zrt0 zrt0Var4 = new zrt0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = zrt0Var4;
        e = new zrt0[]{zrt0Var, zrt0Var2, zrt0Var3, zrt0Var4};
    }

    public static zrt0 valueOf(String str) {
        return (zrt0) Enum.valueOf(zrt0.class, str);
    }

    public static zrt0[] values() {
        return (zrt0[]) e.clone();
    }
}
