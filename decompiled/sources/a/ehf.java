package a;

import android.gov.nist.javax.sip.ListeningPointExt;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ehf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ehf f7805a;
    private static final ugi0 descriptor;

    static {
        ehf ehfVar = new ehf();
        f7805a = ehfVar;
        zna0 zna0Var = new zna0("org.xplatform.crystal.data.models.responses.CrystalRoundResponse", ehfVar, 3);
        zna0Var.j("MAP", true);
        zna0Var.j(ListeningPointExt.WS, true);
        zna0Var.j("NC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ghf.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ghf.d;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ghf(i, list, list2, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ghf ghfVar = (ghf) obj;
        ghfVar.getClass();
        Map map = ghfVar.c;
        List list = ghfVar.b;
        List list2 = ghfVar.f11295a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ghf.d;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
