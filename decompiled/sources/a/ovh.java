package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ovh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ovh f25925a;
    private static final ugi0 descriptor;

    static {
        ovh ovhVar = new ovh();
        f25925a = ovhVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.cycling.impl.cycling_player.data.model.CyclingPlayerStatisticResponse", ovhVar, 2);
        zna0Var.j("players", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) qvh.c[0].getValue()), mrv.j0(nwh.f24233a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qvh.c;
        boolean z = true;
        int i = 0;
        List list = null;
        rwh rwhVar = null;
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
                rwhVar = (rwh) bldVarA.e(ugi0Var, 1, nwh.f24233a, rwhVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new qvh(i, list, rwhVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qvh qvhVar = (qvh) obj;
        qvhVar.getClass();
        rwh rwhVar = qvhVar.b;
        List list = qvhVar.f29386a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qvh.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || rwhVar != null) {
            cldVarA.p(ugi0Var, 1, nwh.f24233a, rwhVar);
        }
        cldVarA.c(ugi0Var);
    }
}
