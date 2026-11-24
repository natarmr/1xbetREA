package a;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.api.model.tournaments.UserActionButtonModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f8641a = kotlin.collections.a.c(1);
    public static final List b = q3d.j(2, 3, 5, 6, 7);
    public static final List c = q3d.j(4, 8, 9);

    /* JADX WARN: Code duplicated, block: B:150:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:165:0x0209  */
    /* JADX WARN: Code duplicated, block: B:174:0x0231  */
    public static final myr0 a(bzr0 bzr0Var) {
        Integer num;
        kyr0 kyr0Var;
        String str;
        gyr0 gyr0Var;
        UserActionButtonModel userActionButtonModel;
        he9 he9Var;
        String str2;
        UserActionButtonModel userActionButtonModel2;
        he9 he9Var2;
        String str3;
        he9 he9Var3;
        String str4;
        Long l;
        Long l2;
        Long l3;
        zyr0 zyr0Var;
        gyr0 gyr0Var2;
        String strValueOf;
        bzr0Var.getClass();
        Long l4 = bzr0Var.f3486a;
        Boolean bool = bzr0Var.d;
        qyr0 qyr0Var = bzr0Var.g;
        Integer num2 = bzr0Var.e;
        Integer num3 = bzr0Var.b;
        if (l4 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l4.longValue();
        z1s0 z1s0Var = (num3 != null && num3.intValue() == 1) ? z1s0.f43637a : z1s0.b;
        lyr0 lyr0Var = qek0.f;
        if (((num3 != null && num3.intValue() == 2) || (num = bzr0Var.c) == null || num.intValue() != 4) && (num3 == null || num3.intValue() != 2 || !Intrinsics.d(bool, Boolean.TRUE))) {
            lyr0Var = rek0.f;
        }
        if (CollectionsKt.L(b, num2)) {
            kyr0Var = jdk0.e;
        } else if (CollectionsKt.L(f8641a, num2)) {
            kyr0Var = pek0.e;
        } else {
            if (!CollectionsKt.L(c, num2)) {
                jf4.k(null);
                return null;
            }
            kyr0Var = jyr0.f17375a;
        }
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        tyr0 tyr0Var = bzr0Var.f;
        String str5 = tyr0Var != null ? tyr0Var.f34771a : null;
        String str6 = tyr0Var != null ? tyr0Var.c : null;
        if (tyr0Var == null || (str = tyr0Var.b) == null) {
            jf4.k(null);
            return null;
        }
        iyr0 iyr0Var = new iyr0(str5, str6, str);
        if (qyr0Var == null) {
            jf4.k(null);
            return null;
        }
        of9 of9Var = qyr0Var.l;
        String str7 = qyr0Var.f29550a;
        Long l5 = qyr0Var.e;
        Long l6 = qyr0Var.d;
        xyr0 xyr0Var = qyr0Var.m;
        if (str7 == null) {
            jf4.k(null);
            return null;
        }
        Long l7 = qyr0Var.b;
        long jLongValue2 = 0;
        long jLongValue3 = l7 != null ? l7.longValue() : 0L;
        String str8 = qyr0Var.c;
        if (l6 == null) {
            jf4.k(null);
            return null;
        }
        rdj rdjVar = rdj.f30294a;
        Date dateK = rdj.k(l6.longValue());
        if (l5 == null) {
            jf4.k(null);
            return null;
        }
        Date dateK2 = rdj.k(l5.longValue());
        String str9 = qyr0Var.f;
        String str10 = str9 == null ? "" : str9;
        String str11 = qyr0Var.g;
        if (str11 == null) {
            jf4.k(null);
            return null;
        }
        Long l8 = qyr0Var.i;
        String str12 = (l8 == null || (strValueOf = String.valueOf(l8.longValue())) == null) ? "" : strValueOf;
        String str13 = qyr0Var.j;
        String str14 = str13 == null ? "" : str13;
        Integer num4 = qyr0Var.k;
        String strValueOf2 = num4 != null ? String.valueOf(num4.intValue()) : null;
        String str15 = strValueOf2 == null ? "" : strValueOf2;
        String str16 = qyr0Var.h;
        String str17 = (str16 == null || str16.length() <= 0) ? null : str16;
        if (str17 == null) {
            jf4.k(null);
            return null;
        }
        if (xyr0Var == null || (zyr0Var = xyr0Var.f41719a) == null) {
            gyr0Var = null;
        } else {
            int i = dyr0.f6909a[zyr0Var.ordinal()];
            if (i == 1) {
                gyr0Var2 = gyr0.f12145a;
            } else if (i == 2) {
                gyr0Var2 = gyr0.b;
            } else {
                if (i != 3) {
                    t9f.b();
                    return null;
                }
                gyr0Var2 = gyr0.c;
            }
            gyr0Var = gyr0Var2;
        }
        Date dateK3 = (xyr0Var == null || (l3 = xyr0Var.b) == null) ? null : rdj.k(l3.longValue());
        Date dateK4 = (xyr0Var == null || (l2 = xyr0Var.c) == null) ? null : rdj.k(l2.longValue());
        String str18 = xyr0Var != null ? xyr0Var.d : null;
        String str19 = str18 == null ? "" : str18;
        long time = new Date().getTime();
        if (xyr0Var != null && (l = xyr0Var.c) != null) {
            jLongValue2 = l.longValue();
        }
        hyr0 hyr0Var = new hyr0(str7, jLongValue3, str8, dateK, dateK2, str10, str11, str17, str12, str14, str15, new fyr0(gyr0Var, dateK3, dateK4, Long.valueOf(TimeUnit.SECONDS.toMillis(jLongValue2) + time), str19));
        if (num3 != null && num3.intValue() == 2) {
            re9.f30324a.getClass();
            if (kj5.h(num2) == re9.b) {
                if (of9Var == null || (he9Var3 = of9Var.c) == null || (str4 = he9Var3.f12911a) == null) {
                    jf4.k(null);
                    return null;
                }
                userActionButtonModel = new UserActionButtonModel(str4, gqt0.c);
            } else if (num3 == null && num3.intValue() == 1) {
                re9.f30324a.getClass();
                if (kj5.h(num2) != re9.b) {
                    userActionButtonModel = new UserActionButtonModel("", gqt0.h);
                } else {
                    if (of9Var != null || (he9Var = of9Var.b) == null || (str2 = he9Var.f12911a) == null) {
                        jf4.k(null);
                        return null;
                    }
                    userActionButtonModel = new UserActionButtonModel(str2, gqt0.f11750a);
                }
            } else {
                userActionButtonModel = new UserActionButtonModel("", gqt0.h);
            }
        } else if (num3 == null) {
            userActionButtonModel = new UserActionButtonModel("", gqt0.h);
        } else {
            re9.f30324a.getClass();
            if (kj5.h(num2) != re9.b) {
                if (of9Var != null) {
                }
                jf4.k(null);
                return null;
            }
            userActionButtonModel = new UserActionButtonModel("", gqt0.h);
        }
        if (num3 == null || num3.intValue() != 2) {
            if (of9Var != null) {
            }
            jf4.k(null);
            return null;
        }
        re9.f30324a.getClass();
        if (kj5.h(num2) == re9.b) {
            userActionButtonModel2 = new UserActionButtonModel("", gqt0.h);
        } else {
            if (of9Var != null || (he9Var2 = of9Var.f) == null || (str3 = he9Var2.f12911a) == null) {
                jf4.k(null);
                return null;
            }
            userActionButtonModel2 = new UserActionButtonModel(str3, gqt0.e);
        }
        UserActionButtonModel userActionButtonModel3 = userActionButtonModel2;
        re9.f30324a.getClass();
        re9 re9VarH = kj5.h(num2);
        if (of9Var != null) {
            return new myr0(jLongValue, z1s0Var, lyr0Var, kyr0Var, iyr0Var, hyr0Var, false, zBooleanValue, userActionButtonModel, rsm0.y(of9Var), userActionButtonModel3, re9VarH);
        }
        jf4.k(null);
        return null;
    }
}
