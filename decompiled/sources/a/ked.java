package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ked implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ked f18149a;
    private static final ugi0 descriptor;

    static {
        ked kedVar = new ked();
        f18149a = kedVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.statistic_core.data.models.CompletedMatchesGameStatisticResponse", kedVar, 12);
        zna0Var.j("dateStart", true);
        zna0Var.j("feedGameId", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("stringScore1", true);
        zna0Var.j("stringScore2", true);
        zna0Var.j("winner", true);
        zna0Var.j("noScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Integer num = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Integer num2 = null;
        Long l = null;
        String str3 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    bool = bool;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    z = z;
                    bool = bool;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    z = z;
                    num2 = num2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    z = z;
                    num2 = num2;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    z = z;
                    num2 = num2;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    z = z;
                    num2 = num2;
                    break;
                case 5:
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i |= 32;
                    z = z;
                    num2 = num2;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    z = z;
                    num2 = num2;
                    break;
                case 7:
                    str5 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str5);
                    i |= 128;
                    z = z;
                    num2 = num2;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    z = z;
                    num2 = num2;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    z = z;
                    num2 = num2;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    z = z;
                    num2 = num2;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    z = z;
                    num2 = num2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new med(i, num2, l, str3, num3, num4, num5, str4, str5, str2, str, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        med medVar = (med) obj;
        medVar.getClass();
        Boolean bool = medVar.l;
        Integer num = medVar.k;
        String str = medVar.j;
        String str2 = medVar.i;
        String str3 = medVar.h;
        String str4 = medVar.g;
        Integer num2 = medVar.f;
        Integer num3 = medVar.e;
        Integer num4 = medVar.d;
        String str5 = medVar.c;
        Long l = medVar.b;
        Integer num5 = medVar.f21639a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
