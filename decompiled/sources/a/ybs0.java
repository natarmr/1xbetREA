package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ybs0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ybs0 f42354a;
    private static final ugi0 descriptor;

    static {
        ybs0 ybs0Var = new ybs0();
        f42354a = ybs0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.api.domain.models.TrackGameInfo", ybs0Var, 24);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("sportId", false);
        zna0Var.j("subSportId", false);
        zna0Var.j("live", false);
        zna0Var.j("champId", false);
        zna0Var.j("champName", false);
        zna0Var.j("matchName", false);
        zna0Var.j("fullName", false);
        zna0Var.j("timeStart", false);
        zna0Var.j("sportName", false);
        zna0Var.j("teamOneId", false);
        zna0Var.j("teamOneName", false);
        zna0Var.j("teamOneImageNew", false);
        zna0Var.j("teamTwoId", false);
        zna0Var.j("teamTwoName", false);
        zna0Var.j("teamTwoImageNew", false);
        zna0Var.j("matchScore", false);
        zna0Var.j("periodStr", false);
        zna0Var.j("vid", false);
        zna0Var.j("isFinished", false);
        zna0Var.j("statGameId", false);
        zna0Var.j("teamOneSecondImage", false);
        zna0Var.j("teamTwoSecondImage", false);
        zna0Var.j("homeAwayFlag", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, s710Var, sm8Var, s710Var, ysm0Var, ysm0Var, ysm0Var, s710Var, ysm0Var, s710Var, ysm0Var, ysm0Var, s710Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, sm8Var, ysm0Var, jiyVarJ0, jiyVarJ1, jiyVarJ2};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        long jR4 = 0;
        long jR5 = 0;
        long jR6 = 0;
        long jR7 = 0;
        boolean z = true;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        int i2 = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        String strX10 = null;
        String strX11 = null;
        boolean zB2 = false;
        String strX12 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    jR3 = bldVarA.r(ugi0Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    zB = bldVarA.B(ugi0Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    jR4 = bldVarA.r(ugi0Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strX = bldVarA.x(ugi0Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strX2 = bldVarA.x(ugi0Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strX3 = bldVarA.x(ugi0Var, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    jR5 = bldVarA.r(ugi0Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strX4 = bldVarA.x(ugi0Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    jR6 = bldVarA.r(ugi0Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strX5 = bldVarA.x(ugi0Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strX6 = bldVarA.x(ugi0Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    jR7 = bldVarA.r(ugi0Var, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strX7 = bldVarA.x(ugi0Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strX8 = bldVarA.x(ugi0Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strX9 = bldVarA.x(ugi0Var, 16);
                    i = 65536;
                    break;
                case 17:
                    strX10 = bldVarA.x(ugi0Var, 17);
                    i = 131072;
                    break;
                case 18:
                    strX11 = bldVarA.x(ugi0Var, 18);
                    i = 262144;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    zB2 = bldVarA.B(ugi0Var, 19);
                    i = 524288;
                    break;
                case 20:
                    strX12 = bldVarA.x(ugi0Var, 20);
                    i = 1048576;
                    break;
                case 21:
                    str = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str);
                    i = 2097152;
                    break;
                case 22:
                    str2 = (String) bldVarA.e(ugi0Var, 22, ysm0.f43175a, str2);
                    i = 4194304;
                    break;
                case 23:
                    bool = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool);
                    i = 8388608;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            i2 |= i;
        }
        bldVarA.c(ugi0Var);
        return new acs0(i2, jR, jR2, jR3, zB, jR4, strX, strX2, strX3, jR5, strX4, jR6, strX5, strX6, jR7, strX7, strX8, strX9, strX10, strX11, zB2, strX12, str, str2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        acs0 acs0Var = (acs0) obj;
        acs0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, acs0Var.f644a);
        cldVarA.n(ugi0Var, 1, acs0Var.b);
        cldVarA.n(ugi0Var, 2, acs0Var.c);
        cldVarA.x(ugi0Var, 3, acs0Var.d);
        cldVarA.n(ugi0Var, 4, acs0Var.e);
        cldVarA.z(ugi0Var, 5, acs0Var.f);
        cldVarA.z(ugi0Var, 6, acs0Var.g);
        cldVarA.z(ugi0Var, 7, acs0Var.h);
        cldVarA.n(ugi0Var, 8, acs0Var.i);
        cldVarA.z(ugi0Var, 9, acs0Var.j);
        cldVarA.n(ugi0Var, 10, acs0Var.k);
        cldVarA.z(ugi0Var, 11, acs0Var.l);
        cldVarA.z(ugi0Var, 12, acs0Var.m);
        cldVarA.n(ugi0Var, 13, acs0Var.n);
        cldVarA.z(ugi0Var, 14, acs0Var.o);
        cldVarA.z(ugi0Var, 15, acs0Var.p);
        cldVarA.z(ugi0Var, 16, acs0Var.q);
        cldVarA.z(ugi0Var, 17, acs0Var.r);
        cldVarA.z(ugi0Var, 18, acs0Var.s);
        cldVarA.x(ugi0Var, 19, acs0Var.t);
        cldVarA.z(ugi0Var, 20, acs0Var.u);
        ysm0 ysm0Var = ysm0.f43175a;
        cldVarA.p(ugi0Var, 21, ysm0Var, acs0Var.v);
        cldVarA.p(ugi0Var, 22, ysm0Var, acs0Var.w);
        cldVarA.p(ugi0Var, 23, sm8.f32432a, acs0Var.x);
        cldVarA.c(ugi0Var);
    }
}
