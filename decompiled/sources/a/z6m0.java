package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z6m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z6m0 f43877a;
    public static final z6m0 b;
    public static final z6m0 c;
    public static final /* synthetic */ z6m0[] d;

    static {
        z6m0 z6m0Var = new z6m0("YELLOW_CARDS", 0);
        f43877a = z6m0Var;
        z6m0 z6m0Var2 = new z6m0("RED_CARDS", 1);
        b = z6m0Var2;
        z6m0 z6m0Var3 = new z6m0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = z6m0Var3;
        d = new z6m0[]{z6m0Var, z6m0Var2, z6m0Var3};
    }

    public static z6m0 valueOf(String str) {
        return (z6m0) Enum.valueOf(z6m0.class, str);
    }

    public static z6m0[] values() {
        return (z6m0[]) d.clone();
    }
}
