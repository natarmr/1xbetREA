package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ugs implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugs f35639a;
    private static final ugi0 descriptor;

    static {
        ugs ugsVar = new ugs();
        f35639a = ugsVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.insights.GameInsightsResponse", ugsVar, 3);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("fullName", true);
        zna0Var.j("insights", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ysm0.f43175a), mrv.j0((jiy) wgs.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wgs.d;
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wgs(i, l, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wgs wgsVar = (wgs) obj;
        wgsVar.getClass();
        List list = wgsVar.c;
        String str = wgsVar.b;
        Long l = wgsVar.f39132a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wgs.d;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
