package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rvd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rvd0 f31162a;
    public static final rvd0 b;
    public static final rvd0 c;
    public static final /* synthetic */ rvd0[] d;

    static {
        rvd0 rvd0Var = new rvd0("ATTACK", 0);
        f31162a = rvd0Var;
        rvd0 rvd0Var2 = new rvd0("DEFEND", 1);
        b = rvd0Var2;
        rvd0 rvd0Var3 = new rvd0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = rvd0Var3;
        d = new rvd0[]{rvd0Var, rvd0Var2, rvd0Var3};
    }

    public static rvd0 valueOf(String str) {
        return (rvd0) Enum.valueOf(rvd0.class, str);
    }

    public static rvd0[] values() {
        return (rvd0[]) d.clone();
    }
}
