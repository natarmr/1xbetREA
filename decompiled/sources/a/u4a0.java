package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u4a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4a0 f35036a;
    private static final ugi0 descriptor;

    static {
        u4a0 u4a0Var = new u4a0();
        f35036a = u4a0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.player_lastgame.data.model.PlayerLastGameValueResponse", u4a0Var, 11);
        zna0Var.j("dateStart", true);
        zna0Var.j("goals", true);
        zna0Var.j("redCards", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j(CrashHianalyticsData.TIME, true);
        zna0Var.j("tournamentTitle", true);
        zna0Var.j("yellowCards", true);
        zna0Var.j(ParameterNames.ID, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Integer num = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Long l = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str3 = null;
        String str4 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
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
                    num6 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num6);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new w4a0(i, l, num2, num3, num4, num5, str3, str4, num6, str2, num, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w4a0 w4a0Var = (w4a0) obj;
        w4a0Var.getClass();
        String str = w4a0Var.k;
        Integer num = w4a0Var.j;
        String str2 = w4a0Var.i;
        Integer num2 = w4a0Var.h;
        String str3 = w4a0Var.g;
        String str4 = w4a0Var.f;
        Integer num3 = w4a0Var.e;
        Integer num4 = w4a0Var.d;
        Integer num5 = w4a0Var.c;
        Integer num6 = w4a0Var.b;
        Long l = w4a0Var.f38534a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
