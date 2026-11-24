package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rah f30132a;
    public static final rah b;
    public static final rah c;
    public static final rah d;
    public static final /* synthetic */ rah[] e;

    static {
        rah rahVar = new rah("PLAYER_ONE_WIN", 0);
        f30132a = rahVar;
        rah rahVar2 = new rah("PLAYER_TWO_WIN", 1);
        b = rahVar2;
        rah rahVar3 = new rah("DRAW", 2);
        c = rahVar3;
        rah rahVar4 = new rah(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = rahVar4;
        e = new rah[]{rahVar, rahVar2, rahVar3, rahVar4};
    }

    public static rah valueOf(String str) {
        return (rah) Enum.valueOf(rah.class, str);
    }

    public static rah[] values() {
        return (rah[]) e.clone();
    }
}
