package a;

import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5w f43836a;
    public static final z5w b;
    public static final z5w c;
    public static final z5w d;
    public static final z5w e;
    public static final z5w f;
    public static final z5w g;
    public static final z5w h;
    public static final z5w i;
    public static final z5w j;
    public static final z5w k;
    public static final z5w l;
    public static final z5w m;
    public static final z5w n;
    public static final z5w o;
    public static final z5w p;
    public static final z5w q;
    public static final z5w r;
    public static final z5w s;
    public static final z5w t;
    public static final z5w u;
    public static final z5w v;
    public static final /* synthetic */ z5w[] w;

    static {
        z5w z5wVar = new z5w("BET_STATUS", 0);
        f43836a = z5wVar;
        z5w z5wVar2 = new z5w("BET_STATUS_NONE", 1);
        b = z5wVar2;
        z5w z5wVar3 = new z5w("BET_STATUS_ACCEPTED", 2);
        c = z5wVar3;
        z5w z5wVar4 = new z5w("BET_STATUS_LOST", 3);
        d = z5wVar4;
        z5w z5wVar5 = new z5w("BET_STATUS_ALL", 4);
        z5w z5wVar6 = new z5w("BET_STATUS_WAITING", 5);
        z5w z5wVar7 = new z5w("BET_STATUS_DECLINED", 6);
        z5w z5wVar8 = new z5w("BET_STATUS_WIN", 7);
        e = z5wVar8;
        z5w z5wVar9 = new z5w("BET_STATUS_PAID", 8);
        f = z5wVar9;
        z5w z5wVar10 = new z5w("BET_STATUS_REMOVED", 9);
        g = z5wVar10;
        z5w z5wVar11 = new z5w("BET_STATUS_EXPIRED", 10);
        h = z5wVar11;
        z5w z5wVar12 = new z5w("BET_STATUS_BLOCKED", 11);
        i = z5wVar12;
        z5w z5wVar13 = new z5w("BET_STATUS_PURCHASING", 12);
        j = z5wVar13;
        z5w z5wVar14 = new z5w("BET_STATUS_AUTO_BET_WAITING", 13);
        k = z5wVar14;
        z5w z5wVar15 = new z5w("BET_STATUS_AUTO_BET_DROPPED", 14);
        l = z5wVar15;
        z5w z5wVar16 = new z5w("BET_FILTER", 15);
        m = z5wVar16;
        z5w z5wVar17 = new z5w("BET_FILTER_ACCEPTED", 16);
        n = z5wVar17;
        z5w z5wVar18 = new z5w("BET_FILTER_LOST", 17);
        o = z5wVar18;
        z5w z5wVar19 = new z5w("BET_FILTER_WON", 18);
        p = z5wVar19;
        z5w z5wVar20 = new z5w("BET_FILTER_PAID_PUT", 19);
        q = z5wVar20;
        z5w z5wVar21 = new z5w("BET_FILTER_REMOVED", 20);
        r = z5wVar21;
        z5w z5wVar22 = new z5w("BET_FILTER_BLOCKED", 21);
        s = z5wVar22;
        z5w z5wVar23 = new z5w("BET_FILTER_SOLD", 22);
        t = z5wVar23;
        z5w z5wVar24 = new z5w("BET_FILTER_ALL", 23);
        u = z5wVar24;
        z5w z5wVar25 = new z5w("BET_STATUS_AUTO_BET_ACTIVATED", 24);
        v = z5wVar25;
        w = new z5w[]{z5wVar, z5wVar2, z5wVar3, z5wVar4, z5wVar5, z5wVar6, z5wVar7, z5wVar8, z5wVar9, z5wVar10, z5wVar11, z5wVar12, z5wVar13, z5wVar14, z5wVar15, z5wVar16, z5wVar17, z5wVar18, z5wVar19, z5wVar20, z5wVar21, z5wVar22, z5wVar23, z5wVar24, z5wVar25};
    }

    public static z5w valueOf(String str) {
        return (z5w) Enum.valueOf(z5w.class, str);
    }

    public static z5w[] values() {
        return (z5w[]) w.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                return CommonConstant.KEY_STATUS;
            case 1:
                return "none";
            case 2:
                return "accepted";
            case 3:
                return "lost";
            case 4:
                return "all";
            case 5:
                return "waiting";
            case 6:
                return "declined";
            case 7:
                return "win";
            case 8:
                return "paid";
            case 9:
                return "removed";
            case 10:
                return "expired";
            case 11:
                return "blocked";
            case 12:
                return "purchasing";
            case 13:
                return "claim_waiting";
            case 14:
                return "claim_reset";
            case 15:
                return "filter";
            case 16:
                return "accepted";
            case 17:
                return "lost";
            case 18:
                return "won";
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return "paid_put";
            case 20:
                return "removed";
            case 21:
                return "blocked";
            case 22:
                return "sold";
            case 23:
                return "all";
            case 24:
                return "claim_accepted";
            default:
                t9f.b();
                return null;
        }
    }
}
