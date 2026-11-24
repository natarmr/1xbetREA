package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0e0 f12231a;
    private static final ugi0 descriptor;

    static {
        h0e0 h0e0Var = new h0e0();
        f12231a = h0e0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.RainbowStatisticMatchesResponse", h0e0Var, 12);
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
        zna0Var.j("comparison", true);
        zna0Var.j("mapPicks", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = j0e0.m;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(sm8.f32432a);
        r0e0 r0e0Var = r0e0.f29625a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(r0e0Var), mrv.j0(r0e0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0(tyd0.f34749a), mrv.j0((jiy) a8zVarArr[11].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = j0e0.m;
        List list = null;
        vyd0 vyd0Var = null;
        List list2 = null;
        Long l = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num = null;
        Long l2 = null;
        Boolean bool = null;
        t0e0 t0e0Var = null;
        t0e0 t0e0Var2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    z = z;
                    list = list;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    z = z;
                    num = num;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    z = z;
                    num = num;
                    break;
                case 3:
                    t0e0Var = (t0e0) bldVarA.e(ugi0Var, 3, r0e0.f29625a, t0e0Var);
                    i |= 8;
                    z = z;
                    num = num;
                    break;
                case 4:
                    t0e0Var2 = (t0e0) bldVarA.e(ugi0Var, 4, r0e0.f29625a, t0e0Var2);
                    i |= 16;
                    z = z;
                    num = num;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    z = z;
                    num = num;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    z = z;
                    num = num;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    z = z;
                    num = num;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    z = z;
                    num = num;
                    break;
                case 9:
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i |= 512;
                    z = z;
                    num = num;
                    break;
                case 10:
                    vyd0Var = (vyd0) bldVarA.e(ugi0Var, 10, tyd0.f34749a, vyd0Var);
                    i |= 1024;
                    z = z;
                    num = num;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    z = z;
                    num = num;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new j0e0(i, num, l2, bool, t0e0Var, t0e0Var2, num2, num3, str, l, list2, vyd0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j0e0 j0e0Var = (j0e0) obj;
        j0e0Var.getClass();
        List list = j0e0Var.l;
        vyd0 vyd0Var = j0e0Var.k;
        List list2 = j0e0Var.j;
        Long l = j0e0Var.i;
        String str = j0e0Var.h;
        Integer num = j0e0Var.g;
        Integer num2 = j0e0Var.f;
        t0e0 t0e0Var = j0e0Var.e;
        t0e0 t0e0Var2 = j0e0Var.d;
        Boolean bool = j0e0Var.c;
        Long l2 = j0e0Var.b;
        Integer num3 = j0e0Var.f15680a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = j0e0.m;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || t0e0Var2 != null) {
            cldVarA.p(ugi0Var, 3, r0e0.f29625a, t0e0Var2);
        }
        if (cldVarA.u(ugi0Var) || t0e0Var != null) {
            cldVarA.p(ugi0Var, 4, r0e0.f29625a, t0e0Var);
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
        if (cldVarA.u(ugi0Var) || vyd0Var != null) {
            cldVarA.p(ugi0Var, 10, tyd0.f34749a, vyd0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
