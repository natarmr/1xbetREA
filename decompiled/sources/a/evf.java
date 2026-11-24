package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class evf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evf f8465a;
    private static final ugi0 descriptor;

    static {
        evf evfVar = new evf();
        f8465a = evfVar;
        zna0 zna0Var = new zna0("org.xplatform.rules.api.data.models.CurrencyResponse", evfVar, 2);
        zna0Var.j("curId", true);
        zna0Var.j("vars", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0((jiy) ivf.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ivf.c;
        long jR = 0;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                map = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ivf(i, jR, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ivf ivfVar = (ivf) obj;
        ivfVar.getClass();
        Map map = ivfVar.b;
        long j = ivfVar.f15443a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ivf.c;
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 0, j);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
        } else {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            if (!Intrinsics.d(map, lunVar)) {
                cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
            }
        }
        cldVarA.c(ugi0Var);
    }
}
