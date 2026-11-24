package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class eeu0 {
    public static final deu0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f7691a;
    public static final eeu0 b;
    public static final /* synthetic */ eeu0[] c;

    static {
        eeu0 eeu0Var = new eeu0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = eeu0Var;
        c = new eeu0[]{eeu0Var, new eeu0("SUM_SUM", 1), new eeu0("SUM_MULT", 2), new eeu0("MUTL_SUM", 3), new eeu0("MULT_MULT", 4)};
        Companion = new deu0();
        f7691a = maz.a(wez.f39042a, new o1u0((byte) 14));
    }

    public static eeu0 valueOf(String str) {
        return (eeu0) Enum.valueOf(eeu0.class, str);
    }

    public static eeu0[] values() {
        return (eeu0[]) c.clone();
    }
}
