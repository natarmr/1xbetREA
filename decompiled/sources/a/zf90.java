package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zf90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zf90 f44292a;
    public static final zf90 b;
    public static final zf90 c;
    public static final zf90 d;
    public static final /* synthetic */ zf90[] e;

    static {
        zf90 zf90Var = new zf90("FIRST_TEAM", 0);
        f44292a = zf90Var;
        zf90 zf90Var2 = new zf90("SECOND_TEAM", 1);
        b = zf90Var2;
        zf90 zf90Var3 = new zf90("DRAW", 2);
        c = zf90Var3;
        zf90 zf90Var4 = new zf90(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = zf90Var4;
        e = new zf90[]{zf90Var, zf90Var2, zf90Var3, zf90Var4};
    }

    public static zf90 valueOf(String str) {
        return (zf90) Enum.valueOf(zf90.class, str);
    }

    public static zf90[] values() {
        return (zf90[]) e.clone();
    }
}
