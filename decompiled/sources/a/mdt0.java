package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mdt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdt0 f21615a;
    private static final ugi0 descriptor;

    static {
        mdt0 mdt0Var = new mdt0();
        f21615a = mdt0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stagetable.data.common.model.UniversalStageTableBaseResponse", mdt0Var, 3);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(qdt0.f28551a), mrv.j0(s710.f31729a), mrv.j0((jiy) odt0.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = odt0.d;
        boolean z = true;
        int i = 0;
        sdt0 sdt0Var = null;
        Long l = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                sdt0Var = (sdt0) bldVarA.e(ugi0Var, 0, qdt0.f28551a, sdt0Var);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
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
        return new odt0(i, sdt0Var, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        odt0 odt0Var = (odt0) obj;
        odt0Var.getClass();
        List list = odt0Var.c;
        Long l = odt0Var.b;
        sdt0 sdt0Var = odt0Var.f25092a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = odt0.d;
        if (cldVarA.u(ugi0Var) || sdt0Var != null) {
            cldVarA.p(ugi0Var, 0, qdt0.f28551a, sdt0Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
