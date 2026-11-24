package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class urf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final urf f36160a;
    private static final ugi0 descriptor;

    static {
        urf urfVar = new urf();
        f36160a = urfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2StatisticTeamResponse", urfVar, 5);
        zna0Var.j("LP", true);
        zna0Var.j("SC", true);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("fH", true);
        zna0Var.j("sH", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = wrf.f;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(okx.f25427a), mrv.j0(hsf.f13579a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wrf.f;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        gsf gsfVar = null;
        Map map = null;
        Map map2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                gsfVar = (gsf) bldVarA.e(ugi0Var, 2, hsf.f13579a, gsfVar);
                i |= 4;
            } else if (iF == 3) {
                map = (Map) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                map2 = (Map) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), map2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new wrf(i, list, num, gsfVar, map, map2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wrf wrfVar = (wrf) obj;
        wrfVar.getClass();
        Map map = wrfVar.e;
        Map map2 = wrfVar.d;
        gsf gsfVar = wrfVar.c;
        Integer num = wrfVar.b;
        List list = wrfVar.f39639a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wrf.f;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || gsfVar != null) {
            cldVarA.p(ugi0Var, 2, hsf.f13579a, gsfVar);
        }
        if (cldVarA.u(ugi0Var) || map2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
