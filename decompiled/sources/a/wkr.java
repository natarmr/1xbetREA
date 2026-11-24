package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wkr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wkr f39321a;
    private static final ugi0 descriptor;

    static {
        wkr wkrVar = new wkr();
        f39321a = wkrVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.lastgames.data.model.Game", wkrVar, 11);
        zna0Var.j("dateStart", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("stringScore1", true);
        zna0Var.j("stringScore2", true);
        zna0Var.j("winner", true);
        zna0Var.j("feedGameId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i |= 8;
                    break;
                case 4:
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str5);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
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
        return new llr(i, num2, str2, num3, num4, num5, str3, str4, str5, str, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        llr llrVar = (llr) obj;
        llrVar.getClass();
        Long l = llrVar.k;
        Integer num = llrVar.j;
        String str = llrVar.i;
        String str2 = llrVar.h;
        String str3 = llrVar.g;
        String str4 = llrVar.f;
        Integer num2 = llrVar.e;
        Integer num3 = llrVar.d;
        Integer num4 = llrVar.c;
        String str5 = llrVar.b;
        Integer num5 = llrVar.f20262a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
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
