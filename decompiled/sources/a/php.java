package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class php implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final php f27009a;
    private static final ugi0 descriptor;

    static {
        php phpVar = new php();
        f27009a = phpVar;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.FeaturesConfig", phpVar, 19);
        zna0Var.j("hasBonusGamesForPTSOnly", true);
        zna0Var.j("hasSportCashback", true);
        zna0Var.j("needHardUpdate", true);
        zna0Var.j("needUpdate", true);
        zna0Var.j("hasBlockRulesAgreement", true);
        zna0Var.j("isCouponClearAfterBetByDefault", true);
        zna0Var.j("hasPopularOnboardRegOrAuth", true);
        zna0Var.j("PopularOnboardRegOrAuthTimer", true);
        zna0Var.j("hasFastBet", true);
        zna0Var.j("newAccount", true);
        zna0Var.j("newChangePassword", true);
        zna0Var.j("isBettingEnabled", true);
        zna0Var.j("BettingEnabledGeo", true);
        zna0Var.j("halloweenLuckyWheelDateStart", true);
        zna0Var.j("halloweenLuckyWheelDateEnd", true);
        zna0Var.j("hasGamesWildFreebet", true);
        zna0Var.j("hasTopGamesBottom", true);
        zna0Var.j("isCheckNewPromocodes", true);
        zna0Var.j("hasUFC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = rhp.t;
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ0 = mrv.j0(sm8Var);
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(sm8Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Long, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ?? r1;
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rhp.t;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        List list = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Long l3 = null;
        boolean z = true;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    bool = bool11;
                    z = false;
                    bool2 = bool2;
                    l = l;
                    bool8 = bool8;
                    bool11 = bool;
                    bool14 = bool14;
                    l3 = l3;
                    list = list;
                    l2 = l2;
                    bool9 = bool9;
                    bool15 = bool15;
                    bool6 = bool6;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool11);
                    i |= 1;
                    bool10 = bool10;
                    bool2 = bool2;
                    l = l;
                    bool8 = bool8;
                    bool11 = bool;
                    bool14 = bool14;
                    l3 = l3;
                    list = list;
                    l2 = l2;
                    bool9 = bool9;
                    bool15 = bool15;
                    bool6 = bool6;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 1:
                    bool12 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool12);
                    i |= 2;
                    bool10 = bool10;
                    l3 = l3;
                    list = list;
                    l = l;
                    bool8 = bool8;
                    bool9 = bool9;
                    bool14 = bool14;
                    l2 = l2;
                    bool15 = bool15;
                    bool6 = bool6;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 2:
                    bool13 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool13);
                    i |= 4;
                    bool10 = bool10;
                    l3 = l3;
                    l = l;
                    bool8 = bool8;
                    bool9 = bool9;
                    bool14 = bool14;
                    l2 = l2;
                    bool15 = bool15;
                    bool6 = bool6;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 3:
                    bool7 = bool7;
                    bool9 = bool9;
                    bool16 = bool16;
                    bool6 = bool6;
                    bool15 = bool15;
                    bool14 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool14);
                    i |= 8;
                    bool10 = bool10;
                    l3 = l3;
                    l2 = l2;
                    bool8 = bool8;
                    bool9 = bool9;
                    bool15 = bool15;
                    bool6 = bool6;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 4:
                    bool7 = bool7;
                    bool16 = bool16;
                    bool15 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool15);
                    i |= 16;
                    bool10 = bool10;
                    l3 = l3;
                    bool6 = bool6;
                    bool8 = bool8;
                    bool9 = bool9;
                    bool16 = bool16;
                    bool7 = bool7;
                    break;
                case 5:
                    bool16 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool16);
                    i |= 32;
                    bool10 = bool10;
                    l3 = l3;
                    bool7 = bool7;
                    bool8 = bool8;
                    bool9 = bool9;
                    break;
                case 6:
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool10);
                    i |= 64;
                    l3 = l3;
                    bool8 = bool8;
                    bool9 = bool9;
                    break;
                case 7:
                    bool9 = bool9;
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i |= 128;
                    bool10 = bool10;
                    bool9 = bool9;
                    break;
                case 8:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool5);
                    i |= 256;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 9:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool4);
                    i |= 512;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 10:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool3);
                    i |= 1024;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 11:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool2);
                    i |= 2048;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 12:
                    list = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
                    i |= 4096;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 13:
                    l = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l);
                    i |= 8192;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 14:
                    l2 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l2);
                    i |= 16384;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 15:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool6);
                    i |= 32768;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 16:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool7);
                    i |= 65536;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 17:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool8);
                    i |= 131072;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                case 18:
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool9);
                    i |= 262144;
                    bool10 = bool10;
                    l3 = l3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list2 = list;
        Boolean bool17 = bool7;
        Boolean bool18 = bool8;
        Boolean bool19 = bool9;
        Boolean bool20 = bool10;
        Long l4 = l3;
        Boolean bool21 = bool11;
        Boolean bool22 = bool12;
        Boolean bool23 = bool16;
        Boolean bool24 = bool2;
        Boolean bool25 = bool6;
        Boolean bool26 = bool15;
        Long l5 = l2;
        Boolean bool27 = bool14;
        Long l6 = l;
        Boolean bool28 = bool13;
        bldVarA.c(ugi0Var);
        rhp rhpVar = new rhp();
        if ((i & 1) == 0) {
            r1 = 0;
            rhpVar.f30502a = null;
        } else {
            r1 = 0;
            rhpVar.f30502a = bool21;
        }
        if ((i & 2) == 0) {
            rhpVar.b = r1;
        } else {
            rhpVar.b = bool22;
        }
        if ((i & 4) == 0) {
            rhpVar.c = r1;
        } else {
            rhpVar.c = bool28;
        }
        if ((i & 8) == 0) {
            rhpVar.d = r1;
        } else {
            rhpVar.d = bool27;
        }
        if ((i & 16) == 0) {
            rhpVar.e = r1;
        } else {
            rhpVar.e = bool26;
        }
        if ((i & 32) == 0) {
            rhpVar.f = r1;
        } else {
            rhpVar.f = bool23;
        }
        if ((i & 64) == 0) {
            rhpVar.g = r1;
        } else {
            rhpVar.g = bool20;
        }
        if ((i & 128) == 0) {
            rhpVar.h = r1;
        } else {
            rhpVar.h = l4;
        }
        if ((i & 256) == 0) {
            rhpVar.i = r1;
        } else {
            rhpVar.i = bool5;
        }
        if ((i & 512) == 0) {
            rhpVar.j = r1;
        } else {
            rhpVar.j = bool4;
        }
        if ((i & 1024) == 0) {
            rhpVar.k = r1;
        } else {
            rhpVar.k = bool3;
        }
        if ((i & 2048) == 0) {
            rhpVar.l = r1;
        } else {
            rhpVar.l = bool24;
        }
        if ((i & 4096) == 0) {
            rhpVar.m = r1;
        } else {
            rhpVar.m = list2;
        }
        if ((i & 8192) == 0) {
            rhpVar.n = r1;
        } else {
            rhpVar.n = l6;
        }
        if ((i & 16384) == 0) {
            rhpVar.o = r1;
        } else {
            rhpVar.o = l5;
        }
        if ((i & 32768) == 0) {
            rhpVar.p = r1;
        } else {
            rhpVar.p = bool25;
        }
        if ((i & 65536) == 0) {
            rhpVar.q = r1;
        } else {
            rhpVar.q = bool17;
        }
        if ((i & 131072) == 0) {
            rhpVar.r = r1;
        } else {
            rhpVar.r = bool18;
        }
        if ((i & 262144) == 0) {
            rhpVar.s = r1;
            return rhpVar;
        }
        rhpVar.s = bool19;
        return rhpVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rhp rhpVar = (rhp) obj;
        rhpVar.getClass();
        Boolean bool = rhpVar.s;
        Boolean bool2 = rhpVar.r;
        Boolean bool3 = rhpVar.q;
        Boolean bool4 = rhpVar.p;
        Long l = rhpVar.o;
        Long l2 = rhpVar.n;
        List list = rhpVar.m;
        Boolean bool5 = rhpVar.l;
        Boolean bool6 = rhpVar.k;
        Boolean bool7 = rhpVar.j;
        Boolean bool8 = rhpVar.i;
        Long l3 = rhpVar.h;
        Boolean bool9 = rhpVar.g;
        Boolean bool10 = rhpVar.f;
        Boolean bool11 = rhpVar.e;
        Boolean bool12 = rhpVar.d;
        Boolean bool13 = rhpVar.c;
        Boolean bool14 = rhpVar.b;
        Boolean bool15 = rhpVar.f30502a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rhp.t;
        if (cldVarA.u(ugi0Var) || bool15 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool15);
        }
        if (cldVarA.u(ugi0Var) || bool14 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool14);
        }
        if (cldVarA.u(ugi0Var) || bool13 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool13);
        }
        if (cldVarA.u(ugi0Var) || bool12 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool12);
        }
        if (cldVarA.u(ugi0Var) || bool11 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool11);
        }
        if (cldVarA.u(ugi0Var) || bool10 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool10);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l2 != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
