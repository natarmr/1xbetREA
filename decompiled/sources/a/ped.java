package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ped implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ped f26846a;
    private static final ugi0 descriptor;

    static {
        ped pedVar = new ped();
        f26846a = pedVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.completedmatches.data.models.CompletedMatchesResponse", pedVar, 3);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ae30.f708a), mrv.j0(okx.f25427a), mrv.j0((jiy) red.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = red.d;
        boolean z = true;
        int i = 0;
        ce30 ce30Var = null;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ce30Var = (ce30) bldVarA.e(ugi0Var, 0, ae30.f708a, ce30Var);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
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
        return new red(i, ce30Var, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        red redVar = (red) obj;
        redVar.getClass();
        List list = redVar.c;
        Integer num = redVar.b;
        ce30 ce30Var = redVar.f30329a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = red.d;
        if (cldVarA.u(ugi0Var) || ce30Var != null) {
            cldVarA.p(ugi0Var, 0, ae30.f708a, ce30Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
