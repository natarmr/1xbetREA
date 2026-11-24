package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zx9 f45147a;
    public static final zx9 b;
    public static final zx9 c;
    public static final zx9 d;
    public static final zx9 e;
    public static final zx9 f;
    public static final zx9 g;
    public static final /* synthetic */ zx9[] h;

    static {
        zx9 zx9Var = new zx9(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f45147a = zx9Var;
        zx9 zx9Var2 = new zx9("INACTIVE", 1);
        b = zx9Var2;
        zx9 zx9Var3 = new zx9("SCANNING", 2);
        c = zx9Var3;
        zx9 zx9Var4 = new zx9("PASSIVE_FOCUSED", 3);
        d = zx9Var4;
        zx9 zx9Var5 = new zx9("PASSIVE_NOT_FOCUSED", 4);
        e = zx9Var5;
        zx9 zx9Var6 = new zx9("LOCKED_FOCUSED", 5);
        f = zx9Var6;
        zx9 zx9Var7 = new zx9("LOCKED_NOT_FOCUSED", 6);
        g = zx9Var7;
        h = new zx9[]{zx9Var, zx9Var2, zx9Var3, zx9Var4, zx9Var5, zx9Var6, zx9Var7};
    }

    public static zx9 valueOf(String str) {
        return (zx9) Enum.valueOf(zx9.class, str);
    }

    public static zx9[] values() {
        return (zx9[]) h.clone();
    }
}
