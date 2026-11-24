package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pbq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pbq f26719a;
    private static final ugi0 descriptor;

    static {
        pbq pbqVar = new pbq();
        f26719a = pbqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceDataResponse", pbqVar, 3);
        zna0Var.j("PlotCollection", true);
        zna0Var.j("FIECollection", true);
        zna0Var.j("Instruments", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ccq.f4124a), mrv.j0(lcq.f19811a), mrv.j0((jiy) rbq.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rbq.d;
        boolean z = true;
        int i = 0;
        ecq ecqVar = null;
        ncq ncqVar = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ecqVar = (ecq) bldVarA.e(ugi0Var, 0, ccq.f4124a, ecqVar);
                i |= 1;
            } else if (iF == 1) {
                ncqVar = (ncq) bldVarA.e(ugi0Var, 1, lcq.f19811a, ncqVar);
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
        return new rbq(i, ecqVar, ncqVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rbq rbqVar = (rbq) obj;
        rbqVar.getClass();
        List list = rbqVar.c;
        ncq ncqVar = rbqVar.b;
        ecq ecqVar = rbqVar.f30201a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rbq.d;
        if (cldVarA.u(ugi0Var) || ecqVar != null) {
            cldVarA.p(ugi0Var, 0, ccq.f4124a, ecqVar);
        }
        if (cldVarA.u(ugi0Var) || ncqVar != null) {
            cldVarA.p(ugi0Var, 1, lcq.f19811a, ncqVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
