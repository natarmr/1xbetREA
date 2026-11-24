package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uh50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uh50 f35660a;
    private static final ugi0 descriptor;

    static {
        uh50 uh50Var = new uh50();
        f35660a = uh50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsScoresResponse", uh50Var, 11);
        zna0Var.j("fullScore", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("subScore", true);
        zna0Var.j("serve", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("isBreak", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("timer", true);
        zna0Var.j("tabloStats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wh50.l;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(gg50.f11238a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(kg50.f18224a), mrv.j0(ci50.f4396a), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(ysm0Var), mrv.j0(oi50.f25296a), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = wh50.l;
        Map map = null;
        qi50 qi50Var = null;
        String str = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        String str2 = null;
        ig50 ig50Var = null;
        List list = null;
        mg50 mg50Var = null;
        ei50 ei50Var = null;
        Long l = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    ig50Var = (ig50) bldVarA.e(ugi0Var, 1, gg50.f11238a, ig50Var);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    mg50Var = (mg50) bldVarA.e(ugi0Var, 3, kg50.f18224a, mg50Var);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    ei50Var = (ei50) bldVarA.e(ugi0Var, 4, ci50.f4396a, ei50Var);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    qi50Var = (qi50) bldVarA.e(ugi0Var, 9, oi50.f25296a, qi50Var);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    map = (Map) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), map);
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
        return new wh50(i, str2, ig50Var, list, mg50Var, ei50Var, l, str3, bool, str, qi50Var, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wh50 wh50Var = (wh50) obj;
        wh50Var.getClass();
        Map map = wh50Var.k;
        qi50 qi50Var = wh50Var.j;
        String str = wh50Var.i;
        Boolean bool = wh50Var.h;
        String str2 = wh50Var.g;
        Long l = wh50Var.f;
        ei50 ei50Var = wh50Var.e;
        mg50 mg50Var = wh50Var.d;
        List list = wh50Var.c;
        ig50 ig50Var = wh50Var.b;
        String str3 = wh50Var.f39150a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wh50.l;
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || ig50Var != null) {
            cldVarA.p(ugi0Var, 1, gg50.f11238a, ig50Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || mg50Var != null) {
            cldVarA.p(ugi0Var, 3, kg50.f18224a, mg50Var);
        }
        if (cldVarA.u(ugi0Var) || ei50Var != null) {
            cldVarA.p(ugi0Var, 4, ci50.f4396a, ei50Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || qi50Var != null) {
            cldVarA.p(ugi0Var, 9, oi50.f25296a, qi50Var);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
