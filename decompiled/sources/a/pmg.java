package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pmg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pmg f27232a;
    private static final ugi0 descriptor;

    static {
        pmg pmgVar = new pmg();
        f27232a = pmgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.CyberDotaMatchesStatisticResponse", pmgVar, 10);
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
        a8z[] a8zVarArr = rmg.k;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        t8h t8hVar = t8h.f33510a;
        jiy jiyVarJ2 = mrv.j0(t8hVar);
        jiy jiyVarJ3 = mrv.j0(t8hVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rmg.k;
        List list = null;
        Long l = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        v8h v8hVar = null;
        v8h v8hVar2 = null;
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
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
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    v8hVar = (v8h) bldVarA.e(ugi0Var, 2, t8h.f33510a, v8hVar);
                    i |= 4;
                    break;
                case 3:
                    v8hVar2 = (v8h) bldVarA.e(ugi0Var, 3, t8h.f33510a, v8hVar2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
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
        return new rmg(i, num, num2, v8hVar, v8hVar2, str2, num3, num4, str, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rmg rmgVar = (rmg) obj;
        rmgVar.getClass();
        List list = rmgVar.j;
        Long l = rmgVar.i;
        String str = rmgVar.h;
        Integer num = rmgVar.g;
        Integer num2 = rmgVar.f;
        String str2 = rmgVar.e;
        v8h v8hVar = rmgVar.d;
        v8h v8hVar2 = rmgVar.c;
        Integer num3 = rmgVar.b;
        Integer num4 = rmgVar.f30743a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rmg.k;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || v8hVar2 != null) {
            cldVarA.p(ugi0Var, 2, t8h.f33510a, v8hVar2);
        }
        if (cldVarA.u(ugi0Var) || v8hVar != null) {
            cldVarA.p(ugi0Var, 3, t8h.f33510a, v8hVar);
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
