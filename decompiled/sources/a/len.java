package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class len {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final len f19911a;
    public static final len b;
    public static final len c;
    public static final len d;
    public static final len e;
    public static final len f;
    public static final len g;
    public static final len h;
    public static final len i;
    public static final len j;
    public static final /* synthetic */ len[] k;

    static {
        len lenVar = new len("DISTRIBUTION_CARDS", 0);
        f19911a = lenVar;
        len lenVar2 = new len("REBOUND_ROUND_END", 1);
        b = lenVar2;
        len lenVar3 = new len("TAKE_ROUND_END", 2);
        c = lenVar3;
        len lenVar4 = new len("SET_CARDS", 3);
        d = lenVar4;
        len lenVar5 = new len("NEXT_STEP", 4);
        e = lenVar5;
        len lenVar6 = new len("STEP_NUMBER", 5);
        f = lenVar6;
        len lenVar7 = new len("PLAYER_ONE_WIN", 6);
        g = lenVar7;
        len lenVar8 = new len("PLAYER_TWO_WIN", 7);
        h = lenVar8;
        len lenVar9 = new len("DRAW", 8);
        i = lenVar9;
        len lenVar10 = new len(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9);
        j = lenVar10;
        k = new len[]{lenVar, lenVar2, lenVar3, lenVar4, lenVar5, lenVar6, lenVar7, lenVar8, lenVar9, lenVar10};
    }

    public static len valueOf(String str) {
        return (len) Enum.valueOf(len.class, str);
    }

    public static len[] values() {
        return (len[]) k.clone();
    }
}
