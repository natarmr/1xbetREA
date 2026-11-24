package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xt6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xt6 f41449a;
    private static final ugi0 descriptor;

    static {
        xt6 xt6Var = new xt6();
        f41449a = xt6Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BetDataRequest", xt6Var, 34);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Summ", false);
        zna0Var.j("avanceBet", false);
        zna0Var.j("Events", false);
        zna0Var.j("Vid", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("WithLobby", false);
        zna0Var.j("EventsIndexes", false);
        zna0Var.j("GroupsSumms", false);
        zna0Var.j("expressNum", false);
        zna0Var.j("partner", false);
        zna0Var.j("CfView", false);
        zna0Var.j("notWait", false);
        zna0Var.j("VIPBetSumm", false);
        zna0Var.j("Source", false);
        zna0Var.j("Date", false);
        zna0Var.j("Sign", false);
        zna0Var.j("Lng", false);
        zna0Var.j("ApprovedBet", false);
        zna0Var.j("betGUID", false);
        zna0Var.j("promo", false);
        zna0Var.j("autoBetCf", false);
        zna0Var.j("DropOnScoreChange", false);
        zna0Var.j("TransformEventKind", false);
        zna0Var.j("CalcSystemsMin", false);
        zna0Var.j("CouponCode", false);
        zna0Var.j("IsExpressBoost", false);
        zna0Var.j("OneClickBet", false);
        zna0Var.j("IsPowerBet", false);
        zna0Var.j("SaleBetId", false);
        zna0Var.j("specialTypes", false);
        zna0Var.j("BuilderCoupon", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zt6.I;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, s710Var, ysm0Var, ysm0Var, sm8Var, a8zVarArr[5].getValue(), okxVar, okxVar, sm8Var, a8zVarArr[9].getValue(), a8zVarArr[10].getValue(), s710Var, okxVar, okxVar, sm8Var, sm8Var, okxVar, ysm0Var, ysm0Var, ysm0Var, sm8Var, mrv.j0(ysm0Var), mrv.j0(ysm0Var), tbl.f33669a, sm8Var, sm8Var, sm8Var, ysm0Var, sm8Var, okxVar, sm8Var, ysm0Var, okxVar, mrv.j0(wb9.f38864a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zt6.I;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        double dT = 0.0d;
        yb9 yb9Var = null;
        boolean z = true;
        List list = null;
        String str = null;
        List list2 = null;
        List list3 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        String strX = null;
        String strX2 = null;
        boolean zB = false;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB2 = false;
        int iJ3 = 0;
        int iJ4 = 0;
        boolean zB3 = false;
        boolean zB4 = false;
        int iJ5 = 0;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        boolean zB5 = false;
        boolean zB6 = false;
        boolean zB7 = false;
        boolean zB8 = false;
        String strX6 = null;
        boolean zB9 = false;
        int iJ6 = 0;
        boolean zB10 = false;
        String strX7 = null;
        int iJ7 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    a8zVarArr = a8zVarArr;
                    z = false;
                    a8zVarArr = a8zVarArr;
                    break;
                case 0:
                    a8zVarArr = a8zVarArr;
                    jR = bldVarA.r(ugi0Var, 0);
                    i2 |= 1;
                    a8zVarArr = a8zVarArr;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr;
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i2 |= 2;
                    a8zVarArr = a8zVarArr;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr;
                    strX = bldVarA.x(ugi0Var, 2);
                    i2 |= 4;
                    a8zVarArr = a8zVarArr;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr;
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i2 |= 8;
                    a8zVarArr = a8zVarArr;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr;
                    zB = bldVarA.B(ugi0Var, 4);
                    i2 |= 16;
                    a8zVarArr = a8zVarArr;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr;
                    list = (List) bldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
                    i2 |= 32;
                    a8zVarArr = a8zVarArr;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr;
                    iJ = bldVarA.j(ugi0Var, 6);
                    i2 |= 64;
                    a8zVarArr = a8zVarArr;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr;
                    iJ2 = bldVarA.j(ugi0Var, 7);
                    i2 |= 128;
                    a8zVarArr = a8zVarArr;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr;
                    zB2 = bldVarA.B(ugi0Var, 8);
                    i2 |= 256;
                    a8zVarArr = a8zVarArr;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr;
                    list2 = (List) bldVarA.m(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i2 |= 512;
                    a8zVarArr = a8zVarArr;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr;
                    list3 = (List) bldVarA.m(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
                    i2 |= 1024;
                    a8zVarArr = a8zVarArr;
                    break;
                case 11:
                    a8zVarArr = a8zVarArr;
                    i2 |= 2048;
                    jR3 = bldVarA.r(ugi0Var, 11);
                    a8zVarArr = a8zVarArr;
                    break;
                case 12:
                    a8zVarArr = a8zVarArr;
                    iJ3 = bldVarA.j(ugi0Var, 12);
                    i2 |= 4096;
                    a8zVarArr = a8zVarArr;
                    break;
                case 13:
                    a8zVarArr = a8zVarArr;
                    iJ4 = bldVarA.j(ugi0Var, 13);
                    i2 |= 8192;
                    a8zVarArr = a8zVarArr;
                    break;
                case 14:
                    a8zVarArr = a8zVarArr;
                    zB3 = bldVarA.B(ugi0Var, 14);
                    i2 |= 16384;
                    a8zVarArr = a8zVarArr;
                    break;
                case 15:
                    zB4 = bldVarA.B(ugi0Var, 15);
                    i = 32768;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 16:
                    iJ5 = bldVarA.j(ugi0Var, 16);
                    i = 65536;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 17:
                    strX3 = bldVarA.x(ugi0Var, 17);
                    i = 131072;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 18:
                    strX4 = bldVarA.x(ugi0Var, 18);
                    i = 262144;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    strX5 = bldVarA.x(ugi0Var, 19);
                    i = 524288;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 20:
                    zB5 = bldVarA.B(ugi0Var, 20);
                    i = 1048576;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 21:
                    str2 = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str2);
                    i = 2097152;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 22:
                    str = (String) bldVarA.e(ugi0Var, 22, ysm0.f43175a, str);
                    i = 4194304;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 23:
                    a8zVarArr = a8zVarArr;
                    i2 |= 8388608;
                    dT = bldVarA.t(ugi0Var, 23);
                    a8zVarArr = a8zVarArr;
                    break;
                case 24:
                    zB6 = bldVarA.B(ugi0Var, 24);
                    i = 16777216;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    zB7 = bldVarA.B(ugi0Var, 25);
                    i = 33554432;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    zB8 = bldVarA.B(ugi0Var, 26);
                    i = 67108864;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    strX6 = bldVarA.x(ugi0Var, 27);
                    i = 134217728;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    zB9 = bldVarA.B(ugi0Var, 28);
                    i = 268435456;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iJ6 = bldVarA.j(ugi0Var, 29);
                    i = 536870912;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    zB10 = bldVarA.B(ugi0Var, 30);
                    i = 1073741824;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    strX7 = bldVarA.x(ugi0Var, 31);
                    i = Integer.MIN_VALUE;
                    i2 |= i;
                    a8zVarArr = a8zVarArr;
                    break;
                case 32:
                    a8zVarArr = a8zVarArr;
                    iJ7 = bldVarA.j(ugi0Var, 32);
                    i3 |= 1;
                    a8zVarArr = a8zVarArr;
                    break;
                case 33:
                    a8zVarArr = a8zVarArr;
                    yb9Var = (yb9) bldVarA.e(ugi0Var, 33, wb9.f38864a, yb9Var);
                    i3 |= 2;
                    a8zVarArr = a8zVarArr;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new zt6(i2, i3, jR, jR2, strX, strX2, zB, list, iJ, iJ2, zB2, list2, list3, jR3, iJ3, iJ4, zB3, zB4, iJ5, strX3, strX4, strX5, zB5, str2, str, dT, zB6, zB7, zB8, strX6, zB9, iJ6, zB10, strX7, iJ7, yb9Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zt6 zt6Var = (zt6) obj;
        zt6Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zt6.I;
        cldVarA.n(ugi0Var, 0, zt6Var.f44940a);
        cldVarA.n(ugi0Var, 1, zt6Var.b);
        cldVarA.z(ugi0Var, 2, zt6Var.c);
        cldVarA.z(ugi0Var, 3, zt6Var.d);
        cldVarA.x(ugi0Var, 4, zt6Var.e);
        cldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), zt6Var.f);
        cldVarA.i(6, zt6Var.g, ugi0Var);
        cldVarA.i(7, zt6Var.h, ugi0Var);
        cldVarA.x(ugi0Var, 8, zt6Var.i);
        cldVarA.m(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), zt6Var.j);
        cldVarA.m(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), zt6Var.k);
        cldVarA.n(ugi0Var, 11, zt6Var.l);
        cldVarA.i(12, zt6Var.m, ugi0Var);
        cldVarA.i(13, zt6Var.n, ugi0Var);
        cldVarA.x(ugi0Var, 14, zt6Var.o);
        cldVarA.x(ugi0Var, 15, zt6Var.p);
        cldVarA.i(16, zt6Var.q, ugi0Var);
        cldVarA.z(ugi0Var, 17, zt6Var.r);
        cldVarA.z(ugi0Var, 18, zt6Var.s);
        cldVarA.z(ugi0Var, 19, zt6Var.t);
        cldVarA.x(ugi0Var, 20, zt6Var.u);
        ysm0 ysm0Var = ysm0.f43175a;
        cldVarA.p(ugi0Var, 21, ysm0Var, zt6Var.v);
        cldVarA.p(ugi0Var, 22, ysm0Var, zt6Var.w);
        cldVarA.j(ugi0Var, 23, zt6Var.x);
        cldVarA.x(ugi0Var, 24, zt6Var.y);
        cldVarA.x(ugi0Var, 25, zt6Var.z);
        cldVarA.x(ugi0Var, 26, zt6Var.A);
        cldVarA.z(ugi0Var, 27, zt6Var.B);
        cldVarA.x(ugi0Var, 28, zt6Var.C);
        cldVarA.i(29, zt6Var.D, ugi0Var);
        cldVarA.x(ugi0Var, 30, zt6Var.E);
        cldVarA.z(ugi0Var, 31, zt6Var.F);
        cldVarA.i(32, zt6Var.G, ugi0Var);
        cldVarA.p(ugi0Var, 33, wb9.f38864a, zt6Var.H);
        cldVarA.c(ugi0Var);
    }
}
