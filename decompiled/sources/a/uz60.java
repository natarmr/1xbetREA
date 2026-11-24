package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uz60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uz60 f36523a;
    private static final ugi0 descriptor;

    static {
        uz60 uz60Var = new uz60();
        f36523a = uz60Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.OneXGamesPreviewResponse.GamePreview", uz60Var, 16);
        zna0Var.j("gameType", true);
        zna0Var.j("gameNameTranslateId", true);
        zna0Var.j("gameFlag", true);
        zna0Var.j("gameCashBack", true);
        zna0Var.j("bonusEnabled", true);
        zna0Var.j("bonusAccEnabled", true);
        zna0Var.j("clientData", true);
        zna0Var.j("categories", true);
        zna0Var.j("maxWinCoeff", true);
        zna0Var.j("bonusFromAddAcc", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("forceIFrame", true);
        zna0Var.j("underMaintenance", true);
        zna0Var.j("fullScreen", true);
        zna0Var.j("route", true);
        zna0Var.j("oldRoute", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wz60.q;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(ics.f14549a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(tbl.f33669a), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wz60.q;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Double d = null;
        Boolean bool5 = null;
        List list = null;
        int i = 0;
        Boolean bool6 = null;
        String str = null;
        String str2 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        String str3 = null;
        boolean z = true;
        Integer num2 = null;
        Integer num3 = null;
        hcs hcsVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num2;
                    z = false;
                    bool3 = bool3;
                    bool8 = bool8;
                    num2 = num;
                    bool2 = bool2;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    bool3 = bool3;
                    bool7 = bool7;
                    bool8 = bool8;
                    num2 = num;
                    bool2 = bool2;
                    break;
                case 1:
                    bool = bool7;
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i |= 2;
                    hcsVar = hcsVar;
                    bool7 = bool;
                    bool8 = bool8;
                    bool2 = bool2;
                    break;
                case 2:
                    bool = bool7;
                    hcsVar = (hcs) bldVarA.e(ugi0Var, 2, ics.f14549a, hcsVar);
                    i |= 4;
                    bool7 = bool;
                    bool8 = bool8;
                    bool2 = bool2;
                    break;
                case 3:
                    bool2 = bool2;
                    bool8 = bool8;
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool7);
                    i |= 8;
                    bool8 = bool8;
                    bool2 = bool2;
                    break;
                case 4:
                    bool2 = bool2;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool8);
                    i |= 16;
                    bool7 = bool7;
                    bool2 = bool2;
                    break;
                case 5:
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool9);
                    i |= 32;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 8:
                    d = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d);
                    i |= 256;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 9:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool4);
                    i |= 512;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 10:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool3);
                    i |= 1024;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 11:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool2);
                    i |= 2048;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 12:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool5);
                    i |= 4096;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 13:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool6);
                    i |= 8192;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 14:
                    str = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str);
                    i |= 16384;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                case 15:
                    str2 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str2);
                    i |= 32768;
                    bool7 = bool7;
                    bool8 = bool8;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool10 = bool2;
        Boolean bool11 = bool8;
        Integer num4 = num2;
        Integer num5 = num3;
        hcs hcsVar2 = hcsVar;
        bldVarA.c(ugi0Var);
        return new wz60(i, num4, num5, hcsVar2, bool7, bool11, bool9, str3, list, d, bool4, bool3, bool10, bool5, bool6, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wz60 wz60Var = (wz60) obj;
        wz60Var.getClass();
        String str = wz60Var.p;
        String str2 = wz60Var.o;
        Boolean bool = wz60Var.n;
        Boolean bool2 = wz60Var.m;
        Boolean bool3 = wz60Var.l;
        Boolean bool4 = wz60Var.k;
        Boolean bool5 = wz60Var.j;
        Double d = wz60Var.i;
        List list = wz60Var.h;
        String str3 = wz60Var.g;
        Boolean bool6 = wz60Var.f;
        Boolean bool7 = wz60Var.e;
        Boolean bool8 = wz60Var.d;
        hcs hcsVar = wz60Var.c;
        Integer num = wz60Var.b;
        Integer num2 = wz60Var.f40009a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wz60.q;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || hcsVar != null) {
            cldVarA.p(ugi0Var, 2, ics.f14549a, hcsVar);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
