package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class umi0 {
    public static final tmi0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f35921a;
    public static final umi0 b;
    public static final umi0 c;
    public static final /* synthetic */ umi0[] d;

    static {
        umi0 umi0Var = new umi0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = umi0Var;
        umi0 umi0Var2 = new umi0("READY", 1);
        c = umi0Var2;
        d = new umi0[]{umi0Var, umi0Var2};
        Companion = new tmi0();
        f35921a = maz.a(wez.f39042a, new gei0((byte) 12));
    }

    public static umi0 valueOf(String str) {
        return (umi0) Enum.valueOf(umi0.class, str);
    }

    public static umi0[] values() {
        return (umi0[]) d.clone();
    }
}
