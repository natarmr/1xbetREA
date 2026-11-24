package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x0p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0p0 f40082a;
    private static final ugi0 descriptor;

    static {
        x0p0 x0p0Var = new x0p0();
        f40082a = x0p0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.teambet.models.TeamBetLastGameResponse", x0p0Var, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("score1", true);
        zna0Var.j("stringScore1", true);
        zna0Var.j("score2", true);
        zna0Var.j("stringScore2", true);
        zna0Var.j("dateStart", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("winner", true);
        zna0Var.j("noScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        String str5 = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i |= 128;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new z0p0(i, str, str2, str3, num3, str4, num4, str5, l, num2, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z0p0 z0p0Var = (z0p0) obj;
        z0p0Var.getClass();
        Boolean bool = z0p0Var.k;
        Integer num = z0p0Var.j;
        Integer num2 = z0p0Var.i;
        Long l = z0p0Var.h;
        String str = z0p0Var.g;
        Integer num3 = z0p0Var.f;
        String str2 = z0p0Var.e;
        Integer num4 = z0p0Var.d;
        String str3 = z0p0Var.c;
        String str4 = z0p0Var.b;
        String str5 = z0p0Var.f43580a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
