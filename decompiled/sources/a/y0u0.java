package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y0u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0u0 f41825a;
    private static final ugi0 descriptor;

    static {
        y0u0 y0u0Var = new y0u0();
        f41825a = y0u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.model.matches.ValorantStatisticMatchesResponse", y0u0Var, 11);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("tournamentId", true);
        zna0Var.j("finished", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("team1Score", true);
        zna0Var.j("team2Score", true);
        zna0Var.j("startTime", true);
        zna0Var.j("startTimeStamp", true);
        zna0Var.j("matches", true);
        zna0Var.j("teamsAdvantage", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = a1u0.l;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(sm8.f32432a);
        f1u0 f1u0Var = f1u0.f8784a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(f1u0Var), mrv.j0(f1u0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = a1u0.l;
        List list = null;
        List list2 = null;
        Long l = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num = null;
        Long l2 = null;
        Boolean bool = null;
        h1u0 h1u0Var = null;
        h1u0 h1u0Var2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    h1u0Var = (h1u0) bldVarA.e(ugi0Var, 3, f1u0.f8784a, h1u0Var);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    h1u0Var2 = (h1u0) bldVarA.e(ugi0Var, 4, f1u0.f8784a, h1u0Var2);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new a1u0(i, num, l2, bool, h1u0Var, h1u0Var2, num2, num3, str, l, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a1u0 a1u0Var = (a1u0) obj;
        a1u0Var.getClass();
        List list = a1u0Var.k;
        List list2 = a1u0Var.j;
        Long l = a1u0Var.i;
        String str = a1u0Var.h;
        Integer num = a1u0Var.g;
        Integer num2 = a1u0Var.f;
        h1u0 h1u0Var = a1u0Var.e;
        h1u0 h1u0Var2 = a1u0Var.d;
        Boolean bool = a1u0Var.c;
        Long l2 = a1u0Var.b;
        Integer num3 = a1u0Var.f91a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = a1u0.l;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || h1u0Var2 != null) {
            cldVarA.p(ugi0Var, 3, f1u0.f8784a, h1u0Var2);
        }
        if (cldVarA.u(ugi0Var) || h1u0Var != null) {
            cldVarA.p(ugi0Var, 4, f1u0.f8784a, h1u0Var);
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
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
