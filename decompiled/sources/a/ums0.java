package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ums0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ums0 f35932a;
    private static final ugi0 descriptor;

    static {
        ums0 ums0Var = new ums0();
        f35932a = ums0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.TransitionResponse", ums0Var, 20);
        zna0Var.j("champId", true);
        zna0Var.j("constId", true);
        zna0Var.j("champName", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("gameStart", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("subMainConstId", true);
        zna0Var.j("gameId", true);
        zna0Var.j("mainGameId", true);
        zna0Var.j("subMainGameId", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("period", true);
        zna0Var.j("sport", true);
        zna0Var.j("gameType", true);
        zna0Var.j("gameVid", true);
        zna0Var.j("finish", true);
        zna0Var.j("isInverOpp", true);
        zna0Var.j("gameKind", true);
        zna0Var.j("statId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        Long l2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        Long l3 = null;
        Integer num = null;
        Long l4 = null;
        int i2 = 0;
        Long l5 = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        Integer num4 = null;
        Integer num5 = null;
        String str3 = null;
        Long l6 = null;
        boolean z = true;
        Long l7 = null;
        Long l8 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l9 = null;
        Long l10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l7;
                    z = false;
                    str2 = str2;
                    l6 = l6;
                    l7 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l7);
                    i2 |= 1;
                    str2 = str2;
                    l6 = l6;
                    l4 = l4;
                    l7 = l;
                    str = str;
                    break;
                case 1:
                    l2 = l6;
                    l8 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l8);
                    i2 |= 2;
                    str4 = str4;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 2:
                    l2 = l6;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i2 |= 4;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 3:
                    l2 = l6;
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i2 |= 8;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 4:
                    l2 = l6;
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i2 |= 16;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 5:
                    l2 = l6;
                    l9 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l9);
                    i2 |= 32;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 6:
                    l2 = l6;
                    l10 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l10);
                    i2 |= 64;
                    l6 = l2;
                    l4 = l4;
                    str = str;
                    break;
                case 7:
                    str = str;
                    l4 = l4;
                    l6 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l6);
                    i2 |= 128;
                    l4 = l4;
                    str = str;
                    break;
                case 8:
                    str = str;
                    l4 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l4);
                    i2 |= 256;
                    l6 = l6;
                    str = str;
                    break;
                case 9:
                    l4 = l4;
                    l6 = l6;
                    l3 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l3);
                    i2 |= 512;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 10:
                    l4 = l4;
                    l6 = l6;
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i2 |= 1024;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 11:
                    l4 = l4;
                    l6 = l6;
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i2 |= 2048;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 12:
                    l4 = l4;
                    l6 = l6;
                    num = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num);
                    i2 |= 4096;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 13:
                    l4 = l4;
                    l6 = l6;
                    l5 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l5);
                    i2 |= 8192;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 14:
                    l4 = l4;
                    l6 = l6;
                    num2 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num2);
                    i2 |= 16384;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 15:
                    num3 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num3);
                    i = 32768;
                    i2 |= i;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 16:
                    bool = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool);
                    i = 65536;
                    i2 |= i;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 17:
                    num4 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num4);
                    i = 131072;
                    i2 |= i;
                    l6 = l6;
                    l4 = l4;
                    break;
                case 18:
                    num5 = (Integer) bldVarA.e(ugi0Var, 18, okx.f25427a, num5);
                    i = 262144;
                    i2 |= i;
                    l6 = l6;
                    l4 = l4;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str3 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str3);
                    i = 524288;
                    i2 |= i;
                    l6 = l6;
                    l4 = l4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str7 = str;
        Long l11 = l6;
        Long l12 = l7;
        Long l13 = l8;
        String str8 = str4;
        bldVarA.c(ugi0Var);
        String str9 = str3;
        return new yms0(i2, l12, l13, str8, str5, str6, l9, l10, l11, l4, l3, str2, str7, num, l5, num2, num3, bool, num4, num5, str9);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yms0 yms0Var = (yms0) obj;
        yms0Var.getClass();
        String str = yms0Var.t;
        Integer num = yms0Var.s;
        Integer num2 = yms0Var.r;
        Boolean bool = yms0Var.q;
        Integer num3 = yms0Var.p;
        Integer num4 = yms0Var.o;
        Long l = yms0Var.n;
        Integer num5 = yms0Var.m;
        String str2 = yms0Var.l;
        String str3 = yms0Var.k;
        Long l2 = yms0Var.j;
        Long l3 = yms0Var.i;
        Long l4 = yms0Var.h;
        Long l5 = yms0Var.g;
        Long l6 = yms0Var.f;
        String str4 = yms0Var.e;
        String str5 = yms0Var.d;
        String str6 = yms0Var.c;
        Long l7 = yms0Var.b;
        Long l8 = yms0Var.f42907a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num5 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 18, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
