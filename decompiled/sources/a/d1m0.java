package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d1m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1m0 f5315a;
    private static final ugi0 descriptor;

    static {
        d1m0 d1m0Var = new d1m0();
        f5315a = d1m0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stage_net.data.models.StageNetResponse", d1m0Var, 3);
        zna0Var.j("teams", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) f1m0.d[0].getValue()), mrv.j0(s710.f31729a), mrv.j0(l0m0.f19210a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f1m0.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        n0m0 n0m0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                n0m0Var = (n0m0) bldVarA.e(ugi0Var, 2, l0m0.f19210a, n0m0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new f1m0(i, list, l, n0m0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f1m0 f1m0Var = (f1m0) obj;
        f1m0Var.getClass();
        n0m0 n0m0Var = f1m0Var.c;
        Long l = f1m0Var.b;
        List list = f1m0Var.f8771a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f1m0.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || n0m0Var != null) {
            cldVarA.p(ugi0Var, 2, l0m0.f19210a, n0m0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
