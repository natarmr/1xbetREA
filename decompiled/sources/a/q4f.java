package a;

import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q4f implements Serializable {
    public static final /* synthetic */ q4f[] A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nwd f28094a;
    public static final q4f b;
    public static final q4f c;
    public static final q4f d;
    public static final q4f e;
    public static final q4f f;
    public static final q4f g;
    public static final q4f h;
    public static final q4f i;
    public static final q4f j;
    public static final q4f k;
    public static final q4f l;
    public static final q4f m;
    public static final q4f n;
    public static final q4f o;
    public static final q4f p;
    public static final q4f q;
    public static final q4f r;
    public static final q4f s;
    public static final q4f t;
    public static final q4f u;
    public static final q4f v;
    public static final q4f w;
    public static final q4f x;
    public static final q4f y;
    public static final q4f z;

    static {
        q4f q4fVar = new q4f(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = q4fVar;
        q4f q4fVar2 = new q4f("SINGLE", 1);
        c = q4fVar2;
        q4f q4fVar3 = new q4f("EXPRESS", 2);
        d = q4fVar3;
        q4f q4fVar4 = new q4f("SYSTEM", 3);
        e = q4fVar4;
        q4f q4fVar5 = new q4f("CEPOCHKA", 4);
        f = q4fVar5;
        q4f q4fVar6 = new q4f("MULTI_BET", 5);
        g = q4fVar6;
        q4f q4fVar7 = new q4f("CONDITION_BET", 6);
        h = q4fVar7;
        q4f q4fVar8 = new q4f("ANTIEXPRESS", 7);
        i = q4fVar8;
        q4f q4fVar9 = new q4f("LUCKY", 8);
        j = q4fVar9;
        q4f q4fVar10 = new q4f("PATENT", 9);
        k = q4fVar10;
        q4f q4fVar11 = new q4f("BET_BUILDER", 10);
        l = q4fVar11;
        q4f q4fVar12 = new q4f("MULTI_SINGLE", 11);
        m = q4fVar12;
        q4f q4fVar13 = new q4f("TOTO_FOOT", 12);
        n = q4fVar13;
        q4f q4fVar14 = new q4f("TOTO_SCORE", 13);
        o = q4fVar14;
        q4f q4fVar15 = new q4f("TOTO_HOCKEY", 14);
        p = q4fVar15;
        q4f q4fVar16 = new q4f("TOTO_FIFTEEN", 15);
        q = q4fVar16;
        q4f q4fVar17 = new q4f("TOTO_CYBER_FOOT", 16);
        r = q4fVar17;
        q4f q4fVar18 = new q4f("TOTO_CYBER_SPORT", 17);
        s = q4fVar18;
        q4f q4fVar19 = new q4f("TOTO_BASKET", 18);
        t = q4fVar19;
        q4f q4fVar20 = new q4f("TOTO_1X", 19);
        u = q4fVar20;
        q4f q4fVar21 = new q4f("TOTO_CRICKET", 20);
        v = q4fVar21;
        q4f q4fVar22 = new q4f("FINANCE", 21);
        w = q4fVar22;
        q4f q4fVar23 = new q4f("BET_CONSTRUCTOR", 22);
        q4f q4fVar24 = new q4f("AUTO_BETS", 23);
        x = q4fVar24;
        q4f q4fVar25 = new q4f("JACKPOT", 24);
        y = q4fVar25;
        q4f q4fVar26 = new q4f("LOTTO", 25);
        z = q4fVar26;
        A = new q4f[]{q4fVar, q4fVar2, q4fVar3, q4fVar4, q4fVar5, q4fVar6, q4fVar7, q4fVar8, q4fVar9, q4fVar10, q4fVar11, q4fVar12, q4fVar13, q4fVar14, q4fVar15, q4fVar16, q4fVar17, q4fVar18, q4fVar19, q4fVar20, q4fVar21, q4fVar22, q4fVar23, q4fVar24, q4fVar25, q4fVar26};
        f28094a = new nwd();
    }

    public static q4f valueOf(String str) {
        return (q4f) Enum.valueOf(q4f.class, str);
    }

    public static q4f[] values() {
        return (q4f[]) A.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 24) {
            return 34;
        }
        switch (iOrdinal) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 11;
            case 12:
                return 34;
            case 13:
                return 35;
            case 14:
                return 36;
            case 15:
                return 33;
            case 16:
                return 38;
            case 17:
                return 40;
            case 18:
                return 39;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return 115967;
            case 20:
                return 41;
            case 21:
                return 37;
            default:
                return -1;
        }
    }
}
