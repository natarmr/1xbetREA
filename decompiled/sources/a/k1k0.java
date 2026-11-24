package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k1k0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1k0 f17529a;
    private static final ugi0 descriptor;

    static {
        k1k0 k1k0Var = new k1k0();
        f17529a = k1k0Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.news.impl.data.models.SingleMatchResponse", k1k0Var, 22);
        zna0Var.j("teamName1", true);
        zna0Var.j("teamPicture1", true);
        zna0Var.j("teamId1", true);
        zna0Var.j("teamName2", true);
        zna0Var.j("teamPicture2", true);
        zna0Var.j("teamId2", true);
        zna0Var.j("currencyCode", true);
        zna0Var.j("champName", true);
        zna0Var.j("champId", true);
        zna0Var.j("constId", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("betDateFrom", true);
        zna0Var.j("gameId", true);
        zna0Var.j("isLive", true);
        zna0Var.j("isFinish", true);
        zna0Var.j("PP", true);
        zna0Var.j("bonusSumTo", true);
        zna0Var.j("sportId", true);
        zna0Var.j("site", true);
        zna0Var.j("bonusSumFixed", true);
        zna0Var.j("subsportId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(s710Var);
        jiy jiyVarJ11 = mrv.j0(s710Var);
        jiy jiyVarJ12 = mrv.j0(s710Var);
        jiy jiyVarJ13 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ14 = mrv.j0(sm8Var);
        jiy jiyVarJ15 = mrv.j0(sm8Var);
        jiy jiyVarJ16 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, mrv.j0(tblVar), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        int i2 = 0;
        Long l7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        Double d = null;
        Long l8 = null;
        String str3 = null;
        Double d2 = null;
        boolean z = true;
        String str4 = null;
        String str5 = null;
        Long l9 = null;
        String str6 = null;
        String str7 = null;
        Long l10 = null;
        String str8 = null;
        String str9 = null;
        Long l11 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    l4 = l4;
                    str4 = str;
                    l2 = l2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    str5 = str5;
                    l4 = l4;
                    l3 = l3;
                    str4 = str;
                    l2 = l2;
                    break;
                case 1:
                    l = l4;
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i2 |= 2;
                    l9 = l9;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 2:
                    l = l4;
                    l9 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l9);
                    i2 |= 4;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 3:
                    l = l4;
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i2 |= 8;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 4:
                    l = l4;
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i2 |= 16;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 5:
                    l = l4;
                    l10 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l10);
                    i2 |= 32;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 6:
                    l = l4;
                    str8 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str8);
                    i2 |= 64;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 7:
                    l = l4;
                    str9 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str9);
                    i2 |= 128;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 8:
                    l = l4;
                    l11 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l11);
                    i2 |= 256;
                    l4 = l;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 9:
                    l2 = l2;
                    l3 = l3;
                    l4 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l4);
                    i2 |= 512;
                    l3 = l3;
                    l2 = l2;
                    break;
                case 10:
                    l2 = l2;
                    l3 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l3);
                    i2 |= 1024;
                    l4 = l4;
                    l2 = l2;
                    break;
                case 11:
                    l3 = l3;
                    l4 = l4;
                    l2 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l2);
                    i2 |= 2048;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 12:
                    l3 = l3;
                    l4 = l4;
                    l5 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l5);
                    i2 |= 4096;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 13:
                    l3 = l3;
                    l4 = l4;
                    l7 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l7);
                    i2 |= 8192;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 14:
                    l3 = l3;
                    l4 = l4;
                    bool = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool);
                    i2 |= 16384;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 15:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool2);
                    i = 32768;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 16:
                    str2 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str2);
                    i = 65536;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 17:
                    d = (Double) bldVarA.e(ugi0Var, 17, tbl.f33669a, d);
                    i = 131072;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 18:
                    l8 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l8);
                    i = 262144;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str3 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str3);
                    i = 524288;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 20:
                    d2 = (Double) bldVarA.e(ugi0Var, 20, tbl.f33669a, d2);
                    i = 1048576;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                case 21:
                    l6 = (Long) bldVarA.e(ugi0Var, 21, s710.f31729a, l6);
                    i = 2097152;
                    i2 |= i;
                    l4 = l4;
                    l3 = l3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l12 = l2;
        Long l13 = l4;
        String str10 = str4;
        String str11 = str5;
        Long l14 = l9;
        bldVarA.c(ugi0Var);
        String str12 = str3;
        return new m1k0(i2, str10, str11, l14, str6, str7, l10, str8, str9, l11, l13, l3, l12, l5, l7, bool, bool2, str2, d, l8, str12, d2, l6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m1k0 m1k0Var = (m1k0) obj;
        m1k0Var.getClass();
        Long l = m1k0Var.v;
        Double d = m1k0Var.u;
        String str = m1k0Var.t;
        Long l2 = m1k0Var.s;
        Double d2 = m1k0Var.r;
        String str2 = m1k0Var.q;
        Boolean bool = m1k0Var.p;
        Boolean bool2 = m1k0Var.o;
        Long l3 = m1k0Var.n;
        Long l4 = m1k0Var.m;
        Long l5 = m1k0Var.l;
        Long l6 = m1k0Var.k;
        Long l7 = m1k0Var.j;
        Long l8 = m1k0Var.i;
        String str3 = m1k0Var.h;
        String str4 = m1k0Var.g;
        Long l9 = m1k0Var.f;
        String str5 = m1k0Var.e;
        String str6 = m1k0Var.d;
        Long l10 = m1k0Var.c;
        String str7 = m1k0Var.b;
        String str8 = m1k0Var.f21013a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || l10 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l10);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l9 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l9);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 17, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 20, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 21, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
