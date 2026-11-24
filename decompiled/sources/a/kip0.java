package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kip0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kip0 f18347a;
    private static final ugi0 descriptor;

    static {
        kip0 kip0Var = new kip0();
        f18347a = kip0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.referee.referee_card_last_game.data.model.TeamResultsResponse", kip0Var, 10);
        zna0Var.j("dateStart", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("stringStageTitle", true);
        zna0Var.j("team1", true);
        zna0Var.j("team1Id", true);
        zna0Var.j("team2", true);
        zna0Var.j("team2Id", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        z4p0 z4p0Var = z4p0.f43782a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(z4p0Var), mrv.j0(ysm0Var), mrv.j0(z4p0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        b5p0 b5p0Var = null;
        int i = 0;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        b5p0 b5p0Var2 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
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
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    b5p0Var2 = (b5p0) bldVarA.e(ugi0Var, 6, z4p0.f43782a, b5p0Var2);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    break;
                case 8:
                    b5p0Var = (b5p0) bldVarA.e(ugi0Var, 8, z4p0.f43782a, b5p0Var);
                    i |= 256;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new mip0(i, num, str2, num2, num3, num4, str3, b5p0Var2, str4, b5p0Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mip0 mip0Var = (mip0) obj;
        mip0Var.getClass();
        String str = mip0Var.j;
        b5p0 b5p0Var = mip0Var.i;
        String str2 = mip0Var.h;
        b5p0 b5p0Var2 = mip0Var.g;
        String str3 = mip0Var.f;
        Integer num = mip0Var.e;
        Integer num2 = mip0Var.d;
        Integer num3 = mip0Var.c;
        String str4 = mip0Var.b;
        Integer num4 = mip0Var.f21855a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || b5p0Var2 != null) {
            cldVarA.p(ugi0Var, 6, z4p0.f43782a, b5p0Var2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || b5p0Var != null) {
            cldVarA.p(ugi0Var, 8, z4p0.f43782a, b5p0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
