package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6t0 f16005a;
    public static final j6t0 b;
    public static final /* synthetic */ j6t0[] c;

    static {
        j6t0 j6t0Var = new j6t0("FINISH", 0);
        f16005a = j6t0Var;
        j6t0 j6t0Var2 = new j6t0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
        b = j6t0Var2;
        c = new j6t0[]{j6t0Var, j6t0Var2};
    }

    public static j6t0 valueOf(String str) {
        return (j6t0) Enum.valueOf(j6t0.class, str);
    }

    public static j6t0[] values() {
        return (j6t0[]) c.clone();
    }
}
