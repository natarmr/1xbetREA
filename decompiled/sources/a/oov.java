package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oov implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oov f25611a;
    private static final ugi0 descriptor;

    static {
        oov oovVar = new oov();
        f25611a = oovVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.head_to_head.model.HeadToHeadResponse", oovVar, 2);
        zna0Var.j("teams", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) qpv.c[0].getValue()), mrv.j0(sov.f32562a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qpv.c;
        boolean z = true;
        int i = 0;
        List list = null;
        cpv cpvVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                cpvVar = (cpv) bldVarA.e(ugi0Var, 1, sov.f32562a, cpvVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new qpv(i, list, cpvVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qpv qpvVar = (qpv) obj;
        qpvVar.getClass();
        cpv cpvVar = qpvVar.b;
        List list = qpvVar.f29139a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qpv.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || cpvVar != null) {
            cldVarA.p(ugi0Var, 1, sov.f32562a, cpvVar);
        }
        cldVarA.c(ugi0Var);
    }
}
