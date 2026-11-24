package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cql0 f4800a;
    public static final cql0 b;
    public static final /* synthetic */ cql0[] c;

    static {
        cql0 cql0Var = new cql0("EXPRESS", 0);
        f4800a = cql0Var;
        cql0 cql0Var2 = new cql0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
        b = cql0Var2;
        c = new cql0[]{cql0Var, cql0Var2};
    }

    public static cql0 valueOf(String str) {
        return (cql0) Enum.valueOf(cql0.class, str);
    }

    public static cql0[] values() {
        return (cql0[]) c.clone();
    }
}
