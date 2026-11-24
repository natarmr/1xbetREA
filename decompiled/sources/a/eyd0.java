package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class eyd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eyd0 f8623a;
    public static final eyd0 b;
    public static final eyd0 c;
    public static final eyd0 d;
    public static final /* synthetic */ eyd0[] e;

    static {
        eyd0 eyd0Var = new eyd0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f8623a = eyd0Var;
        eyd0 eyd0Var2 = new eyd0("PICKED", 1);
        b = eyd0Var2;
        eyd0 eyd0Var3 = new eyd0("BANNED", 2);
        c = eyd0Var3;
        eyd0 eyd0Var4 = new eyd0("DECIDING", 3);
        d = eyd0Var4;
        e = new eyd0[]{eyd0Var, eyd0Var2, eyd0Var3, eyd0Var4};
    }

    public static eyd0 valueOf(String str) {
        return (eyd0) Enum.valueOf(eyd0.class, str);
    }

    public static eyd0[] values() {
        return (eyd0[]) e.clone();
    }
}
