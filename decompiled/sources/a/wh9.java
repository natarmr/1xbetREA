package a;

import android.javax.sip.header.SubscriptionStateHeader;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wh9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wh9 f39155a;
    public static final wh9 b;
    public static final wh9 c;
    public static final wh9 d;
    public static final HashMap e;
    public static final /* synthetic */ wh9[] f;

    /* JADX INFO: Fake field, exist only in values array */
    wh9 EF1;

    static {
        wh9 wh9Var = new wh9("target", 0);
        wh9 wh9Var2 = new wh9("root", 1);
        wh9 wh9Var3 = new wh9("nth_child", 2);
        f39155a = wh9Var3;
        wh9 wh9Var4 = new wh9("nth_last_child", 3);
        wh9 wh9Var5 = new wh9("nth_of_type", 4);
        b = wh9Var5;
        wh9 wh9Var6 = new wh9("nth_last_of_type", 5);
        c = wh9Var6;
        wh9 wh9Var7 = new wh9("first_child", 6);
        wh9 wh9Var8 = new wh9("last_child", 7);
        wh9 wh9Var9 = new wh9("first_of_type", 8);
        wh9 wh9Var10 = new wh9("last_of_type", 9);
        wh9 wh9Var11 = new wh9("only_child", 10);
        wh9 wh9Var12 = new wh9("only_of_type", 11);
        wh9 wh9Var13 = new wh9("empty", 12);
        wh9 wh9Var14 = new wh9("not", 13);
        wh9 wh9Var15 = new wh9(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, 14);
        wh9 wh9Var16 = new wh9("link", 15);
        wh9 wh9Var17 = new wh9("visited", 16);
        wh9 wh9Var18 = new wh9("hover", 17);
        wh9 wh9Var19 = new wh9(SubscriptionStateHeader.ACTIVE, 18);
        wh9 wh9Var20 = new wh9("focus", 19);
        wh9 wh9Var21 = new wh9("enabled", 20);
        wh9 wh9Var22 = new wh9("disabled", 21);
        wh9 wh9Var23 = new wh9("checked", 22);
        wh9 wh9Var24 = new wh9("indeterminate", 23);
        wh9 wh9Var25 = new wh9("UNSUPPORTED", 24);
        d = wh9Var25;
        f = new wh9[]{wh9Var, wh9Var2, wh9Var3, wh9Var4, wh9Var5, wh9Var6, wh9Var7, wh9Var8, wh9Var9, wh9Var10, wh9Var11, wh9Var12, wh9Var13, wh9Var14, wh9Var15, wh9Var16, wh9Var17, wh9Var18, wh9Var19, wh9Var20, wh9Var21, wh9Var22, wh9Var23, wh9Var24, wh9Var25};
        e = new HashMap();
        for (wh9 wh9Var26 : values()) {
            if (wh9Var26 != d) {
                e.put(wh9Var26.name().replace('_', '-'), wh9Var26);
            }
        }
    }

    public static wh9 valueOf(String str) {
        return (wh9) Enum.valueOf(wh9.class, str);
    }

    public static wh9[] values() {
        return (wh9[]) f.clone();
    }
}
