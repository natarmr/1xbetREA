package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lme0 f6522a;
    public static final dql0 b;
    public static final dql0 c;
    public static final /* synthetic */ dql0[] d;

    static {
        dql0 dql0Var = new dql0("EXPRESS", 0);
        b = dql0Var;
        dql0 dql0Var2 = new dql0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
        c = dql0Var2;
        d = new dql0[]{dql0Var, dql0Var2};
        f6522a = new lme0((byte) 27);
    }

    public static dql0 valueOf(String str) {
        return (dql0) Enum.valueOf(dql0.class, str);
    }

    public static dql0[] values() {
        return (dql0[]) d.clone();
    }
}
