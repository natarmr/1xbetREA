package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mij0 f21849a;
    public static final mij0 b;
    public static final mij0 c;
    public static final /* synthetic */ mij0[] d;

    static {
        mij0 mij0Var = new mij0("CUSTOM_CHAMP", 0);
        f21849a = mij0Var;
        mij0 mij0Var2 = new mij0("DEFAULT_CHAMP", 1);
        b = mij0Var2;
        mij0 mij0Var3 = new mij0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = mij0Var3;
        d = new mij0[]{mij0Var, mij0Var2, mij0Var3};
    }

    public static mij0 valueOf(String str) {
        return (mij0) Enum.valueOf(mij0.class, str);
    }

    public static mij0[] values() {
        return (mij0[]) d.clone();
    }
}
