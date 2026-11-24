package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mcv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mcv f21567a;
    private static final ugi0 descriptor;

    static {
        mcv mcvVar = new mcv();
        f21567a = mcvVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.grand_prix.data.models.GrandPrixStatisticInfoResponse", mcvVar, 2);
        zna0Var.j("seasonSelectors", true);
        zna0Var.j("stages", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(bjh0.f2708a), mrv.j0((jiy) ocv.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ocv.c;
        boolean z = true;
        int i = 0;
        djh0 djh0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                djh0Var = (djh0) bldVarA.e(ugi0Var, 0, bjh0.f2708a, djh0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ocv(i, djh0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ocv ocvVar = (ocv) obj;
        ocvVar.getClass();
        List list = ocvVar.b;
        djh0 djh0Var = ocvVar.f25046a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ocv.c;
        if (cldVarA.u(ugi0Var) || djh0Var != null) {
            cldVarA.p(ugi0Var, 0, bjh0.f2708a, djh0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
