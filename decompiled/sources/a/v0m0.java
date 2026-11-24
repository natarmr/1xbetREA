package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v0m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0m0 f36588a;
    private static final ugi0 descriptor;

    static {
        v0m0 v0m0Var = new v0m0();
        f36588a = v0m0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stage_net.data.models.StageNetGameResponse", v0m0Var, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("stringScore1", true);
        zna0Var.j("stringScore2", true);
        zna0Var.j("dateStart", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("winner", true);
        zna0Var.j("feedGameId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
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
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
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
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new x0m0(i, str, str2, str3, num3, num4, str4, str5, l2, num2, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x0m0 x0m0Var = (x0m0) obj;
        x0m0Var.getClass();
        Long l = x0m0Var.k;
        Integer num = x0m0Var.j;
        Integer num2 = x0m0Var.i;
        Long l2 = x0m0Var.h;
        String str = x0m0Var.g;
        String str2 = x0m0Var.f;
        Integer num3 = x0m0Var.e;
        Integer num4 = x0m0Var.d;
        String str3 = x0m0Var.c;
        String str4 = x0m0Var.b;
        String str5 = x0m0Var.f40077a;
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
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
