package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jq7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jq7 f16936a;
    private static final ugi0 descriptor;

    static {
        jq7 jq7Var = new jq7();
        f16936a = jq7Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.BetZipResponse", jq7Var, 25);
        zna0Var.j(TokenNames.T, true);
        zna0Var.k(new iy(new String[]{"Type"}, (byte) 9));
        zna0Var.j(TokenNames.C, true);
        zna0Var.k(new iy(new String[]{"Coef"}, (byte) 9));
        zna0Var.j("G", true);
        zna0Var.k(new iy(new String[]{"GS"}, (byte) 9));
        zna0Var.j("P", true);
        zna0Var.k(new iy(new String[]{"Param"}, (byte) 9));
        zna0Var.j("PM", true);
        zna0Var.k(new iy(new String[]{"ParamMobile"}, (byte) 9));
        zna0Var.j("B", true);
        zna0Var.k(new iy(new String[]{"Block"}, (byte) 9));
        zna0Var.j("CV", true);
        zna0Var.j("MN", true);
        zna0Var.k(new iy(new String[]{"MarketName"}, (byte) 9));
        zna0Var.j("PL", true);
        zna0Var.j("EI", true);
        zna0Var.j("MI", true);
        zna0Var.j("SA", true);
        zna0Var.j("Kind", true);
        zna0Var.j("GameId", true);
        zna0Var.j("IsRelation", true);
        zna0Var.j("PlayerId", true);
        zna0Var.j("Finish", true);
        zna0Var.j("SubSportId", true);
        zna0Var.j("IsBannedExpress", true);
        zna0Var.j("NotValid", true);
        zna0Var.j("PlayersDuel", true);
        zna0Var.j("CE", true);
        zna0Var.j("OptionLowerCf", true);
        zna0Var.j("OptionLowerCfView", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(uh7.f35663a);
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, tblVar, jiyVarJ0, tblVar, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(iga0.f14728a), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(lq7.f20472a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        double dT = 0.0d;
        double dT2 = 0.0d;
        String str = null;
        Double d = null;
        nq7 nq7Var = null;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num2 = null;
        kga0 kga0Var = null;
        int i2 = 0;
        Integer num3 = null;
        Long l2 = null;
        Integer num4 = null;
        Long l3 = null;
        Boolean bool3 = null;
        boolean z = true;
        Long l4 = null;
        String str2 = null;
        Boolean bool4 = null;
        String str3 = null;
        String str4 = null;
        wh7 wh7Var = null;
        Integer num5 = null;
        Long l5 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str;
                    l2 = l2;
                    z = false;
                    l2 = l2;
                    str = str;
                    break;
                case 0:
                    num = num3;
                    jR = bldVarA.r(ugi0Var, 0);
                    i2 |= 1;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 1:
                    dT2 = bldVarA.t(ugi0Var, 1);
                    i2 |= 2;
                    num3 = num3;
                    str = str;
                    break;
                case 2:
                    num = num3;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 3:
                    dT = bldVarA.t(ugi0Var, 3);
                    i2 |= 8;
                    num3 = num3;
                    str = str;
                    break;
                case 4:
                    num = num3;
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i2 |= 16;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 5:
                    num = num3;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool4);
                    i2 |= 32;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 6:
                    num = num3;
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i2 |= 64;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 7:
                    num = num3;
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i2 |= 128;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 8:
                    num = num3;
                    wh7Var = (wh7) bldVarA.e(ugi0Var, 8, uh7.f35663a, wh7Var);
                    i2 |= 256;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 9:
                    num = num3;
                    num5 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num5);
                    i2 |= 512;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 10:
                    num = num3;
                    l5 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l5);
                    i2 |= 1024;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 11:
                    num = num3;
                    num6 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num6);
                    i2 |= 2048;
                    num3 = num;
                    l2 = l2;
                    str = str;
                    break;
                case 12:
                    str = str;
                    l2 = l2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num3);
                    i2 |= 4096;
                    l2 = l2;
                    str = str;
                    break;
                case 13:
                    l2 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l2);
                    i2 |= 8192;
                    num3 = num3;
                    str = str;
                    break;
                case 14:
                    num3 = num3;
                    l2 = l2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num4);
                    i2 |= 16384;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 15:
                    l3 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l3);
                    i = 32768;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 16:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool3);
                    i = 65536;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 17:
                    l = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l);
                    i = 131072;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 18:
                    bool = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool);
                    i = 262144;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 19, sm8.f32432a, bool2);
                    i = 524288;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 20:
                    kga0Var = (kga0) bldVarA.e(ugi0Var, 20, iga0.f14728a, kga0Var);
                    i = 1048576;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 21:
                    num2 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num2);
                    i = 2097152;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 22:
                    d = (Double) bldVarA.e(ugi0Var, 22, tbl.f33669a, d);
                    i = 4194304;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 23:
                    str = (String) bldVarA.e(ugi0Var, 23, ysm0.f43175a, str);
                    i = 8388608;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 24:
                    nq7Var = (nq7) bldVarA.e(ugi0Var, 24, lq7.f20472a, nq7Var);
                    i = 16777216;
                    i2 |= i;
                    num3 = num3;
                    l2 = l2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str5 = str;
        Long l6 = l4;
        bldVarA.c(ugi0Var);
        return new oq7(i2, jR, dT2, l6, dT, str2, bool4, str3, str4, wh7Var, num5, l5, num6, num3, l2, num4, l3, bool3, l, bool, bool2, kga0Var, num2, d, str5, nq7Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oq7 oq7Var = (oq7) obj;
        oq7Var.getClass();
        nq7 nq7Var = oq7Var.y;
        String str = oq7Var.x;
        Double d = oq7Var.w;
        Integer num = oq7Var.v;
        kga0 kga0Var = oq7Var.u;
        Boolean bool = oq7Var.t;
        Boolean bool2 = oq7Var.s;
        Long l = oq7Var.r;
        Boolean bool3 = oq7Var.q;
        Long l2 = oq7Var.p;
        Integer num2 = oq7Var.o;
        Long l3 = oq7Var.n;
        Integer num3 = oq7Var.m;
        Integer num4 = oq7Var.l;
        Long l4 = oq7Var.k;
        Integer num5 = oq7Var.j;
        wh7 wh7Var = oq7Var.i;
        String str2 = oq7Var.h;
        String str3 = oq7Var.g;
        Boolean bool4 = oq7Var.f;
        String str4 = oq7Var.e;
        double d2 = oq7Var.d;
        Long l5 = oq7Var.c;
        double d3 = oq7Var.b;
        long j = oq7Var.f25674a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 0, j);
        }
        if (cldVarA.u(ugi0Var) || Double.compare(d3, 0.0d) != 0) {
            cldVarA.j(ugi0Var, 1, d3);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || Double.compare(d2, 0.0d) != 0) {
            cldVarA.j(ugi0Var, 3, d2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || wh7Var != null) {
            cldVarA.p(ugi0Var, 8, uh7.f35663a, wh7Var);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || l4 != 0) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 19, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || kga0Var != null) {
            cldVarA.p(ugi0Var, 20, iga0.f14728a, kga0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 22, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 23, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || nq7Var != null) {
            cldVarA.p(ugi0Var, 24, lq7.f20472a, nq7Var);
        }
        cldVarA.c(ugi0Var);
    }
}
