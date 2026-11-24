package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ygj implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ygj f42586a;
    private static final ugi0 descriptor;

    static {
        ygj ygjVar = new ygj();
        f42586a = ygjVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.dayexpress.impl.data.model.DayExpressEventResponse", ygjVar, 20);
        zna0Var.j("liga", true);
        zna0Var.j("sport", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("event", true);
        zna0Var.j("scores", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("num", true);
        zna0Var.j("mainGameId", true);
        zna0Var.j("constId", true);
        zna0Var.j("startTs", true);
        zna0Var.j("countryId", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("periodName", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("kind", true);
        zna0Var.j("hasHeadToHead", true);
        zna0Var.j("subscriptionAvailable", true);
        zna0Var.j("gameTypeName", true);
        zna0Var.j("gameVidName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(vlz.f37652a);
        jiy jiyVarJ1 = mrv.j0(yjl0.f42745a);
        l280 l280Var = l280.f19295a;
        jiy jiyVarJ2 = mrv.j0(l280Var);
        jiy jiyVarJ3 = mrv.j0(l280Var);
        jiy jiyVarJ4 = mrv.j0(pbo.f26717a);
        jiy jiyVarJ5 = mrv.j0(dij.f6142a);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(s710Var);
        jiy jiyVarJ11 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(ysm0Var);
        jiy jiyVarJ14 = mrv.j0(s710Var);
        jiy jiyVarJ15 = mrv.j0(okx.f25427a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        fmz fmzVar;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str = null;
        Long l5 = null;
        int i2 = 0;
        String str2 = null;
        Long l6 = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        Long l7 = null;
        boolean z = true;
        fmz fmzVar2 = null;
        skl0 skl0Var = null;
        e380 e380Var = null;
        e380 e380Var2 = null;
        ubo uboVar = null;
        fij fijVar = null;
        Long l8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    fmzVar = fmzVar2;
                    z = false;
                    l3 = l3;
                    l7 = l7;
                    fmzVar2 = fmzVar;
                    l2 = l2;
                    break;
                case 0:
                    fmzVar = (fmz) bldVarA.e(ugi0Var, 0, vlz.f37652a, fmzVar2);
                    i2 |= 1;
                    l3 = l3;
                    l7 = l7;
                    l5 = l5;
                    fmzVar2 = fmzVar;
                    l2 = l2;
                    break;
                case 1:
                    l = l7;
                    skl0Var = (skl0) bldVarA.e(ugi0Var, 1, yjl0.f42745a, skl0Var);
                    i2 |= 2;
                    e380Var = e380Var;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 2:
                    l = l7;
                    e380Var = (e380) bldVarA.e(ugi0Var, 2, l280.f19295a, e380Var);
                    i2 |= 4;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 3:
                    l = l7;
                    e380Var2 = (e380) bldVarA.e(ugi0Var, 3, l280.f19295a, e380Var2);
                    i2 |= 8;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 4:
                    l = l7;
                    uboVar = (ubo) bldVarA.e(ugi0Var, 4, pbo.f26717a, uboVar);
                    i2 |= 16;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 5:
                    l = l7;
                    fijVar = (fij) bldVarA.e(ugi0Var, 5, dij.f6142a, fijVar);
                    i2 |= 32;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 6:
                    l = l7;
                    l8 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l8);
                    i2 |= 64;
                    l7 = l;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 7:
                    l2 = l2;
                    l5 = l5;
                    l7 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l7);
                    i2 |= 128;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 8:
                    l2 = l2;
                    l5 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l5);
                    i2 |= 256;
                    l7 = l7;
                    l2 = l2;
                    break;
                case 9:
                    l5 = l5;
                    l7 = l7;
                    l4 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l4);
                    i2 |= 512;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 10:
                    l5 = l5;
                    l7 = l7;
                    l3 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l3);
                    i2 |= 1024;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 11:
                    l5 = l5;
                    l7 = l7;
                    l2 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l2);
                    i2 |= 2048;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 12:
                    l5 = l5;
                    l7 = l7;
                    str = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str);
                    i2 |= 4096;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 13:
                    l5 = l5;
                    l7 = l7;
                    str2 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str2);
                    i2 |= 8192;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 14:
                    l5 = l5;
                    l7 = l7;
                    l6 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l6);
                    i2 |= 16384;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 15:
                    num = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num);
                    i = 32768;
                    i2 |= i;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 16:
                    bool = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool);
                    i = 65536;
                    i2 |= i;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 17:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool2);
                    i = 131072;
                    i2 |= i;
                    l7 = l7;
                    l5 = l5;
                    break;
                case 18:
                    str3 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str3);
                    i = 262144;
                    i2 |= i;
                    l7 = l7;
                    l5 = l5;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str4 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str4);
                    i = 524288;
                    i2 |= i;
                    l7 = l7;
                    l5 = l5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l9 = l2;
        Long l10 = l7;
        fmz fmzVar3 = fmzVar2;
        skl0 skl0Var2 = skl0Var;
        e380 e380Var3 = e380Var;
        bldVarA.c(ugi0Var);
        String str5 = str4;
        return new ahj(i2, fmzVar3, skl0Var2, e380Var3, e380Var2, uboVar, fijVar, l8, l10, l5, l4, l3, l9, str, str2, l6, num, bool, bool2, str3, str5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ahj ahjVar = (ahj) obj;
        ahjVar.getClass();
        String str = ahjVar.t;
        String str2 = ahjVar.s;
        Boolean bool = ahjVar.r;
        Boolean bool2 = ahjVar.q;
        Integer num = ahjVar.p;
        Long l = ahjVar.o;
        String str3 = ahjVar.n;
        String str4 = ahjVar.m;
        Long l2 = ahjVar.l;
        Long l3 = ahjVar.k;
        Long l4 = ahjVar.j;
        Long l5 = ahjVar.i;
        Long l6 = ahjVar.h;
        Long l7 = ahjVar.g;
        fij fijVar = ahjVar.f;
        ubo uboVar = ahjVar.e;
        e380 e380Var = ahjVar.d;
        e380 e380Var2 = ahjVar.c;
        skl0 skl0Var = ahjVar.b;
        fmz fmzVar = ahjVar.f877a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || fmzVar != null) {
            cldVarA.p(ugi0Var, 0, vlz.f37652a, fmzVar);
        }
        if (cldVarA.u(ugi0Var) || skl0Var != null) {
            cldVarA.p(ugi0Var, 1, yjl0.f42745a, skl0Var);
        }
        if (cldVarA.u(ugi0Var) || e380Var2 != null) {
            cldVarA.p(ugi0Var, 2, l280.f19295a, e380Var2);
        }
        if (cldVarA.u(ugi0Var) || e380Var != null) {
            cldVarA.p(ugi0Var, 3, l280.f19295a, e380Var);
        }
        if (cldVarA.u(ugi0Var) || uboVar != null) {
            cldVarA.p(ugi0Var, 4, pbo.f26717a, uboVar);
        }
        if (cldVarA.u(ugi0Var) || fijVar != null) {
            cldVarA.p(ugi0Var, 5, dij.f6142a, fijVar);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
