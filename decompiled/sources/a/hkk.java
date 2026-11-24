package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class hkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hkk f13213a;
    public static final hkk b;
    public static final hkk c;
    public static final hkk d;
    public static final hkk e;
    public static final hkk f;
    public static final hkk g;
    public static final hkk h;
    public static final /* synthetic */ hkk[] i;

    static {
        hkk hkkVar = new hkk("GAME_START", 0);
        f13213a = hkkVar;
        hkk hkkVar2 = new hkk("FIRST_ROLL_DICE", 1);
        b = hkkVar2;
        hkk hkkVar3 = new hkk("SECOND_ROLL_DICE", 2);
        c = hkkVar3;
        hkk hkkVar4 = new hkk("THIRD_ROLL_DICE", 3);
        d = hkkVar4;
        hkk hkkVar5 = new hkk("PLAYER_ONE_WIN", 4);
        e = hkkVar5;
        hkk hkkVar6 = new hkk("PLAYER_TWO_WIN", 5);
        f = hkkVar6;
        hkk hkkVar7 = new hkk("DRAW", 6);
        g = hkkVar7;
        hkk hkkVar8 = new hkk(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        h = hkkVar8;
        i = new hkk[]{hkkVar, hkkVar2, hkkVar3, hkkVar4, hkkVar5, hkkVar6, hkkVar7, hkkVar8};
    }

    public static hkk valueOf(String str) {
        return (hkk) Enum.valueOf(hkk.class, str);
    }

    public static hkk[] values() {
        return (hkk[]) i.clone();
    }
}
