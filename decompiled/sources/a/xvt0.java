package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xvt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xvt0 f41578a;
    public static final xvt0 b;
    public static final /* synthetic */ xvt0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    xvt0 EF1;

    static {
        xvt0 xvt0Var = new xvt0("NOTIFY", 0);
        xvt0 xvt0Var2 = new xvt0("FRIENDS", 1);
        xvt0 xvt0Var3 = new xvt0("PHOTOS", 2);
        xvt0 xvt0Var4 = new xvt0("AUDIO", 3);
        xvt0 xvt0Var5 = new xvt0("VIDEO", 4);
        xvt0 xvt0Var6 = new xvt0("STORIES", 5);
        xvt0 xvt0Var7 = new xvt0("PAGES", 6);
        xvt0 xvt0Var8 = new xvt0(CommonConstant.RETKEY.STATUS, 7);
        xvt0 xvt0Var9 = new xvt0("NOTES", 8);
        xvt0 xvt0Var10 = new xvt0("MESSAGES", 9);
        xvt0 xvt0Var11 = new xvt0("WALL", 10);
        xvt0 xvt0Var12 = new xvt0("ADS", 11);
        xvt0 xvt0Var13 = new xvt0("OFFLINE", 12);
        f41578a = xvt0Var13;
        xvt0 xvt0Var14 = new xvt0("DOCS", 13);
        xvt0 xvt0Var15 = new xvt0("GROUPS", 14);
        xvt0 xvt0Var16 = new xvt0("NOTIFICATIONS", 15);
        xvt0 xvt0Var17 = new xvt0("STATS", 16);
        xvt0 xvt0Var18 = new xvt0(CommonConstant.RETKEY.EMAIL, 17);
        b = xvt0Var18;
        c = new xvt0[]{xvt0Var, xvt0Var2, xvt0Var3, xvt0Var4, xvt0Var5, xvt0Var6, xvt0Var7, xvt0Var8, xvt0Var9, xvt0Var10, xvt0Var11, xvt0Var12, xvt0Var13, xvt0Var14, xvt0Var15, xvt0Var16, xvt0Var17, xvt0Var18, new xvt0("MARKET", 18), new xvt0("PHONE", 19)};
    }

    public static xvt0 valueOf(String str) {
        return (xvt0) Enum.valueOf(xvt0.class, str);
    }

    public static xvt0[] values() {
        return (xvt0[]) c.clone();
    }
}
