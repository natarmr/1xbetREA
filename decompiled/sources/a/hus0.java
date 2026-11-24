package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hus0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hus0 f13697a;
    public static final hus0 b;
    public static final hus0 c;
    public static final hus0 d;
    public static final /* synthetic */ hus0[] e;

    static {
        hus0 hus0Var = new hus0("TWENTY_ONE", 0);
        f13697a = hus0Var;
        hus0 hus0Var2 = new hus0("TWENTY_ONE_CLASSIC", 1);
        b = hus0Var2;
        hus0 hus0Var3 = new hus0("TWENTY_ONE_DOTA", 2);
        c = hus0Var3;
        hus0 hus0Var4 = new hus0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = hus0Var4;
        e = new hus0[]{hus0Var, hus0Var2, hus0Var3, hus0Var4};
    }

    public static hus0 valueOf(String str) {
        return (hus0) Enum.valueOf(hus0.class, str);
    }

    public static hus0[] values() {
        return (hus0[]) e.clone();
    }
}
