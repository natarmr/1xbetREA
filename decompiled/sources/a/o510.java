package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o510 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o510 f24665a;
    private static final ugi0 descriptor;

    static {
        o510 o510Var = new o510();
        f24665a = o510Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesResponse", o510Var, 10);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("tournamentId", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("team1Score", true);
        zna0Var.j("team2Score", true);
        zna0Var.j("startTime", true);
        zna0Var.j("startTimeStamp", true);
        zna0Var.j("matches", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = q510.k;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        s510 s510Var = s510.f31633a;
        jiy jiyVarJ2 = mrv.j0(s510Var);
        jiy jiyVarJ3 = mrv.j0(s510Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = q510.k;
        List list = null;
        Long l = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num = null;
        Long l2 = null;
        u510 u510Var = null;
        u510 u510Var2 = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    u510Var = (u510) bldVarA.e(ugi0Var, 2, s510.f31633a, u510Var);
                    i |= 4;
                    break;
                case 3:
                    u510Var2 = (u510) bldVarA.e(ugi0Var, 3, s510.f31633a, u510Var2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    break;
                case 9:
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new q510(i, num, l2, u510Var, u510Var2, str2, num2, num3, str, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q510 q510Var = (q510) obj;
        q510Var.getClass();
        List list = q510Var.j;
        Long l = q510Var.i;
        String str = q510Var.h;
        Integer num = q510Var.g;
        Integer num2 = q510Var.f;
        String str2 = q510Var.e;
        u510 u510Var = q510Var.d;
        u510 u510Var2 = q510Var.c;
        Long l2 = q510Var.b;
        Integer num3 = q510Var.f28127a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = q510.k;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || u510Var2 != null) {
            cldVarA.p(ugi0Var, 2, s510.f31633a, u510Var2);
        }
        if (cldVarA.u(ugi0Var) || u510Var != null) {
            cldVarA.p(ugi0Var, 3, s510.f31633a, u510Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
