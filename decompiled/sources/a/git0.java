package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class git0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final git0 f11367a;
    private static final ugi0 descriptor;

    static {
        git0 git0Var = new git0();
        f11367a = git0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.UpdateCouponRequest", git0Var, 24);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Vid", false);
        zna0Var.j("expressNum", false);
        zna0Var.j("Summ", false);
        zna0Var.j("Source", false);
        zna0Var.j("partner", false);
        zna0Var.j("CheckCf", true);
        zna0Var.j("Lng", false);
        zna0Var.j("notWait", false);
        zna0Var.j("Events", false);
        zna0Var.j("CfView", false);
        zna0Var.j("avanceBet", false);
        zna0Var.j("SaleBetId", false);
        zna0Var.j("MinBetSystem", false);
        zna0Var.j("AddPromoCodes", false);
        zna0Var.j("IsPowerBet", false);
        zna0Var.j("EventsIndexes", false);
        zna0Var.j("WithLobby", false);
        zna0Var.j("CalcSystemsMin", false);
        zna0Var.j("IsExpressBoost", false);
        zna0Var.j("Country", false);
        zna0Var.j("specialTypes", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = iit0.y;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710Var, s710Var, ysm0Var, okxVar, s710Var, ysm0Var, okxVar, okxVar, okxVar, ysm0Var, sm8Var, a8zVarArr[11].getValue(), okxVar, sm8Var, ysm0Var, ysm0Var, sm8Var, sm8Var, a8zVarArr[18].getValue(), sm8Var, sm8Var, sm8Var, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        int i2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = iit0.y;
        Object obj = null;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        List list = null;
        List list2 = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        int i3 = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        boolean zB = false;
        int iJ5 = 0;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        boolean zB5 = false;
        boolean zB6 = false;
        boolean zB7 = false;
        int iJ6 = 0;
        int iJ7 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i3 |= 1;
                    obj = null;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i3 |= 2;
                    obj = null;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i3 |= 4;
                    obj = null;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i3 |= 8;
                    obj = null;
                    break;
                case 4:
                    jR3 = bldVarA.r(ugi0Var, 4);
                    i3 |= 16;
                    obj = null;
                    break;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i3 |= 32;
                    obj = null;
                    break;
                case 6:
                    iJ2 = bldVarA.j(ugi0Var, 6);
                    i3 |= 64;
                    obj = null;
                    break;
                case 7:
                    iJ3 = bldVarA.j(ugi0Var, 7);
                    i3 |= 128;
                    obj = null;
                    break;
                case 8:
                    iJ4 = bldVarA.j(ugi0Var, 8);
                    i3 |= 256;
                    obj = null;
                    break;
                case 9:
                    strX3 = bldVarA.x(ugi0Var, 9);
                    i3 |= 512;
                    obj = null;
                    break;
                case 10:
                    zB = bldVarA.B(ugi0Var, 10);
                    i3 |= 1024;
                    obj = null;
                    break;
                case 11:
                    list = (List) bldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i3 |= 2048;
                    obj = null;
                    break;
                case 12:
                    iJ5 = bldVarA.j(ugi0Var, 12);
                    i3 |= 4096;
                    obj = null;
                    break;
                case 13:
                    zB2 = bldVarA.B(ugi0Var, 13);
                    i3 |= 8192;
                    obj = null;
                    break;
                case 14:
                    strX4 = bldVarA.x(ugi0Var, 14);
                    i3 |= 16384;
                    obj = null;
                    break;
                case 15:
                    strX5 = bldVarA.x(ugi0Var, 15);
                    i = 32768;
                    i3 |= i;
                    obj = null;
                    break;
                case 16:
                    zB3 = bldVarA.B(ugi0Var, 16);
                    i = 65536;
                    i3 |= i;
                    obj = null;
                    break;
                case 17:
                    zB4 = bldVarA.B(ugi0Var, 17);
                    i = 131072;
                    i3 |= i;
                    obj = null;
                    break;
                case 18:
                    list2 = (List) bldVarA.m(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), list2);
                    i = 262144;
                    i3 |= i;
                    obj = null;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    zB5 = bldVarA.B(ugi0Var, 19);
                    i2 = 524288;
                    i3 |= i2;
                    obj = null;
                    break;
                case 20:
                    zB6 = bldVarA.B(ugi0Var, 20);
                    i2 = 1048576;
                    i3 |= i2;
                    obj = null;
                    break;
                case 21:
                    zB7 = bldVarA.B(ugi0Var, 21);
                    i2 = 2097152;
                    i3 |= i2;
                    obj = null;
                    break;
                case 22:
                    iJ6 = bldVarA.j(ugi0Var, 22);
                    i2 = 4194304;
                    i3 |= i2;
                    obj = null;
                    break;
                case 23:
                    iJ7 = bldVarA.j(ugi0Var, 23);
                    i2 = 8388608;
                    i3 |= i2;
                    obj = null;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
        }
        bldVarA.c(ugi0Var);
        return new iit0(i3, jR, jR2, strX, iJ, jR3, strX2, iJ2, iJ3, iJ4, strX3, zB, list, iJ5, zB2, strX4, strX5, zB3, zB4, list2, zB5, zB6, zB7, iJ6, iJ7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iit0 iit0Var = (iit0) obj;
        iit0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = iit0.y;
        long j = iit0Var.f14845a;
        int i = iit0Var.i;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.n(ugi0Var, 1, iit0Var.b);
        cldVarA.z(ugi0Var, 2, iit0Var.c);
        cldVarA.i(3, iit0Var.d, ugi0Var);
        cldVarA.n(ugi0Var, 4, iit0Var.e);
        cldVarA.z(ugi0Var, 5, iit0Var.f);
        cldVarA.i(6, iit0Var.g, ugi0Var);
        cldVarA.i(7, iit0Var.h, ugi0Var);
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(8, i, ugi0Var);
        }
        cldVarA.z(ugi0Var, 9, iit0Var.j);
        cldVarA.x(ugi0Var, 10, iit0Var.k);
        cldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), iit0Var.l);
        cldVarA.i(12, iit0Var.m, ugi0Var);
        cldVarA.x(ugi0Var, 13, iit0Var.n);
        cldVarA.z(ugi0Var, 14, iit0Var.o);
        cldVarA.z(ugi0Var, 15, iit0Var.p);
        cldVarA.x(ugi0Var, 16, iit0Var.q);
        cldVarA.x(ugi0Var, 17, iit0Var.r);
        cldVarA.m(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), iit0Var.s);
        cldVarA.x(ugi0Var, 19, iit0Var.t);
        cldVarA.x(ugi0Var, 20, iit0Var.u);
        cldVarA.x(ugi0Var, 21, iit0Var.v);
        cldVarA.i(22, iit0Var.w, ugi0Var);
        cldVarA.i(23, iit0Var.x, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
