package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mq4 f22204a;
    public static final mq4 b;
    public static final mq4 c;
    public static final /* synthetic */ mq4[] d;

    static {
        mq4 mq4Var = new mq4("SETTINGS", 0);
        f22204a = mq4Var;
        mq4 mq4Var2 = new mq4("PUSH", 1);
        b = mq4Var2;
        mq4 mq4Var3 = new mq4("MENU", 2);
        c = mq4Var3;
        d = new mq4[]{mq4Var, mq4Var2, mq4Var3, new mq4(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3)};
    }

    public static mq4 valueOf(String str) {
        return (mq4) Enum.valueOf(mq4.class, str);
    }

    public static mq4[] values() {
        return (mq4[]) d.clone();
    }
}
