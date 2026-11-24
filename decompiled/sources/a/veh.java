package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class veh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final veh f37288a;
    private static final ugi0 descriptor;

    static {
        veh vehVar = new veh();
        f37288a = vehVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.stagetable.CyberStageTableResponse", vehVar, 3);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) xeh.d[1].getValue()), mrv.j0(reh.f30334a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xeh.d;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        teh tehVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                tehVar = (teh) bldVarA.e(ugi0Var, 2, reh.f30334a, tehVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new xeh(i, num, list, tehVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xeh xehVar = (xeh) obj;
        xehVar.getClass();
        teh tehVar = xehVar.c;
        List list = xehVar.b;
        Integer num = xehVar.f40746a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xeh.d;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || tehVar != null) {
            cldVarA.p(ugi0Var, 2, reh.f30334a, tehVar);
        }
        cldVarA.c(ugi0Var);
    }
}
