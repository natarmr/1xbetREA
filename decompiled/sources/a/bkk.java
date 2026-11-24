package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bkk f2752a;
    public static final bkk b;
    public static final bkk c;
    public static final bkk d;
    public static final bkk e;
    public static final bkk f;
    public static final /* synthetic */ bkk[] g;

    static {
        bkk bkkVar = new bkk("PLAYER_ONE_TURN", 0);
        f2752a = bkkVar;
        bkk bkkVar2 = new bkk("PLAYER_TWO_TURN", 1);
        b = bkkVar2;
        bkk bkkVar3 = new bkk("PLAYER_ONE_WIN", 2);
        c = bkkVar3;
        bkk bkkVar4 = new bkk("PLAYER_TWO_WIN", 3);
        d = bkkVar4;
        bkk bkkVar5 = new bkk("DRAW", 4);
        e = bkkVar5;
        bkk bkkVar6 = new bkk(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = bkkVar6;
        g = new bkk[]{bkkVar, bkkVar2, bkkVar3, bkkVar4, bkkVar5, bkkVar6};
    }

    public static bkk valueOf(String str) {
        return (bkk) Enum.valueOf(bkk.class, str);
    }

    public static bkk[] values() {
        return (bkk[]) g.clone();
    }
}
