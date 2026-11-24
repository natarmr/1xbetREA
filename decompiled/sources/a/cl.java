package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cl f4533a;
    public static final cl b;
    public static final cl c;
    public static final cl d;
    public static final cl e;
    public static final cl f;
    public static final /* synthetic */ cl[] g;

    static {
        cl clVar = new cl(CommonConstant.RETKEY.EMAIL, 0);
        f4533a = clVar;
        cl clVar2 = new cl("SMS", 1);
        b = clVar2;
        cl clVar3 = new cl("VOICE_SMS", 2);
        c = clVar3;
        cl clVar4 = new cl("TELEGRAM", 3);
        d = clVar4;
        cl clVar5 = new cl("FLASH_CALL", 4);
        e = clVar5;
        cl clVar6 = new cl(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = clVar6;
        g = new cl[]{clVar, clVar2, clVar3, clVar4, clVar5, clVar6};
    }

    public static cl valueOf(String str) {
        return (cl) Enum.valueOf(cl.class, str);
    }

    public static cl[] values() {
        return (cl[]) g.clone();
    }
}
