package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hmw f13324a;
    public static final hmw b;
    public static final hmw c;
    public static final hmw d;
    public static final /* synthetic */ hmw[] e;

    static {
        hmw hmwVar = new hmw("MALE", 0);
        f13324a = hmwVar;
        hmw hmwVar2 = new hmw("FEMALE", 1);
        b = hmwVar2;
        hmw hmwVar3 = new hmw("GELDING", 2);
        c = hmwVar3;
        hmw hmwVar4 = new hmw(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = hmwVar4;
        e = new hmw[]{hmwVar, hmwVar2, hmwVar3, hmwVar4};
    }

    public static hmw valueOf(String str) {
        return (hmw) Enum.valueOf(hmw.class, str);
    }

    public static hmw[] values() {
        return (hmw[]) e.clone();
    }
}
